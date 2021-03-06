package com.example.recommendationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.recommendationapp.fragments.ComposeFragment;
import com.example.recommendationapp.fragments.DiaryFragment;
import com.example.recommendationapp.fragments.PostsFragment;
import com.example.recommendationapp.fragments.ProfileFragment;
import com.example.recommendationapp.fragments.ViewDiary;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";


    private BottomNavigationView bottomNavigationView ;

    final FragmentManager fragmentManager = getSupportFragmentManager() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation) ;



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.action_diary:
                        Toast.makeText(MainActivity.this,"diary", Toast.LENGTH_SHORT).show();
                        fragment = new ViewDiary() ;
                        break;
                    case R.id.action_postdiary:
                        Toast.makeText(MainActivity.this,"post diary", Toast.LENGTH_SHORT).show();
                        fragment = new DiaryFragment() ;
                        break;
                    case R.id.action_Profile:
                        Toast.makeText(MainActivity.this,"profile", Toast.LENGTH_SHORT).show();
                        fragment = new ProfileFragment() ;
                        break;
                    case R.id.action_home:
                        Toast.makeText(MainActivity.this,"home", Toast.LENGTH_SHORT).show();
                        fragment = new PostsFragment() ;
                        break;
                    case R.id.action_compose:
                    default:
                        Toast.makeText(MainActivity.this,"compose", Toast.LENGTH_SHORT).show();
                        fragment = new ComposeFragment() ;
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.action_compose);
    }

}