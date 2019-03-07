package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;
import static android.R.id.list;

/**
 * Created by yuxia on 10/19/16.
 */

public class GuideAdapter extends ArrayAdapter<Guide> {
    public GuideAdapter(Context context, ArrayList<Guide> guide) {
        super(context, 0, guide);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Guide currentGuide = getItem(position);
        TextView nameTextView = (TextView)listItemView.findViewById(R.id.name);
        nameTextView.setText(currentGuide.getName());
        TextView locationTextView = (TextView)listItemView.findViewById(R.id.location);
        locationTextView.setText(currentGuide.getLoaction());
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        phoneTextView.setText(currentGuide.getPhone());
        ImageView locationPic = (ImageView) listItemView.findViewById(R.id.imageView);
        if(currentGuide.hasImage()){
            locationPic.setImageResource(currentGuide.getImageId());
        } else locationPic.setVisibility(View.GONE);
        return listItemView;
    }
}
