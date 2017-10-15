package com.example.edsnowden.guidemanasikumrah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by edSnowden on 10/15/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    WordAdapter(Context context, ArrayList<Word> doa) {
        super(context, 0, doa);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_doa_thawaf, parent, false);
        }

        Word currentWord = getItem(position);

        //TextView Subtitle
        TextView title = (TextView) listItemView.findViewById(R.id.title);

        title.setText(currentWord.getmSubtitle());

        //TextView Title
        TextView subtitle = (TextView) listItemView.findViewById(R.id.subtitle);

        subtitle.setText(currentWord.getmTitle());

        return listItemView;
    }
}
