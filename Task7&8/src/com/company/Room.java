package com.company;

import java.util.ArrayList;

public class Room {
    public int area;

    public ArrayList<Furniture> furniture = new ArrayList();

    public ArrayList<Furniture> getFurniture(){
        this.furniture = furniture;
        return furniture;
    }

    public Room(ArrayList<Furniture> furniture, int Area) {
        this.furniture = furniture;
        this.area = area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getFurnituresPrice(String house) {
        double sum = 0d;
        for (Furniture furniture : furniture) {
            sum += furniture.getPriceWithVat();
        }
        return sum;

    }
}
