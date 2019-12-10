package com.example.appsimonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AdminMaintainProductsActivity extends AppCompatActivity {

    private Button applyChangeBtn;
    private EditText name, price, description;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin_maintain_products );

        applyChangeBtn = findViewById( R.id.apply_changes_btn );
        name = findViewById( R.id.product_name_maintain );
        price = findViewById( R.id.product_price_maintain );
        description = findViewById( R.id.product_description_maintain );
        imageView = findViewById( R.id.product_image_maintain );
    }
}