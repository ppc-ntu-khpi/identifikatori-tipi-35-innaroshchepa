/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import domain.Exercise;
/**
 *
 * @author Инна
 */
public class TestResult {

    public static void main(String[] args) {

        int R=999991;
        if(R>=100000 && R<1000000)
            {
            System.out.println("\r\n" +Exercise.Calculate(R)) ;
            }
        else{
            System.out.println("Число должно быть шестизначным!");
            }
    }
}
    
    
    
    


