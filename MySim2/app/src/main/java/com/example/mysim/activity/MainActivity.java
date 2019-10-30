package com.example.mysim.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.example.mysim.R;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerView;
    NavigationView navigationView;
    ListView listView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ActionBar();
        ActionViewFlipper();
    }

    private void ActionViewFlipper(){
        ArrayList<String> maquangcao = new ArrayList<>();
        maquangcao.add("C:\\Users\\GoldSea\\AndroidStudioProjects\\MySim2\\app\\src\\main\\java\\com\\example\\mysim\\img\\chon-sim-viettel-so-dep-sao-cho-dung-cach-min.png");
        maquangcao.add("C:\\Users\\GoldSea\\AndroidStudioProjects\\MySim2\\app\\src\\main\\java\\com\\example\\mysim\\img\\maxresdefault.jpg");
        maquangcao.add("C:\\Users\\GoldSea\\AndroidStudioProjects\\MySim2\\app\\src\\main\\java\\com\\example\\mysim\\img\\sim-4g-mobi-c90-mau-cuc-dep-mat-dang-duoc-phan-hoi-rat-tot.jpg");
        for(int i=0; i<maquangcao.size();i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.get().load(maquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
//        Animation animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
//        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
//        viewFlipper.setInAnimation(animation_slide_in);
//        viewFlipper.setInAnimation(animation_slide_out);
    }


    private void ActionBar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    private void Anhxa(){
        toolbar = (Toolbar) findViewById(R.id.toolbarmanhinhchinh);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewmanhinhchinh);
        navigationView = (NavigationView) findViewById(R.id.navigationview);
        listView = findViewById(R.id.listviewmanhinhchinh);
        drawerLayout = findViewById(R.id.drawerlayout);

    }
}
