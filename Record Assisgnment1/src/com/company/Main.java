package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int hours;
        double charges= 0;

        Scanner in  = new Scanner(System.in);

        System.out.println("Nmaee");
        name = in.next();
        System.out.println("hours");
        hours = in.nextInt();

        if(hours<=4){
            charges= hours*6;
        }
        if(hours<=8 && hours>4){
            charges= 4*6 + (hours-4)*5;
        }
        if(hours<=12 && hours>8){
            charges= 24 + 20 + (hours-8)*4;
        }
        if(hours>12){
            charges= 24+20+16+(hours-12)*3;
        }
        System.out.println(charges);
    }
}
