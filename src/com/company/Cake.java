package com.company;

public class Cake {
    //Antal Personer til kagen samt de individuelle ingrediensers vægt i gram
    int antalPersoner = 4;
    int fireSukker = 350;
    int fireHvedemel = 175;
    int fireKakaoPulv = 24;
    int fireVaniljeSuk = 10;
    int fireBagePulver = 15;
    int fireSmoer = 250;
    int fireAeg = 180;
    int fireVand = 200;
    //Kagens energi indhold, spredt ud over hver ingrediens i kJ
    double kjSukker = 17;
    double kjHvedemel = 14.7;
    double kjKakaopulver = 16.8;
    double kjVaniljesukker = 16.5;
    double kjBagepulver = 7.32;
    double kjSmoer = 30.4;
    double kjAeg = 5.7;
public Cake(int personer){
    this.antalPersoner = antalPersoner;
    this.fireSukker = fireSukker;
    this.fireHvedemel = fireHvedemel;
    this.fireKakaoPulv = fireKakaoPulv;
    this.fireVaniljeSuk = fireVaniljeSuk;
    this.fireBagePulver = fireBagePulver;
    this.fireSmoer = fireSmoer;
    this.fireAeg = fireAeg;
    this.fireVand = fireVand;
}
public int getIngredientser(){
    return fireSukker + fireHvedemel + fireKakaoPulv + fireVaniljeSuk + fireBagePulver + fireSmoer + fireAeg + fireVand;
}
public int getAntalPersoner(){
    return antalPersoner;
}
public String toString(){
    String opskrift = (fireSukker + " " + fireHvedemel + " " + fireKakaoPulv + " " + fireVaniljeSuk + " " + fireBagePulver + " " + fireSmoer + " " + fireAeg + " " + fireVand);
    return opskrift;
}
public int getKageVægt(){
    return (int) ((fireSukker + fireHvedemel + fireKakaoPulv + fireVaniljeSuk + fireBagePulver + fireSmoer + fireAeg + fireVand) * 0.9);
}
public double getKageEnergi(){
    return  (double) (((kjSukker*fireSukker) + (kjHvedemel*fireHvedemel) + (kjKakaopulver*fireKakaoPulv) + (kjVaniljesukker*fireVaniljeSuk) + (kjBagepulver*fireBagePulver) + (kjSmoer*fireSmoer) + (kjAeg*fireAeg)));
}


}
