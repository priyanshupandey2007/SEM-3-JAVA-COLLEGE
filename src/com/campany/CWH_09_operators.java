package com.campany;

public class CWH_09_operators {
    static void main(String[] args) {
        //        precedence & associativity
        int a = 6*5-34/2;
        /*
        higher perecedence goes to * and / . then they are evaluated on the basis of left to right associativity    
       = 30-34/2
       = 30-17
       = 13
         */
        int b = 60/5-34*2;
        /*
       = 12-34*2
       = 12-68
       = -56
         */
        System.out.println(b);

    }
}
