package faTrangning;
import java.util.ArrayList;
import java.util.Scanner;
public class Sale {
    private String Name;
    private int age;
    private String address;
    private double salary;
    private int  sumTimeWork;
    private static int saleCount = 0;
    public Sale(){

    }
    public Sale(String name, int age, String address, double salary, int sumTimeWork) {
        this.Name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.sumTimeWork = sumTimeWork;
        saleCount ++;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSumTimeWork() {
        return sumTimeWork;
    }

    public void setSumTimeWork(int sumTimeWork) {
        this.sumTimeWork = sumTimeWork;
    }

    public static int getSaleCount() {
        return saleCount;
    }

    public static void setSaleCount(int saleCount) {
        Sale.saleCount = saleCount;
    }

    public double  getBonus(){
        if(this.sumTimeWork >= 200){
            return this.salary * 0.2;
        }
        else if (this.sumTimeWork >= 100){
            return this.salary * 0.1;
        }
        else {
            return 0;
        }
    }
}
class SaleManager{
    private ArrayList<Sale> sales;

    public SaleManager() {
        this.sales = new ArrayList<>();
    }
    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public  void displaySale() {
        for (Sale sale : sales) {
            System.out.println(sale);
        }
    }

    public void displayBonus() {
        for (Sale sale : sales) {
            double bonus = sale.getBonus();
            System.out.println("Bonus for " + sale.getName() + ": " + bonus);
        }
    }
}
