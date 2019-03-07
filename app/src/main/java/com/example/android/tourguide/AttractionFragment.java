package com.example.android.tourguide;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by yuxia on 10/19/16.
 */

public class AttractionFragment extends Fragment {
    public AttractionFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);
        ArrayList<Guide> guide = new ArrayList<>();
        guide.add(new Guide(this.getString(R.string.attraction_name_1), this.getString(R.string.attraction_location_1), this.getString(R.string.attraction_phone_1), R.drawable.attraction_1));
        guide.add(new Guide(this.getString(R.string.attraction_name_2), this.getString(R.string.attraction_location_2), this.getString(R.string.attraction_phone_2), R.drawable.attraction_2));
        guide.add(new Guide(this.getString(R.string.attraction_name_3), this.getString(R.string.attraction_location_3), this.getString(R.string.attraction_phone_3), R.drawable.attraction_3));
        guide.add(new Guide(this.getString(R.string.attraction_name_4), this.getString(R.string.attraction_location_4), this.getString(R.string.attraction_phone_4), R.drawable.attraction_4));
        guide.add(new Guide(this.getString(R.string.attraction_name_5), this.getString(R.string.attraction_location_5), this.getString(R.string.attraction_phone_5), R.drawable.attraction_5));
        guide.add(new Guide(this.getString(R.string.attraction_name_6), this.getString(R.string.attraction_location_6), this.getString(R.string.attraction_phone_6), R.drawable.attraction_6));
        guide.add(new Guide(this.getString(R.string.attraction_name_7), this.getString(R.string.attraction_location_7), this.getString(R.string.attraction_phone_7), R.drawable.attraction_7));
        guide.add(new Guide(this.getString(R.string.attraction_name_8), this.getString(R.string.attraction_location_8), this.getString(R.string.attraction_phone_8), R.drawable.attraction_8));


        GuideAdapter adapter = new GuideAdapter(getActivity(), guide);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
