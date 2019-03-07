package com.example.android.tourguide;

import static android.R.attr.name;

/**
 * Created by yuxia on 10/19/16.
 */

public class Guide {
    private String mName;
    private String mLocation;
    private String mPhone;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageId = NO_IMAGE_PROVIDED;
    public Guide(String name, String location, String phone, int imageId) {
        mName = name;
        mLocation = location;
        mPhone = phone;
        mImageId = imageId;
    }

    public Guide(String name, String location, String phone) {
        mName = name;
        mLocation = location;
        mPhone = phone;
    }

    public String getName() {
        return mName;
    }
    public String getLoaction() {
        return mLocation;
    }
    public String getPhone() {
        return mPhone;
    }
    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}
