package com.campany;

public class CWH_10_resulting_data_type {
    static void main(String[] args) {
        /*
        byte x = 5;
        short z = 8;
        int a  = 45+5;
        float b = 6.45f + x  ;
        System.out.println(b); */


//        Increment and Decrement Operators
        int  i  = 56;
        int b  = i++; //first b is assigned i (56) and then I is incremented

        int j = 67;
        int c = ++j; //first j is incremented then c is assigned j(68)
        System.out.println(i++); // 56
//        phele i phir ++ lagane ka mtlb hai ki pehle i ki value print kr do phir use +1 kr do mtlb increment kr do
        System.out.println(i);//57
//        yaha 57 isliye print hua Yuki pehle wale step mein pehle i ki value print ho gyi hai phir +1 ho gay aur ab increment wali value print hui hai
        System.out.println(++i);//58
//        isme 58 isliye print hua Yuki isme humne pehle ++ like diye jisse pehle value mein  +1 hua then humne i likha jisse vo value print hui
        System.out.println(i);//58
//        aur yaha pr humne bss i ko print kiya hai to purani wali value print ho jake

        int y  = 7;
//      int x =  ++y * 8; // pehle y ki value increment hogi then vo multiply hogi 8 se to answer 64 ayega
        System.out.println( ++y * 8); // 64

        char ch = 'a' ;
        System.out.println(++ch ) ; // b


    }
}
