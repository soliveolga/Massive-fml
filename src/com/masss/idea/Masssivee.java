package com.masss.idea;

public class Masssivee {
    public static void main(String[] args) {
        int [] mass = new int[] {12, 24, 36, 48, 60};
        int length = mass.length;
        System.out.println("Количество элементов в массиве = " + mass.length); //вывожу чтобы знать сколько отнимать из length
        int last =  mass[mass.length - 1];
        int first = mass[0];
        mass[0] = last;
        mass[4] = first;

        int middle = mass[mass.length - 3];
        System.out.println("Сумма первого и среднего элемента = " + (mass[0] + middle));
    }
}

