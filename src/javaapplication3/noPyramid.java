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
public class noPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int k=4;k>0;k--){
            for(int l=1;l<k;l++){
                System.out.print(l);
            }
            System.out.println("");
        }
    }
}
