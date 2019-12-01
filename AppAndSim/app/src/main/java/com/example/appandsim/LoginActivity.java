package com.example.appandsim;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.rey.material.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appandsim.Model.Users;
import com.example.appandsim.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.io.Writer;
import java.util.jar.Attributes;

import io.paperdb.Paper;

public class LoginActivity extends AppCompatActivity {

    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton;
    private ProgressDialog loadingBar;
    private TextView AdminLink, NotAdminLink;

    private String parentDbName = "Users";
    private CheckBox chkBoxRememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button) findViewById(R.id.login_btn);
        InputPassword = (EditText) findViewById(R.id.login_password_input);
        InputPhoneNumber = (EditText) findViewById(R.id.login_phone_number_input);
        AdminLink = (TextView) findViewById(R.id.admin_panel_link);
        NotAdminLink = (TextView) findViewById(R.id.not_admin_panel_link);
        loadingBar = new ProgressDialog(this);

        chkBoxRememberMe =  (CheckBox) findViewById(R.id.remember_me_chkb);
        Paper.init(this);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginUser();
            }
        });

        AdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginButton.setText("Đăng nhập Admin");
                AdminLink.setVisibility(View.VISIBLE);
                NotAdminLink.setVisibility(View.VISIBLE);
                parentDbName = "Admins";
            }
        });

        NotAdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButton.setText("Đăng nhập");
                AdminLink.setVisibility(View.VISIBLE);
                NotAdminLink.setVisibility(View.VISIBLE);
                parentDbName = "Users";

            }
        });
    }
        private void LoginUser()
        {
            String phone = InputPhoneNumber.getText().toString();
            String password = InputPassword.getText().toString();


            if (TextUtils.isEmpty(phone))
            {
                Toast.makeText(this, "Điền số điện thoại", Toast.LENGTH_SHORT).show();
            }
            else if (TextUtils.isEmpty(password))
            {
                Toast.makeText(this, "Điền mật khẩu ", Toast.LENGTH_SHORT).show();
            }
            else
            {
                loadingBar.setTitle("Đăng nhập tài khoản");
                loadingBar.setMessage("Chờ chút!! Hệ thống đang xét duyệt ");
                loadingBar.setCanceledOnTouchOutside(false);
                loadingBar.show();

                AllowAccessToAccount(phone,password);
            }
        }

        private void AllowAccessToAccount(final String phone, final String password)
        {
            if (chkBoxRememberMe.isChecked())
            {
                Paper.book().write(Prevalent.UserPhoneKey, phone);
                Paper.book().write(Prevalent.UserPasswordKey, password);
            }

            final DatabaseReference RootRef;
            RootRef = FirebaseDatabase.getInstance().getReference();

            RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.child(parentDbName).child(phone).exists()) {
                        Users usersData = dataSnapshot.child(parentDbName).child(phone).getValue(Users.class);

                        if (usersData.getPhone().equals(phone)) {
                            if (usersData.getPassword().equals(password)) {
                                if(parentDbName.equals("Admins"))
                                {
                                    Toast.makeText(LoginActivity.this, "Chào mừng Admin!! Bạn đã truy câp ADMIN...", Toast.LENGTH_SHORT).show();
                                    loadingBar.dismiss();

                                    Intent intent = new Intent(LoginActivity.this, AdminCategoryActivity.class);
                                    startActivity(intent);
                                }
                                else if (parentDbName.equals("Users"))
                                {
                                    Toast.makeText(LoginActivity.this, "Đăng nhập người dùng" +phone+ "thành công!!", Toast.LENGTH_SHORT).show();
                                    loadingBar.dismiss();

                                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                                    startActivity(intent);
                                }
                            }
                        }
                    } else {
                        loadingBar.dismiss();
                        Toast.makeText(LoginActivity.this, "Mật khẩu chưa đúng!!", Toast.LENGTH_SHORT).show();
                    }
                }



                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        }
}

