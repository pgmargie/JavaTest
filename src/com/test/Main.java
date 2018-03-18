package com.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        int cond = 0;
        for (; cond < 2; ++cond) {
            switch (cond) {
                case 0 :
                    System.out.println("case 0");
                    break;
                case 1 :
                {
                    System.out.println("case 1");
                    break;
                }
            }
        }

        String s1 = "this is string";
        String s2 = "this is string";
        String s3 = s1;
        String s4 = "this is others";
        s2 = s4;
        s4 = "this is new string";

        swapString(s3, s4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        showMsg();

        int[] ar = new int[2];
        ar[0] = 0;
        ar[1] = 1;
        System.out.printf("this is No. %d element %d\n", 0, ar[0]);


    }

    private static void showMsg()
    {
        String ns = null;
        System.out.println(ns);
        System.out.println("this is from inside");
    }

    private static void swapString (String v1, String v2)
    {
        String va1 = v1;
        v1 = v2;
        v2 = va1;
    }
}
