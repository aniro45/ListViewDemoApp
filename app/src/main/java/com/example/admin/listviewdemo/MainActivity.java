package com.example.admin.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        final ArrayList<String> myFamily =new  ArrayList<String>();

        myFamily.add("Aniket");
        myFamily.add("krish");
        myFamily.add("Abhijeet");
        myFamily.add("darshan");
        myFamily.add("Vishwajeet");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFamily);

          myListView.setAdapter(arrayAdapter);

          myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  Log.i("Person tapped", myFamily.get(position));
                  Toast.makeText(MainActivity.this, "Hello.." +(myFamily.get(position)), Toast.LENGTH_SHORT).show();

              }
          });
    }
}
