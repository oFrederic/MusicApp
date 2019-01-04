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

        songs.add(new Song(getString(R.string.can_you_feel_it), getString(R.string.the_jacksons)));
        songs.add(new Song(getString(R.string.hottest_christmas_on_record), getString(R.string.bob_alloy)));
        songs.add(new Song(getString(R.string.down_the_road), getString(R.string.chuggin_edits)));
        songs.add(new Song(getString(R.string.no_money_no_problems), getString(R.string.big_daddy)));
        songs.add(new Song(getString(R.string.white_christmas), getString(R.string.the_drifters)));
        songs.add(new Song(getString(R.string.wild_thing), getString(R.string.tone_loc)));
        songs.add(new Song(getString(R.string.do_your_thing), getString(R.string.basement_jaxx)));
        songs.add(new Song(getString(R.string.rapper_delight), getString(R.string.the_sugarhill_gang)));
        songs.add(new Song(getString(R.string.a_fifth_of_beethoven), getString(R.string.walther_murphy)));
        songs.add(new Song(getString(R.string.the_christmas_song), getString(R.string.james_brown)));
        songs.add(new Song(getString(R.string.i_ve_got_a_women), getString(R.string.ray_charles)));
        songs.add(new Song(getString(R.string.i_know_you_got_soul), getString(R.string.eric_rakim_norman)));
        songs.add(new Song(getString(R.string.september), getString(R.string.earth_wind_fire)));
        songs.add(new Song(getString(R.string.just_an_other_christmas_song), getString(R.string.sharon_dap_kings)));
        songs.add(new Song(getString(R.string.i_wish), getString(R.string.skeelo)));
        songs.add(new Song(getString(R.string.jungle_boogie), getString(R.string.kool_and_the_gang)));
        songs.add(new Song(getString(R.string.christmas_in_hollies), getString(R.string.dmc)));
        songs.add(new Song(getString(R.string.appache), getString(R.string.bongo_band)));
        songs.add(new Song(getString(R.string.that_the_way), getString(R.string.sunshine_band)));
        songs.add(new Song(getString(R.string.jingle_bells), getString(R.string.soulful_string)));
        songs.add(new Song(getString(R.string.show_the_world), getString(R.string.sees)));
        songs.add(new Song(getString(R.string.let_go_round_again), getString(R.string.white_band)));
        songs.add(new Song(getString(R.string.oh_yeah), getString(R.string.ungly_duckling)));
        songs.add(new Song(getString(R.string.sir_duke), getString(R.string.stevie_wonder)));
        songs.add(new Song(getString(R.string.nothing_from_nothing), getString(R.string.billy_preston)));
        songs.add(new Song(getString(R.string.night_fever), getString(R.string.bee_gees)));
        songs.add(new Song(getString(R.string.im_coming_out), getString(R.string.diana_ross)));

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
