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

        Button play = (Button) findViewById(R.id.play_button);
        Button previous = (Button) findViewById(R.id.previous_button);
        Button next = (Button) findViewById(R.id.next_button);
        Button pause = (Button) findViewById(R.id.pause_button);
        Button playLists = (Button) findViewById(R.id.playlist_button);
        Button option = (Button) findViewById(R.id.option_button);


        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "The song is now playing", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "The previous song is now selected", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "The next song is now selected", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "The song is on pause", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        playLists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent playListIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);
            }
        });

        option.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "No option at the moment", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
