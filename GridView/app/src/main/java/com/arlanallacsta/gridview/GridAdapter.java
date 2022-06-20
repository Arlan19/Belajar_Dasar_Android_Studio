package com.arlanallacsta.gridview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    private static final String TAG = "GridAdapter";

    private Context mContext;

    @Override
    public int getCount() {
        return thumbnail.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbnail[position]);
        return imageView;
    }

    public GridAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public Integer[] thumbnail = {
            R.drawable.ic_baseline_email_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_perm_contact_calendar_24,
            R.drawable.ic_baseline_photo_24,
            R.drawable.ic_round_android_24,
            R.drawable.ic_round_person_24,
            R.drawable.ic_baseline_login_24,
            R.drawable.ic_baseline_web_24,
    };


}
