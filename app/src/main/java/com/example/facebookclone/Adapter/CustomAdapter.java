package com.example.facebookclone.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.facebookclone.R;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {
    private Activity context;
    private List<String> memberList;

    public CustomAdapter(Activity context, List<String> memberList) {
        super(context, R.layout.sample_view, memberList);
        this.context = context;
        this.memberList = memberList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_view, null, true);

        TextView name = view.findViewById(R.id.countryName);
        TextView designation = view.findViewById(R.id.designation);
        ImageView img = view.findViewById(R.id.cardImageView);

        // You need to set the appropriate values from your memberList here
        String member = memberList.get(position);
        name.setText(member); // Set the name from your member list

        // Set other views like designation, availability, and image as needed

        return view;
    }
}
