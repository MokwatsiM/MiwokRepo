package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("minto wuksus?","Where are you going?"));
        words.add(new Word("tinna oyaase'na?","what is your name?"));
        words.add(new Word("oyaaset...","My name is...?"));
        words.add(new Word("michaksas?","How are you feeling?"));
        words.add(new Word("kuchi achit","I'm feeling good"));
        words.add(new Word("aanas'aa?","Are you comming?"));
        words.add(new Word("haa'aanam","yes, i'm coming"));
//        words.add(new Word("kawinta","eight"));
//        words.add(new Word("wo'e","nine"));
//        words.add(new Word("na'aacha","ten"));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);





    }
}
