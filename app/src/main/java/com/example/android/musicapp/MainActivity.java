package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Display the song selected on the screen.
         */
        String name = "";
        Intent intent = getIntent();

        TextView artist = findViewById(R.id.now_playing_artist);
        // we should always check if an Intent has extras before extracting them, to prevent exception error
        if (intent.getExtras() != null) {
            // we should always check if an Intent has the specific extra key before extracting it, to prevent exception error
            if (intent.hasExtra("artist")) {
                name = intent.getStringExtra("artist");
                artist.setText(name);
            }
        }

        TextView song = findViewById(R.id.now_playing_song);
        if (intent.getExtras() != null) {
            if (intent.hasExtra("song")) {
                name = intent.getStringExtra("song");
                song.setText(name);
            }
        }

        /**
         * display a Toast message to show what the button would do if it was a finished app.
         */
        Button play = findViewById(R.id.play_button);
        play.setOnClickListener(this);
        Button previous = findViewById(R.id.previous_button);
        previous.setOnClickListener(this);
        Button next = findViewById(R.id.next_button);
        next.setOnClickListener(this);
        Button pause = findViewById(R.id.pause_button);
        pause.setOnClickListener(this);
        Button playLists = findViewById(R.id.playlist_button);
        playLists.setOnClickListener(this);
        Button option = findViewById(R.id.option_button);
        option.setOnClickListener(this);

    }

    /**
     *Override method from the View.onClickListener that setup an onClickListener for Multiple Buttons.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.play_button:
                Toast.makeText(getApplicationContext(), "The song is now playing", Toast.LENGTH_SHORT).show();
                break;

            case R.id.previous_button:
                Toast.makeText(getApplicationContext(), "The previous song is now selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.next_button:
                Toast.makeText(getApplicationContext(), "The next song is now selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.pause_button:
                Toast.makeText(getApplicationContext(), "The song is now on pause", Toast.LENGTH_SHORT).show();
                break;

            case R.id.playlist_button:
                Intent playListIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playListIntent);
                break;

            case R.id.option_button:
                Toast.makeText(getApplicationContext(), "There is no option available at the moment", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}