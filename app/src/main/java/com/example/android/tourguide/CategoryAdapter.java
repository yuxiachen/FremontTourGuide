package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by yuxia on 10/20/16.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new SchoolFragment();
        } else if (position == 2) {
            return new ChineseRestFragment();
        } else {
            return new HotelFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attractions_tab);
        } else if (position == 1) {
            return mContext.getString(R.string.school_tab);
        } else if (position == 2) {
            return mContext.getString(R.string.chinese_Rest_tab);
        } else {
            return mContext.getString(R.string.hotel_tab);
        }
    }
}
