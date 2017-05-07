package com.ibas.iahk30;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ibas on 07/05/2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemName;
    private final Integer[] itemImage;

    public CustomAdapter(Activity context,
                         String[] itemName,
                         Integer[] itemImage) {
        super(context, R.layout.my_list, itemName);
        this.context = context;
        this.itemName = itemName;
        this.itemImage = itemImage;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list,null,true);

        ImageView imageView = (ImageView)rowView.findViewById(
                R.id.gambar
        );
        TextView tvNama = (TextView)rowView.findViewById(
                R.id.nama
        );
        TextView tvDetail = (TextView)rowView.findViewById(
                R.id.detail
        );

        tvNama.setText(itemName[position]);
        tvDetail.setText("Detail dari " + itemName[position]);
        imageView.setImageResource(itemImage[position]);

        return rowView;
    }
}
