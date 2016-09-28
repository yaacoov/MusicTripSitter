package com.appdvl.musictripsitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMusicFragment();
    }

    private void showMusicFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.musicFragment, new MusicFragment())
                .commit();
    }
}
