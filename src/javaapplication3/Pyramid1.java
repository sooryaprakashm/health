/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author soory
 */
public class Pyramid1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int k=5;k>1;k--){
            for(int l=1;l<k;l++){
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
}
