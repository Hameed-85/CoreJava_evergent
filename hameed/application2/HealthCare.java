//package com.evergent.corejava.hameed.application2;

package com.evergent.healthcare.application;

import java.io.IOException;
import java.util.Scanner;

public class HealthCare {

    enum Module {A, B, R, E}
    enum SubmoduleA {N, C, M}
    enum SubmoduleB {T, P, M}
    enum SubmoduleR {I, S, M}

    static int consultationCost;
    static int totalAmount;
    static int discountAmount;
    static int additionalCost;

    public static void main(String[] args) throws IOException {
        String module;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\tWelcome to HEALTHCARE MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println("Healthcare Main Menu");
            System.out.println("======================");
            System.out.println("A-Appointment Module");
            System.out.println("B-Billing Module");
            System.out.println("R-Report Module");
            System.out.println("E-Exit");
            System.out.println("======================");
            System.out.println("Enter your Module code (A, B, R, E): ");

            module = scanner.nextLine();
            System.out.println("You entered module: " + module);

            switch (Module.valueOf(module)) {
                case A:
                    handleAppointmentModule(scanner);
                    break;
                case B:
                    handleBillingModule(scanner);
                    break;
                case R:
                    handleReportModule(scanner);
                    break;
                case E:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid module code. Please try again.");
            }
        }
    }

    private static void handleAppointmentModule(Scanner scanner) {
        System.out.println("Appointment Module");
        System.out.println("======================");
        System.out.println("N-New Appointment");
        System.out.println("C-Cancel Appointment");
        System.out.println("M-Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (N, C, M): ");

        String module = scanner.nextLine();
        switch (SubmoduleA.valueOf(module)) {
            case N:
                bookNewAppointment(scanner);
                break;
            case C:
                cancelAppointment(scanner);
                break;
            case M:
                break;
            default:
                System.out.println("Invalid submodule code. Please try again.");
        }
    }

    private static void bookNewAppointment(Scanner scanner) {
        System.out.println("Enter Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.println("Enter Patient Age: ");
        int patientAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Doctor's Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Enter Appointment Date (DD/MM/YYYY): ");
        String appointmentDate = scanner.nextLine();

        System.out.println("Appointment booked successfully for " + patientName + " with Dr. " + doctorName + " on " + appointmentDate);
    }

    private static void cancelAppointment(Scanner scanner) {
        System.out.println("Enter Appointment ID to cancel: ");
        String appointmentID = scanner.nextLine();

        System.out.println("Appointment with ID " + appointmentID + " has been cancelled successfully.");
    }

    private static void handleBillingModule(Scanner scanner) {
        System.out.println("Billing Module");
        System.out.println("======================");
        System.out.println("T-To display total amount to be paid");
        System.out.println("P-To make payment");
        System.out.println("M-Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (T, P, M): ");

        String module = scanner.nextLine();
        switch (SubmoduleB.valueOf(module)) {
            case T:
                System.out.println("Total Amount to be Paid: $" + (totalAmount + additionalCost));
                break;
            case P:
                System.out.println("To Make Payment: $" + (discountAmount + additionalCost));
                break;
            case M:
                break;
            default:
                System.out.println("Invalid submodule code. Please try again.");
        }
    }

    private static void handleReportModule(Scanner scanner) {
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("I-To display invoice");
        System.out.println("S-To display summary of appointments and payments");
        System.out.println("M-Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (I, S, M): ");

        String module = scanner.nextLine();
        switch (SubmoduleR.valueOf(module)) {
            case I:
                System.out.println("Invoice Display");
                System.out.println("==================");
                System.out.println("Invoice ID: " + (int)(Math.random() * 10000));
                System.out.println("Total Amount to be Paid: $" + (discountAmount + additionalCost));
                break;
            case S:
                System.out.println("Summary of Appointments and Payments");
                System.out.println("======================");
                System.out.println("Total Consultation Cost: $" + totalAmount);
                System.out.println("Discount Amount: $" + discountAmount);
                System.out.println("Additional Cost: $" + additionalCost);
                System.out.println("Total Amount to be Paid: $" + (discountAmount + additionalCost));
                break;
            case M:
                break;
            default:
                System.out.println("Invalid submodule code. Please try again.");
        }
    }
}