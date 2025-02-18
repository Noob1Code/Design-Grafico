/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main4;

import classe4.Calculator;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class ProperExceptionHandling
 */
public class ProperExceptionHandling {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
