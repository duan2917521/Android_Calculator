package com.example.leo.calaulator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Leo on 2016/6/14.
 */
public class MenuAdapter extends ArrayAdapter<Menu>{
    private int resourceID;
    public MenuAdapter(Context context,int textViewResourceID,List<Menu> objects){
        super(context,textViewResourceID,objects);
        resourceID = textViewResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Menu menu = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID,null);
        ImageView itemImage = (ImageView) view.findViewById(R.id.item_image);
        TextView itemName = (TextView)view.findViewById(R.id.item_name);
        itemImage.setImageResource(menu.getImageID());
        itemName.setText(menu.getName());
        return view;
    }
}


