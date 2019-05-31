package com.example.customlistview;

import android.content.ClipData;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends ArrayAdapter<item>
{
    ArrayList<item> animalList= new ArrayList<>();
    public MyAdapter(Context context,int textViewResourceId,ArrayList<item> objects)
    {
            super(context,textViewResourceId,objects);
            animalList=objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //layout inflater is used to fit the items from ACTUAL SIZE TO in small
        v=inflater.inflate(R.layout.item,null);
        TextView textView=(TextView)v.findViewById(R.id.textView);
        ImageView imageView=(ImageView)v.findViewById(R.id.imageView);
        textView.setText(animalList.get(position).getAnimalName());
        imageView.setImageResource(animalList.get(position).getAnimalImage());
        return v;
    }
}