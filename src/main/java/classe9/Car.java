/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe9;

import interface9.Engine;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 16/02/2025
 * @brief Class Car
 */
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car is running");
    }
}
