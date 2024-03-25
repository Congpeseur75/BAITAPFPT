package faTrangning;

import java.util.Scanner;

public class TestSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SaleManager saleManager = new SaleManager();

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Sale");
            System.out.println("2. Display All Sale");
            System.out.println("3. getBonus");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Sale Name");
                    String name = scanner.nextLine();
                    System.out.println("Enter Sale age");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Sale address");
                    String address = scanner.nextLine();
                    System.out.println("Enter Sale salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter Sale SumTimeWord");
                    int sumTimeWord = Integer.parseInt(scanner.nextLine());
                    Sale sale = new Sale(name,age,address,salary,sumTimeWord);
                    saleManager.addSale(sale);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    saleManager.displaySale();
                    break;
                case 3:
                    saleManager.displayBonus();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
