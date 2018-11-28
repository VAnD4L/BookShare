package com.example.bookshare.bookshare;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private RecyclerView postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // add a function to add the 4 latest read books's covers as image buttons for new_books_slider
        // + make the slider dynamic size
        // add a function to add the 4 latest active friends's profile photos as image buttons for last_friends_slider
        // + make the slider dynamic size
        setContentView(R.layout.activity_main);
        drawerLayout =  findViewById(R.id.drawable_layout);
        navigationView =  findViewById(R.id.navigation_view);
        View navView =  navigationView.inflateHeaderView(R.layout.navigation_header); // TODO add imageButton to link into profile


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                UserMenuSelector(item);
                return false;
            }
        });
    }

    private void UserMenuSelector(MenuItem item){
        switch (item.getItemId())
        {
            case R.id.nav_Post:
                Toast.makeText(this,"Post",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_home:
                Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_library:
                Toast.makeText(this,"Library",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_friends:
                Toast.makeText(this,"Friends",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_find_friends:
                Toast.makeText(this,"Find Friends",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_messages:
                Toast.makeText(this,"Messages",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_settings:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_Logout:
                Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
                break;
        }
    }



}
