package com.example.nomsafelistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView lvProducts;
    private AllergenListAdapter adapter;
    private List<Allergen> mAllergensList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProducts = (ListView)findViewById(R.id.allergens);

        mAllergensList = new ArrayList();
        //Add sample data for list
        //We can get data from db, webservice here
        mAllergensList.add(new Allergen("Peanuts"));

        //Init adapter
        adapter = new AllergenListAdapter(getApplicationContext(), mAllergensList);
        lvProducts.setAdapter(adapter);

        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
            }
        });

    }
}
