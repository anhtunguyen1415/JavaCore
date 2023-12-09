/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.decimaltobinary;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Tu
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        int decimal;
        System.out.println("Nhap so can chuyen doi: ");
        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
        if(decimal>0)
        System.out.printf("ket qua: %s", convertPositiveDecimalToBinary(decimal));
        else
        System.out.printf("ket qua: %s", decimalToBinary(decimal));    
        //decimalToBinary(decimal);
    }

    public static String decimalToBinary(int decimal) {
    if (decimal >= 0) {
        return convertPositiveDecimalToBinary(decimal);
    } else {
    
        int positiveDecimal = ~decimal + 1;
     
        String positiveBinary = convertPositiveDecimalToBinary(positiveDecimal);
     
        while (positiveBinary.length() < 32) {
            positiveBinary = "0" + positiveBinary;
        }
      
        String negativeBinary = "";
        for (int i = 0; i < positiveBinary.length(); i++) {
            char bit = positiveBinary.charAt(i);
            if (bit == '0') {
                negativeBinary += '1';
            } else {
                negativeBinary += '0';
            }
        }
        return negativeBinary;
    }
}

private static String convertPositiveDecimalToBinary(int decimal) {
    String binary = "";
    while (decimal != 0) {
        int bit = decimal % 2;
        binary = bit + binary;
        decimal /= 2;
    }
    return binary;
}
}

