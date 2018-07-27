package com.DawidKotwicki;

public class Main {

    public static void main(String[] args) {

        //Integer has a width of 32
        int myMinInt = -2_147_483_648;
	    int myMaxInt = 2_147_483_647;
        int myTotal = (myMinInt/2);
        System.out.println("My int: "+  myTotal);

	    //Byte has a width of 8
	    byte myMinByte = -128;
        byte myMaxByte = 127;
        byte myTotalByte = (byte) (myMinByte/2);
        System.out.println("My byte: "+  myTotalByte);

        //Short has a width of 16
        short myMinShort = -32768;
        short myMaxShort = 32767;
        short myTotalShort = (short) (myMinShort/2);
        System.out.println("My short: "+  myTotalShort);

        //Long has a width of 64
        long myMaxLong = -9_223_372_036_854_775_808L;
        long myMinLong = 9_223_372_036_854_775_807L;
        long myTotalLong = (myMinLong/2);
        System.out.println("My long: "+  myTotalLong);

        int iNum = 1_300_400_050;
        byte bNum = 64;
        short sNum = 20300;
        long lNum = (50000 + 10*(bNum+iNum+sNum));

        System.out.println("Integer = "+ iNum);
        System.out.println("Byte = "+ bNum);
        System.out.println("Short = "+ sNum);
        System.out.println("Long = "+ lNum);
    }
}
