/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classe4;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class Calculator
 */
public class Calculator {
    public void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }
}