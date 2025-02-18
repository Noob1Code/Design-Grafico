/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classe2;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 16/02/2025
 * @brief Class Application
 */
public class Application {
    private UserAuthenticator authenticator;
    private DashboardLoader dashboardLoader;
    private PaymentProcessor paymentProcessor;
    private ReportGenerator reportGenerator;

    public Application(UserAuthenticator authenticator, DashboardLoader dashboardLoader,
                       PaymentProcessor paymentProcessor, ReportGenerator reportGenerator) {
        this.authenticator = authenticator;
        this.dashboardLoader = dashboardLoader;
        this.paymentProcessor = paymentProcessor;
        this.reportGenerator = reportGenerator;
    }

    public void run() {
        System.out.println("Running application...");
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}
