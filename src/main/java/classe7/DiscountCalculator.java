/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe7;

import interface7.DiscountStrategy;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 16/02/2025
 * @brief Class DiscountCalculator
 */
public class DiscountCalculator {

    private DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
