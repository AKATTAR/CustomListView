package com.example.customlistview;

public class item {
    String animalName;
    int animalImage;

    public item(String animalName,int animalImage)
    {
        this.animalImage=animalImage;
        this.animalName=animalName;
    }
    public String getAnimalName()
    {
        return  animalName;
    }
    public int getAnimalImage()
    {
        return animalImage;
    }
}