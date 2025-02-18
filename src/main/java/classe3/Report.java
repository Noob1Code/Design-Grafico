/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classe3;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class Report
 */
import interface3.ReportGenerator;
public class Report {
    private ReportGenerator reportGenerator;

    public Report(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generate();
    }
}
