package com.example.appsimonline.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appsimonline.Buyers.HomeActivity;
import com.example.appsimonline.Buyers.MainActivity;
import com.example.appsimonline.R;

public class AdminHomeActivity extends AppCompatActivity {
    private Button logoutBtn, CheckOrderBtn, maitainproductsBtn, approveNewProductsBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin_home );


        logoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrderBtn = (Button) findViewById(R.id.check_orders_btn);
        maitainproductsBtn = (Button) findViewById( R.id.maintain_btn );
        approveNewProductsBtn = (Button) findViewById( R.id.admin_approve_new_product );

        maitainproductsBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, HomeActivity.class);
                intent.putExtra( "Admin", "Admin" );
                startActivity(intent);
            }
        } );


        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomeActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        approveNewProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, AdminCheckNewProductsActivity.class);
                startActivity(intent);

            }
        });
    }
}
