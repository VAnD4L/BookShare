package com.example.bookshare.bookshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // add a function to add the 4 latest read books's covers as image buttons for new_books_slider
        // + make the slider dynamic size
        // add a function to add the 4 latest active friends's profile photos as image buttons for last_friends_slider
        // + make the slider dynamic size
        setContentView(R.layout.activity_main);
    }
}
