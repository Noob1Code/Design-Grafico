/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main6;

import classe6.Bird;
import classe6.FlyingBird;
import classe6.Ostrich;
import classe6.Sparrow;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 16/02/2025
 * @brief Class LiskovSubstitutionCorrected
 */
public class LiskovSubstitutionCorrected {

        public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow(); 
        sparrow.fly(); 

        Bird ostrich = new Ostrich();
        ostrich.walk(); 
    }
}
