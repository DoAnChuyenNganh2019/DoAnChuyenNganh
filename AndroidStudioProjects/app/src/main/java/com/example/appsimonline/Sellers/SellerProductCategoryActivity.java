package com.example.appsimonline.Sellers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.appsimonline.R;

public class SellerProductCategoryActivity extends AppCompatActivity {

    private ImageView sim3g, sim4g, sim5g, simsodep;
//    private Button LogoutBtn, CheckOrderBtn, maitainproductsBtn;
//    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
//    private ImageView headPhonesHandFree, Laptops, watches, mobilePhones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_seller_product_category );

//
//


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
                Intent intent = new Intent( SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Sim3g");
                startActivity(intent);
            }
        });


        sim4g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent( SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Sim4g");
                startActivity(intent);
            }
        });


//        femaleDresses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
//                intent.putExtra("category", "Female Dresses");
//                startActivity(intent);
//            }
//        });


        sim5g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent( SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Sim5g");
                startActivity(intent);
            }
        });


//        glasses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
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
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
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
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
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
                Intent intent = new Intent( SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
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
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
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
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
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
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
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
//                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
//                intent.putExtra("category", "Mobile Phones");
//                startActivity(intent);
//            }
//        });
    }
}
