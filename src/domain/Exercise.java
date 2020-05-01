/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Инна
 */
public class Exercise {
    public static String Calculate(int R) {
    return "Число "+R+" в двоичной системе: "+CalculateBinarySystem(R)+"\n\r\n" + "восьмеричной системе: "+CalculateOctalSystem(R)+"\n\r\n" + "в шестнадцатеричной системе: "+CalculateHexadecimalSystem(R);
    }
    /**
     * A method that converts a six-digit number represented by a decimal number into a binary system
     * @param R integer
     * @return specified binary number
     */
    public static String CalculateBinarySystem(int R){
        return (String) (Integer.toBinaryString((int) R));
    }
    /**
     * A method that converts a six-digit number represented by a decimal number into a eight-year system
     * @param R integer 
     * @return specified number in octal notation
     */
    public static String CalculateOctalSystem(int R){
        return (String) (Integer.toOctalString((int) R));
    }
    /**
     * A method that converts a six-digit number represented by a decimal number into a hexadecimal system
     * @param R integer 
     * @return specified number in hexadecimal notation
     */
    public static String CalculateHexadecimalSystem(int R){
        return (String) (Integer.toHexString((int) R));
    }
}
