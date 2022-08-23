package com.example.ptp10_2072008;
import java.util.Scanner;

public class testingClass {
    public double bil1;
    public double bil2;
    public String op = "";

    Scanner sc = new Scanner(System.in);


    public int hitung() {
        double hasil = 0;
        int result = 0;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int allR = 0;

//        System.out.print("Bilangan pertama: ");
        try {
//            bil1 = sc.nextDouble();
//            bil1 = "s";
            bil1 = 10.0;
            result1 = 1;
        } catch (NumberFormatException n) {
//            System.out.print("Input Tidak Valid!!!");
            result1 = 0;
        }

//        System.out.print("Bilangan kedua: ");
        try {
//            bil2 = sc.nextDouble();
//            bil2 = "a";
            bil2 = 5.0;
            result2 = 1;
        } catch (NumberFormatException n) {
//            System.out.print("Input Tidak Valid!!!");
            result2 = 0;
        }

//        System.out.print("Operator (+/-): ");
//        op = sc.next();
        op = "a";
//        op = "+";
//        op = "-";
        if ((op.equals("+")) || (op.equals("-"))) {
            result3 = 1;
        } else {
            this.op = "";
            result3 = 0;
        }
        if (op.equals("+")) {
                hasil = bil1 + bil2;
                System.out.println("Total Perhitungan " + bil1 + " " + op + " " + bil2 + " = " + hasil);
                result = 1;
            } else if (op.equals("-")) {
                hasil = bil1 - bil2;
                System.out.println("Total Perhitungan " + bil1 + " " + op + " " + bil2 + " = " + hasil);
                result = 1;
            } else {
                System.out.println("Operasi yang anda masukan salah silahkan ulangi kembali!!!");
            }
        System.out.println("R: " + result + "\nR1: " + result1 + "\nR2: " + result2 + "\nR3: " + result3);
        if ((result == 0) || (result1 == 0) || (result2 == 0) || (result3 == 0)){
            allR = 0;
        } else {
            allR = 1;
        }
        return allR;
    }
}
