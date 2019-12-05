package com.example.appsimonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView sim3g, sim4g, sim5g, simsodep;
    private Button LogoutBtn, CheckOrderBtn;
//    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
//    private ImageView headPhonesHandFree, Laptops, watches, mobilePhones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrderBtn = (Button) findViewById(R.id.check_orders_btn);

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });


        sim3g = (ImageView) findViewById(R.id.sim3g);
        sim4g = (ImageView) findViewById(R.id.sim4g);
//        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        sim5g = (ImageView) findViewById(R.id.sim5g);

//        glasses = (ImageView) findViewById(R.id.glasses);
//        hatsCaps = (ImageView) findViewById(R.id.hats_caps);
//        walletsBagsPurses = (ImageView) findViewById(R.id.purses_bags_wallets);
        simsodep = (ImageView) findViewById(R.id.simsodep);

//        headPhonesHandFree = (ImageView) findViewById(R.id.headphones_handfree);
//        Laptops = (ImageView) findViewById(R.id.laptop_pc);
//        watches = (ImageView) findViewById(R.id.watches);
//        mobilePhones = (ImageView) findViewById(R.id.mobilephones);


        sim3g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sim3g");
                startActivity(intent);
            }
        });


        sim4g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sim4g");
                startActivity(intent);
            }
        });


//        femaleDresses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Female Dresses");
//                startActivity(intent);
//            }
//        });


        sim5g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sim5g");
                startActivity(intent);
            }
        });


//        glasses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Glasses");
//                startActivity(intent);
//            }
//        });
//
//
//        hatsCaps.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Hats Caps");
//                startActivity(intent);
//            }
//        });
//
//
//
//        walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Wallets Bags Purses");
//                startActivity(intent);
//            }
//        });
//
//
        simsodep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sim số đẹp");
                startActivity(intent);
            }
        });
//
//
//
//        headPhonesHandFree.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "HeadPhones HandFree");
//                startActivity(intent);
//            }
//        });
//
//
//        Laptops.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Laptops");
//                startActivity(intent);
//            }
//        });
//
//
//        watches.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Watches");
//                startActivity(intent);
//            }
//        });
//
//
//        mobilePhones.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Mobile Phones");
//                startActivity(intent);
//            }
//        });
    }
}
