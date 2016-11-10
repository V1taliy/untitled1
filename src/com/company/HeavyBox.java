package com.company;

class HeavyBox extends Box {
    int w;
    int h;

    // конструктор
    // инициализируем переменные с помощью ключевого слова super
    HeavyBox(int a, int b) {
        super.w = a;
        super.h = b;
        h = b;
        w = a;

    }
    void show(){
        System.out.println("w из суперкласса: " + super.w);
        System.out.println("h из суперкласса: " + super.h);
        System.out.println("h из ркласса: " + h);
        System.out.println("w из класса: " + w);
    }

}
