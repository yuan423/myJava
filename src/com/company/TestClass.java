package com.company;

import  java.util.concurrent.ThreadPoolExecutor;

public class TestClass {

    public static void HeroMonster()
    {
        int hero =10 ;
        int monster =10;

        do
        {
            int roll = (int)(Math.random()*10+1);
            monster -=roll;
            System.out.println("Monster was damaged and lost "+roll+" health and now has "+monster+" health.");

            if (monster <=0)  continue;

            roll = (int)(Math.random()*10+1);
            hero -=roll;
            System.out.println("Hero was damaged and lost "+roll+" health and now has "+hero+" health.");
        }
        while (hero > 0 && monster > 0);
        System.out.println(hero > monster? "Hero wins!" : "Monster wins!");
    }

    public static void Print99()
    {
        //九九乘法表
        Print99(9);
    }

    public static void Print99(int num)
    {
        for(int x=1; x<=num;x++)
        {
            for(int y=1;y<= x; y++)
            {
                System.out.print(x+"*"+y+"="+(x*y)+"\t");
            }

            System.out.println();
        }

    }

    public  static void PrintHer()
    {
        System.out.println("--------------------------------------------");
    }


    public static int Add(int a,int b)
    {
        return a+b;
    }

    public static int Add(int a,int b ,int c)
    {
        return Add(a,b)+c;

    }


}
