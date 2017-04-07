package androva.com.tblist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class Menulist extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new Buttoadapter(this));
        gridview.setNumColumns(2);



        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Menulist.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });*/
         final ImageButton im1,im2,im3,im4,im5;
        im1= (ImageButton) findViewById(R.id.imageButton);
        im2= (ImageButton) findViewById(R.id.imageButton2);
        im3= (ImageButton) findViewById(R.id.imageButton3);
        im4= (ImageButton) findViewById(R.id.imageButton4);

        im1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Menulist.this, Tabb.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        im1.setAlpha(100);
                        break;
                    }


                }
                return false;            }
        });
        im2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Menulist.this, Tabb.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        im1.setAlpha(100);
                        break;
                    }


                }
                return false;            }
        });
        im3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Menulist.this, Tabb.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        im1.setAlpha(100);
                        break;
                    }


                }
                return false;            }
        });
        im4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())

                {
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(Menulist.this, Tabb.class);
                        startActivity(intent);
                        return true;
                    }
                    case MotionEvent.ACTION_DOWN:
                    {
                        im1.setAlpha(100);
                        break;
                    }


                }
                return false;            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.findus) {
            Intent intent=new Intent(Menulist.this,Map.class);
            startActivity(intent);
        } else if (id == R.id.christmatch) {
            Intent intent=new Intent(Menulist.this,Menulist.class);
            startActivity(intent);
        } else if (id == R.id.menu) {
            Intent intent=new Intent(Menulist.this,Menulist.class);
            startActivity(intent);
        } else if (id == R.id.profile) {
            Intent intent=new Intent(Menulist.this,Main2Activity.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
