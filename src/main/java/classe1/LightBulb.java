/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classe1;

import inteface1.Switchable;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class LightBulb
 */

public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}
