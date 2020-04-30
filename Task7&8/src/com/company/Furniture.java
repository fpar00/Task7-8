package com.company;

public class Furniture {
    public static int price;
    public static String name;
    private static double VATpercentage;

    Furniture(String name, int price){
        this.name = name;
        this.price = price;
    }

    public static double getVATpercentage() {
        return VATpercentage;
    }

    public double getPriceWithVat (){
        double x = price * VATpercentage;
        return x;
    }

    public double getPriceNoVat (){
        return price;
    }

    public static int getPrice() {
        return price;
    }

    public static void setVATpercentage(double VATpercentage) {
        Furniture.VATpercentage = VATpercentage;
    }
}
