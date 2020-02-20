package com;

public class Problem6 {
    public static int sumOfSquares (int next){
        int x=0;
        for (int i=1; i<=next; i++){
            x+=Math.pow(i,2);
        }
        return x;
    }

    public static int squareOfSum (int next){
        int x=0;
        for (int i=1; i<=next; i++){
            x+=i;
        }
        return x*x;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(100));
        System.out.println(squareOfSum(100));
        System.out.println(squareOfSum(100)-sumOfSquares(100));
    }
}
