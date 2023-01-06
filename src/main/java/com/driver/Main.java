package com.driver;

public class Main {

    public static void main (String[] args) {
        Product p = new Product(); //create object of Product in Main function called p
        int ans = p.product(10,20); //call this method from Main using Product class object p

        int ans1 = p.product(10,20,30); //call this method from Main using Product class object p

        double ans2 = p.product(10.5 , 9.7); //call this method also from Main using Product class object p
        System.out.println(ans + " " + ans1 + " " + ans2);
    }

    public static class Product{ //create a class Product inside Main class

        public int product(int x, int y) { //create a method of following defination
            return x * y;
        }

        public int product(int x, int y, int z) { //create a Overloaded method product of following defination
            return x * y * z;
        }

        public double product(double x, double y) { //create a Overloaded method product of following defination
            return x * y;
        }
    }
}