/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main3;

import classe3.PDFReportGenerator;
import classe3.Report;
import interface3.ReportGenerator;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class HardCodedDependenciesCorrected
 */
public class HardCodedDependenciesCorrected {
    public static void main(String[] args) {
        ReportGenerator pdfReportGenerator = new PDFReportGenerator();
        Report report = new Report(pdfReportGenerator);
        report.generateReport();
    }
}
