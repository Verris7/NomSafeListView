package com.example.nomsafelistview;

/**
 * Created by Wong on 1/16/2017.
 */

public class Allergen {
    private int id;
    private String allergen;
    private String allergen2;

    //Constructor
    public Allergen(int id, String allergen, String allergen2) {
        this.id = id;
        this.allergen = allergen;
        this.allergen2 = allergen2;
    }

    //Setter, getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAllergen2() {
        return allergen2;
    }

    public void setAllergen2(String allergen2) {
        this.allergen2 = allergen2;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }
}
