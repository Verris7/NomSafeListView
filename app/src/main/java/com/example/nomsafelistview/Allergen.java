package com.example.nomsafelistview;


import android.media.Image;

/**
 * Created by Wong on 1/16/2017.
 */

public class Allergen {
    private String allergen;

    //Constructor
    public Allergen(String allergen) {
        this.allergen = allergen;
    }

    //Setter, getter
    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }
}
