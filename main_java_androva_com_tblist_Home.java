package androva.com.tblist;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
ImageButton ib1,ib2,ib3,ib4,ib5,ib6;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
ib1= (ImageButton) findViewById(R.id.imageButton);
        ib2= (ImageButton) findViewById(R.id.imageButton2);
        ib3= (ImageButton) findViewById(R.id.imageButton3);
        ib4= (ImageButton) findViewById(R.id.imageButton4);
        ib5= (ImageButton) findViewById(R.id.imageButton5);
        ib6= (ImageButton) findViewById(R.id.imageButton6);
        ib2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Home.this, Menulist.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                            ib2.setAlpha(100);
                        break;
                    }


                }
return false;
            }
        });
        ib4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Home.this, Map.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        ib4.setAlpha(100);
                        break;
                    }


                }
                return false;
            }
        });
        ib3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Home.this, Menulist.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        ib3.setAlpha(100);
                        break;
                    }


                }
                return false;
            }
        });
        ib1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Home.this, Main2Activity.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        ib1.setAlpha(100);
                        break;
                    }


                }
                return false;
            }
        });
        ib6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Home.this, ChartslectedItem.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        ib3.setAlpha(100);
                        break;
                    }


                }
                return false;
            }
        });
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
       /* GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new Buttoadapter(this));
gridview.setNumColumns(2);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Home.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });*/
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
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.findus) {
Intent intent=new Intent(Home.this,Map.class);
            startActivity(intent);
        } else if (id == R.id.christmatch) {
            Intent intent=new Intent(Home.this,Menulist.class);
            startActivity(intent);
        } else if (id == R.id.menu) {
            Intent intent=new Intent(Home.this,Menulist.class);
            startActivity(intent);
        } else if (id == R.id.profile) {
            Intent intent=new Intent(Home.this,Main2Activity.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
