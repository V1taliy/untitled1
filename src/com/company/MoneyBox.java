package com.company;


public class MoneyBox extends HeavyBox {
    String cost;
    MoneyBox(MoneyBox ob){
        super(ob);
        cost = ob.cost;
    }
    MoneyBox(String a, int b, String m, String c){
        super(a, b, m);
        cost = c;

    }
    String getVolume() {
        return abc + bgg + weight + cost;
    }

    public static void main(String[] args) {
        MoneyBox moneyBox1 = new MoneyBox("ololo ", 5, " trololo ", " brrrrrrrr");
       String vol;
        vol = moneyBox1.getVolume();
        System.out.println(vol);
    }
}