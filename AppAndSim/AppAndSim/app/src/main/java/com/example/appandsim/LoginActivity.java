package com.example.appandsim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appandsim.Model.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton;
    private ProgressDialog loadingBar;

    private String parentDbName = "Users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button) findViewById(R.id.login_btn);
        InputPassword = (EditText) findViewById(R.id.login_password_input);
        InputPhoneNumber = (EditText) findViewById(R.id.login_phone_number_input);
        loadingBar = new ProgressDialog(this);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginUser();
            }
        });
    }
        private void LoginUser()
        {
            String phone = InputPhoneNumber.getText().toString();
            String password = InputPassword.getText().toString();


            if (TextUtils.isEmpty(phone))
            {
                Toast.makeText(this, "Dien so dien thoai", Toast.LENGTH_SHORT).show();
            }
            else if (TextUtils.isEmpty(password))
            {
                Toast.makeText(this, "Dien mat khau ", Toast.LENGTH_SHORT).show();
            }
            else
            {
                loadingBar.setTitle("Dang nhap tai khoan");
                loadingBar.setMessage("Cho chut! He thong dang xet duyet ");
                loadingBar.setCanceledOnTouchOutside(false);
                loadingBar.show();

                AllowAccessToAccount(phone,password);
            }
        }

        private void AllowAccessToAccount(final String phone, final String password)
        {
            final DatabaseReference RootRef;
            RootRef = FirebaseDatabase.getInstance().getReference();

            RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                {
                    if(dataSnapshot.child(parentDbName).child(phone).exists())
                    {
                        Users usersData = dataSnapshot.child(parentDbName).child(phone).getValue(Users.class);

                        if(usersData.getPhone().equals(phone))
                        {
                            if(usersData.getPassword().equals(password))
                            {
                                Toast.makeText(LoginActivity.this, "Dang nhap thanh cong!!", Toast.LENGTH_SHORT).show();
                                loadingBar.dismiss();

                                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                                startActivity(intent);
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, "Tai khoan voi so dien thoai khong ton tai!!", Toast.LENGTH_SHORT).show();
                        loadingBar.dismiss();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        }
}

