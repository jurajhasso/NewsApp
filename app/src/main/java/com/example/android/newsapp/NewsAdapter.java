package com.example.android.newsapp;

/**
 * Created by XY on 24.5.2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        String title = currentNews.getTitle();

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        titleView.setText(title);

        String section = currentNews.getSection();

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);

        sectionView.setText(section);

        String published = currentNews.getWebPublicationDate();

        TextView publishedView = (TextView) listItemView.findViewById(R.id.published);

        publishedView.setText(published);

        return listItemView;
    }
}