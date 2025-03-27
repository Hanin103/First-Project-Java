import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Earned Amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println(); 

        int income = 202 + 118 + 2250 + 1680 + 1075 + 80;
        
        System.out.println("Income: $" + income); 
        System.out.println("Staff Expenses: ");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other Expenses: ");
        int otherExpenses = scanner.nextInt();
        System.out.println("Net income: $" + (income - (staffExpenses + otherExpenses)));

        scanner.close();
        
    }
}