package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("apa","father",R.drawable.family_father));
        words.add(new Word("ata","mother",R.drawable.family_mother));
        words.add(new Word("angsi","son",R.drawable.family_son));
        words.add(new Word("tune","daughter",R.drawable.family_daughter));
        words.add(new Word("taachi","older brother",R.drawable.family_older_brother));
        words.add(new Word("chalitti","young brother",R.drawable.family_younger_brother));
        words.add(new Word("tete","older sister",R.drawable.family_older_sister));
        words.add(new Word("kolliti","young sister",R.drawable.family_younger_sister));
        words.add(new Word("ama","granmother",R.drawable.family_grandmother));
        words.add(new Word("paapa","grandfather",R.drawable.family_grandfather));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);





    }
}
