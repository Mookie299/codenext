package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<CategoryItem> artist= new ArrayList<>();
        artist.add(new CategoryItem("Kid Cudi", R.drawable.cudi));
        artist.add(new CategoryItem("Gunna", R.drawable.gunna));
        artist.add(new CategoryItem("Rihanna", R.drawable.rihanna));
        artist.add(new CategoryItem("YoungBoy", R.drawable.youngboy));
    }

    ListView artistListview = findViewById(R.id.artist_listview);
    CategoryAdapter artistAdapter = new CategoryAdapter(this, artist);
    artistListview.setAdapter(artistAdapter);

}
