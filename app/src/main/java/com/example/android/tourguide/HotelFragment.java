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

public class HotelFragment extends Fragment {
    public HotelFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);
        ArrayList<Guide> guide = new ArrayList<>();
        guide.add(new Guide(this.getString(R.string.hotel_name_1), this.getString(R.string.hotel_location_1), this.getString(R.string.hotel_phone_1)));
        guide.add(new Guide(this.getString(R.string.hotel_name_2), this.getString(R.string.hotel_location_2), this.getString(R.string.hotel_phone_2)));
        guide.add(new Guide(this.getString(R.string.hotel_name_3), this.getString(R.string.hotel_location_3), this.getString(R.string.hotel_phone_3)));
        guide.add(new Guide(this.getString(R.string.hotel_name_4), this.getString(R.string.hotel_location_4), this.getString(R.string.hotel_phone_4)));
        guide.add(new Guide(this.getString(R.string.hotel_name_5), this.getString(R.string.hotel_location_5), this.getString(R.string.hotel_phone_5)));
        guide.add(new Guide(this.getString(R.string.hotel_name_6), this.getString(R.string.hotel_location_6), this.getString(R.string.hotel_phone_6)));
        guide.add(new Guide(this.getString(R.string.hotel_name_7), this.getString(R.string.hotel_location_7), this.getString(R.string.hotel_phone_7)));
        guide.add(new Guide(this.getString(R.string.hotel_name_8), this.getString(R.string.hotel_location_8), this.getString(R.string.hotel_phone_8)));
        guide.add(new Guide(this.getString(R.string.hotel_name_9), this.getString(R.string.hotel_location_9), this.getString(R.string.hotel_phone_9)));
        guide.add(new Guide(this.getString(R.string.hotel_name_10), this.getString(R.string.hotel_location_10), this.getString(R.string.hotel_phone_10)));
        guide.add(new Guide(this.getString(R.string.hotel_name_11), this.getString(R.string.hotel_location_11), this.getString(R.string.hotel_phone_11)));
        guide.add(new Guide(this.getString(R.string.hotel_name_12), this.getString(R.string.hotel_location_12), this.getString(R.string.hotel_phone_12)));
        guide.add(new Guide(this.getString(R.string.hotel_name_13), this.getString(R.string.hotel_location_13), this.getString(R.string.hotel_phone_13)));
        guide.add(new Guide(this.getString(R.string.hotel_name_14), this.getString(R.string.hotel_location_14), this.getString(R.string.hotel_phone_14)));
        guide.add(new Guide(this.getString(R.string.hotel_name_15), this.getString(R.string.hotel_location_15), this.getString(R.string.hotel_phone_15)));
        guide.add(new Guide(this.getString(R.string.hotel_name_16), this.getString(R.string.hotel_location_16), this.getString(R.string.hotel_phone_16)));
        guide.add(new Guide(this.getString(R.string.hotel_name_17), this.getString(R.string.hotel_location_17), this.getString(R.string.hotel_phone_17)));
        guide.add(new Guide(this.getString(R.string.hotel_name_18), this.getString(R.string.hotel_location_18), this.getString(R.string.hotel_phone_18)));




        GuideAdapter adapter = new GuideAdapter(getActivity(), guide);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
