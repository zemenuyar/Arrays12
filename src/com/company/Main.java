package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //String[] arrayname2 ={somevale1, somevale2, somevale3,.....somevalueN};
        String[] animals = new String[5];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "horse";
        animals[3] = "elephant";
        animals[4] = "lion";
        String[] animals1 = {"dog", "cat", "hores", "elephant", "lione"};

        //System.out.println(animals[3]);

        for (int x = 0; x < animals.length; x++) {
            System.out.println(animals[x]);
            // how to print one animals?
        }
        //System.out.println(animals[3]);
    }
}


