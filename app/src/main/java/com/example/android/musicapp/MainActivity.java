package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playLists = (Button) findViewById(R.id.playlist_button);
        Button pause = (Button) findViewById(R.id.pause_button);

        playLists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent playListIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "The song is on pause", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
