package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

/**
 * Created by yuxia on 10/19/16.
 */

public class SchoolFragment extends Fragment {
    public SchoolFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);
        ArrayList<Guide> guide = new ArrayList<>();
        guide.add(new Guide(this.getString(R.string.school_name_1), this.getString(R.string.school_location_1), this.getString(R.string.school_phone_1)));
        guide.add(new Guide(this.getString(R.string.school_name_2), this.getString(R.string.school_location_2), this.getString(R.string.school_phone_2)));
        guide.add(new Guide(this.getString(R.string.school_name_3), this.getString(R.string.school_location_3), this.getString(R.string.school_phone_3)));
        guide.add(new Guide(this.getString(R.string.school_name_4), this.getString(R.string.school_location_4), this.getString(R.string.school_phone_4)));
        guide.add(new Guide(this.getString(R.string.school_name_5), this.getString(R.string.school_location_5), this.getString(R.string.school_phone_5)));
        guide.add(new Guide(this.getString(R.string.school_name_6), this.getString(R.string.school_location_6), this.getString(R.string.school_phone_6)));
        guide.add(new Guide(this.getString(R.string.school_name_7), this.getString(R.string.school_location_7), this.getString(R.string.school_phone_7)));
        guide.add(new Guide(this.getString(R.string.school_name_8), this.getString(R.string.school_location_8), this.getString(R.string.school_phone_8)));
        guide.add(new Guide(this.getString(R.string.school_name_9), this.getString(R.string.school_location_9), this.getString(R.string.school_phone_9)));
        guide.add(new Guide(this.getString(R.string.school_name_10), this.getString(R.string.school_location_10), this.getString(R.string.school_phone_10)));
        guide.add(new Guide(this.getString(R.string.school_name_11), this.getString(R.string.school_location_11), this.getString(R.string.school_phone_11)));

        GuideAdapter adapter = new GuideAdapter(getActivity(), guide);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
