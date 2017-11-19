package com.example.hp1.fatbool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Highscores extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView ;
    ArrayAdapter<String> adapter;
    ArrayList<String> highscores = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores);
        highscores.add("World Cup");
        highscores.add("Champions League");
        highscores.add("Euro");
        listView = (ListView) findViewById(R.id.lvScores);
        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,highscores);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(this, HighscoresInfo.class);
        i.putExtra("highscores",position);
        startActivity(i);
    }
}
