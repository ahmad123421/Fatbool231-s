package com.example.hp1.fatbool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class Teams2 extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView ;
    ArrayAdapter<String> adapter;
    ArrayList<String> teams = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams2);

        teams.add("FC Barcelona");
        teams.add( "Real Madrid");
        teams.add("Bayern");
        teams.add("Manchester United");
        teams.add("Borussia Dortmund");
        listView = (ListView) findViewById(R.id.lvTeams);
        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,teams);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(this,TeamsInfo.class);

        i.putExtra("team",position);
        startActivity(i);
    }
}
