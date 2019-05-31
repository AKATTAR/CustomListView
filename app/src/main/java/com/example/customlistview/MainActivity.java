package com.example.customlistview;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    ArrayList<item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList=findViewById(R.id.listview);
        animalList.add(new item("lion",R.drawable.lion));
        animalList.add(new item("Tiger",R.drawable.tiger));
        animalList.add(new item("Monkey",R.drawable.monkey));
        animalList.add(new item("Cat",R.drawable.cat));
        animalList.add(new item("Panda",R.drawable.panda));
        animalList.add(new item("Horse",R.drawable.horse));
        animalList.add(new item("Squirrel",R.drawable.squirrel));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.item,animalList);
        simpleList.setAdapter(myAdapter);
    }
}