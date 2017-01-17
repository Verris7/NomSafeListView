package com.example.nomsafelistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Wong on 1/16/2017.
 */

public class AllergenListAdapter extends BaseAdapter{
    private Context mContext;
    private List<Allergen> mAllergensList;

    //Constructor
    public AllergenListAdapter(Context mContext, List<Allergen> mAllergensList) {
        this.mContext = mContext;
        this.mAllergensList = mAllergensList;
    }

    @Override
    public int getCount() {
        return mAllergensList.size();
    }

    @Override
    public Object getItem(int position) {
        return mAllergensList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.allergens_list,null);
        TextView allergen = (TextView)v.findViewById(R.id.allergen);
        TextView allergen2 = (TextView)v.findViewById(R.id.allergen2);
        //Set text for TextView
        allergen.setText(mAllergensList.get(position).getAllergen());
        allergen2.setText(String.valueOf(mAllergensList.get(position).getAllergen2()));
        //Save allergen to tag
        v.setTag(mAllergensList.get(position).getId());
        return v;
    }
}
