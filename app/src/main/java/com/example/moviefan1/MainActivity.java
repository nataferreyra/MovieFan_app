package com.example.moviefan1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.SearchView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    SearchView search_view;

}