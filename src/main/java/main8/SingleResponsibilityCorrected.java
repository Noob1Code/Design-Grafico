/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main8;

import classe8.Invoice;
import classe8.InvoicePrinter;
import classe8.InvoiceRepository;

/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 16/02/2025
 * @brief Class SingleResponsibilityCorrected
 */
public class SingleResponsibilityCorrected {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        printer.print(invoice);
        repository.save(invoice);
    }
}
