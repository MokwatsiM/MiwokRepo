package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ekasilab on 09/11/2016.
 */

public class TempAdapter extends BaseAdapter {

    ArrayList<Word> list;
    Activity activity;
    LayoutInflater inflater;

    TextView engTextView, miwokTextView;
    ImageView mDisplayImage;
    private int mColorResourceID;

    public TempAdapter(Activity activity, ArrayList<Word> list, int category_numbers) {
        this.list = list;
        this.activity = activity;
        this.mColorResourceID = category_numbers;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Word getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        if(inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            engTextView = (TextView) convertView.findViewById(R.id.default_text_view);
            miwokTextView = (TextView) convertView.findViewById(R.id.miwok_text_view);
            mDisplayImage = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(getItem(position));
        }

       //Word word = list.get(position);
        Word word =  getItem(position);

        engTextView.setText(word.getmDefaultTranslation());
        miwokTextView.setText(word.getmMiwokTranslation());
        Glide.with(activity).load(word.getmImageResourceID()).crossFade().into(mDisplayImage);


        View textContainer = convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(activity, mColorResourceID);
        textContainer.setBackgroundColor(color);

        return convertView;
    }
}
