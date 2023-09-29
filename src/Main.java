import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bill: $");
        String a = s.nextLine();
        double bill = Double.parseDouble(a);
        System.out.print("Tip % (whole number without %): ");
        String b = s.nextLine();
        double tipPercentage = Double.parseDouble(b);
        System.out.print("Number of people: ");
        String c = s.nextLine();
        double numberOfPeople = Double.parseDouble(c);
        TipCalculator userInputs = new TipCalculator(bill, tipPercentage, numberOfPeople);
        double totalTipAmount = userInputs.calculateTotalTipAmount();
        double totalBill = userInputs.calculateTotalBill(totalTipAmount);
        double tipPerPerson = userInputs.calculateTipPerPerson(totalTipAmount);
        double totalPerPerson = userInputs.calculateTotalPerPerson(totalBill);
        userInputs.printCalculationsInfo(totalTipAmount, totalBill, tipPerPerson, totalPerPerson);
    }
}