package com.company;

public class Main {

    public static void main(String[] args) {
	Cake c = new Cake(4);

    System.out.println("Opskriften laver nok kage til " + c.getAntalPersoner() + " personer");
    System.out.println("Vægten er kagens ingredienser samlet er: " + c.getIngredientser() + " gram");
    System.out.println("Kagens vægt når den er bagt er ca: " + c.getKageVægt() + " gram");
    System.out.println("Kagens energi indhold i kJ er: " + c.getKageEnergi() + " kJ");
    }
}
