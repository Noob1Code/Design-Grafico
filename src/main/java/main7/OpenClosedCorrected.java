/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main7;

import classe7.DiscountCalculator;
import classe7.VIPDiscount;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 16/02/2025
 * @brief Class OpenClosedCorrected
 */
public class OpenClosedCorrected {

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator(new VIPDiscount());
        System.out.println("Discount: " + calculator.calculateDiscount(200));
    }
}
