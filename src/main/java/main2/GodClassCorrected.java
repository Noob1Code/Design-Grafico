/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main2;

import classe2.Application;
import classe2.DashboardLoader;
import classe2.PaymentProcessor;
import classe2.ReportGenerator;
import classe2.UserAuthenticator;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class GodClassCorrected
 */
public class GodClassCorrected {
    public static void main(String[] args) {
        Application app = new Application(
            new UserAuthenticator(),
            new DashboardLoader(),
            new PaymentProcessor(),
            new ReportGenerator()
        );
        app.run();
    }
}
