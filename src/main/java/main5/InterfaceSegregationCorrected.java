/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main5;

import classe5.FaxMachineImpl;
import classe5.PrinterImpl;
import classe5.ScannerImpl;
import interface5.FaxMachine;
import interface5.Printer;
import interface5.Scanner;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class InterfaceSegregationCorrected
 */
public class InterfaceSegregationCorrected {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        printer.print();

        Scanner scanner = new ScannerImpl();
        scanner.scan();

        FaxMachine faxMachine = new FaxMachineImpl();
        faxMachine.fax();
    }
}
