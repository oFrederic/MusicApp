package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Can You Feel It - Single Version", "The Jacksons"));
        songs.add(new Song("Hottest Christmas on Record", "Bop Alloy, Substantial, Marcus D"));
        songs.add(new Song("Down the Road", "Chuggin Edits"));
        songs.add(new Song("Mo Money Mo Problems (feat. Mase & Puff Daddy)", "The Notorious B.I.G., Mase & Puff Daddy"));
        songs.add(new Song("White Christmas", "The Drifters, Clyde McPhatter, Bill Pinckney"));
        songs.add(new Song("Wild Thing", "Tone-Loc"));
        songs.add(new Song("Do Your Thing", "Basement Jaxx"));
        songs.add(new Song("Rapper's Delight - Single Version", "The Sugarhill Gang"));
        songs.add(new Song("A Fifth Of Beethoven - 2007 Remastered Version Saturday Night Fever", "Walter Murphy"));
        songs.add(new Song("The Christmas Song", "James Brown"));
        songs.add(new Song("I've Got A Woman", "Ray Charles"));
        songs.add(new Song("I Know You Got Soul - The Double Trouble Remix", "Eric B. & Rakim, Norman Cook"));
        songs.add(new Song("September", "Earth, Wind & Fire"));
        songs.add(new Song("Just Another Christmas Song", "Sharon Jones & The Dap-Kings"));
        songs.add(new Song("I Wish - Radio Edit", "Skee-Lo"));
        songs.add(new Song("Jungle Boogie", "Kool & The Gang"));
        songs.add(new Song("Christmas In Hollis", "Run–D.M.C."));
        songs.add(new Song("Apache", "Incredible Bongo Band"));
        songs.add(new Song("That's the Way (I Like It)", "KC & The Sunshine Band"));
        songs.add(new Song("Jingle Bells", "The Soulful Strings"));
        songs.add(new Song("Show the World", "SeeS"));
        songs.add(new Song("Let's Go Round Again", "Average White Band"));
        songs.add(new Song("Oh Yeah", "Ugly Duckling"));
        songs.add(new Song("Sir Duke", "Stevie Wonder"));
        songs.add(new Song("Nothing From Nothing", "Billy Preston"));
        songs.add(new Song("Night Fever", "Bee Gees"));
        songs.add(new Song("I'm Coming Out", "Diana Ross"));

        ListView listView = (ListView) findViewById(R.id.list);

        SongAdapter adapter = new SongAdapter (this, songs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PlaylistActivity.this, MainActivity.class);
                Toast toast = Toast.makeText(getApplicationContext(), "The song selected is now playing", Toast.LENGTH_SHORT);
                toast.show();
                intent.putExtra("song", songs.get(position).getmTitlename());
                intent.putExtra("artist", songs.get(position).getmSingername());
                startActivity(intent);
            }
        });
    }
}
