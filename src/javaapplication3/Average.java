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
public class Average {
    public static void main(String[] args) {
       
        int a[]=new int[]{10,20,30,40,50};
        int sum=0;
        for(int j=0;j<a.length;j++){
            sum=sum+a[j];
            
        }
        System.out.println(sum);
   int average=sum/a.length;
        System.out.println(average);
}
}