package com.company;

public class ApplicationMain {

    public static void main(String[] args) {
	// write your code here

        TestClass.Print99();
        TestClass.PrintHer();
        TestClass.Print99(8);
         TestClass.PrintHer();


        System.out.println("5+6="+TestClass.Add(5,6));
        System.out.println("5+6+7="+TestClass.Add(5,6,7));

        TestClass.PrintHer();

        //HeroMonster();
        TestClass.HeroMonster();

        ArrayTest.toBin(6);
        ArrayTest.toBin(-6);

        ArrayTest.toHex(60);
        ArrayTest.toHex(-60);

        ArrayTest.toBa(60);
        ArrayTest.toBa(-60);
        ArrayTest.toBa(0);

        System.exit(0);

    }

}
