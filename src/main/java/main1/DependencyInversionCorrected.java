/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main1;

import classe1.LightBulb;
import classe1.Switch;
import inteface1.Switchable;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class DependencyInversionCorrected
 */
public class DependencyInversionCorrected {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switchable lightSwitch = new Switch(bulb);
        lightSwitch.turnOn();
    }
}
