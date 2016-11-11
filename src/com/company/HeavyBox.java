package com.company;

class HeavyBox extends Box {
    String weight;
    HeavyBox(HeavyBox ob){
        super(ob);
        weight = ob.weight;

    }
    HeavyBox(String a, int b, String m ){
        super(a, b);
        weight = m;
    }

}