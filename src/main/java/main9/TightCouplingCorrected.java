/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main9;

import classe9.Car;
import classe9.PetrolEngine;
import interface9.Engine;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 16/02/2025
 * @brief Class TightCouplingCorrected
 */
public class TightCouplingCorrected {

    public static void main(String[] args) {
        Engine engine = new PetrolEngine(); 
        Car car = new Car(engine);
        car.start();
    }
}
