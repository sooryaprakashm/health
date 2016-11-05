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
public class key {
    public static void main(String[] args) {
//        for(int var =0; var < 5 ; var++)
//{
//        System.out.println("var is" + var);
// 
//        if(var == 3)
//                break;
//}

Outer:
for(int var1=0; var1 < 5 ; var1++)
{
         for(int var2 = 1; var2 < 5; var2++)
        {
                System.out.println("var1:" + var1 + "var2:" + var2);
 
                if(var1 == 3)
                        break Outer;
 
        }
}

    }
}
