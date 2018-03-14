package com.project.muliains.c_probstat.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v4.view.ViewPager;

import com.project.muliains.c_probstat.Materi;
import com.project.muliains.c_probstat.MateriAdapter;
import com.project.muliains.c_probstat.R;
import com.project.muliains.c_probstat.SlideAdapter;
import me.relex.circleindicator.CircleIndicator;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView  rv;
    MateriAdapter adapter;
    List<Materi> listMateri;

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] img= {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};
    private ArrayList<Integer> imglist = new ArrayList<Integer>();


    Integer[] listImg= {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img4,
            R.drawable.img3,
};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        rv = findViewById(R.id.rv_materi);

        listMateri = new ArrayList<>();
        adapter = new MateriAdapter(this, listMateri, listImg);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);

        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);

        dataMateri();
        init();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_peluang) {
            Intent intent = new Intent(this,MateriActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void dataMateri(){
        Materi a=new Materi("Peluang", "Dalam kehidupan sehari-hari ...");
        listMateri.add(a);

        Materi b=new Materi("Permutasi Siklis", "Adalah permutasi yang disusun  ...");
        listMateri.add(b);

        Materi c=new Materi("Distribusi Poison", "Sumbu aksis adalah ...");
        listMateri.add(c);

        Materi d=new Materi("Statistika", "ilmu yang mempelajari");
        listMateri.add(d);


    }

    private void init() {
        for(int i=0;i<img.length;i++)
            imglist.add(img[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new SlideAdapter(imglist,MainActivity.this));
        CircleIndicator indicator =  findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == img.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);
    }
}
