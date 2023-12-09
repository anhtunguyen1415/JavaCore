/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.checkstring;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Tu
 */
public class CheckString {

    public static void main(String[] args) {
        String smallStr = "";
        String bigStr = "";
        inputString(bigStr, smallStr);
        checkStr(bigStr,smallStr);
        
    }

    public static void inputString(String bigStr, String smallStr) {
        System.out.println("Input big string: ");
        Scanner sc = new Scanner(System.in);
        bigStr = sc.nextLine();
        System.out.println("Input small string: ");
        smallStr = sc.nextLine();

    }

    public static void checkStr(String bigStr, String smallStr) {
        char bigArr[] = bigStr.toCharArray();
        char smallArr[] = bigStr.toCharArray();
        for(int i=0;i<bigArr.length;i++){
            System.out.printf("%c",bigArr[i]);
        }
  }
}

// as
// a s d f g 

//cho 2 chuỗi 1 chuỗi bé một chuỗi lớn nếu các kí tự chuỗi bé trong chuỗi lớn trả về true ngược lại false 
//ex 51 ví dụ ( ab , dakdnb) → true( thứ tự các ký tự có thể đảo)
