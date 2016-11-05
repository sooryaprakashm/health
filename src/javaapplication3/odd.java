/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author soory
 */
public class odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value");
        int i=s.nextInt();
        for(int j=1;j<i;j++){
        if(j%2!=0){
            
            System.out.println(j);
        }
    }}
}
