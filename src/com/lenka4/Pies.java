package com.lenka4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pies {
    private String name;
    private Date birthDate;
    private Float weight;
    private String ownerName;

    public Pies(String name, Date birthDate, Float weight, String ownerName) {
        this.name = name;
        this.birthDate = birthDate;
        this.weight = weight;
        this.ownerName = ownerName;
    }

    public String nameYourSelf() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(birthDate);

        String result = name +" "+ formattedDate +" "+ weight +" "+ ownerName;
        return result;
    }
}

