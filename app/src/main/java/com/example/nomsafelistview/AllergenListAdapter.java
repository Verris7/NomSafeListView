package com.example.nomsafelistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wong on 1/16/2017.
 */

public class AllergenListAdapter extends ArrayAdapter<Allergen>{
    private List<Allergen> AllergensList;

    //Constructor
    public AllergenListAdapter(Context Context, ArrayList<Allergen> AllergensList{
        super(Context, 0, AllergensList);
        this.AllergensList = AllergensList;
    }

    @Override
    public int getCount() {
        return AllergensList.size();
    }

    @Override
    public Object getItem(int position) {
        return AllergensList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(Context, R.layout.allergens_list,null);
        TextView allergen = (TextView)v.findViewById(R.id.allergen);
        //Set text for TextView
        allergen.setText(AllergensList.get(position).getAllergen());
        //Save allergen to tag
        return v;
    }
}
