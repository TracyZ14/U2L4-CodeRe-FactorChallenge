public class TipCalculator {
    private double bill;
    private double tipPercentage;
    private double numberOfPeople;

    public TipCalculator(double bill, double tipPercentage, double numberOfPeople) {
        this.bill = bill;
        this.tipPercentage = tipPercentage;
        this.numberOfPeople = numberOfPeople;
    }

    public double calculateTotalTipAmount() {
        double totalTipAmount = bill * (tipPercentage / 100);
        return totalTipAmount;
    }

    public double calculateTotalBill(double totalTipAmount) {
        double totalBill = bill + totalTipAmount;
        return totalBill;
    }

    public double calculateTipPerPerson(double totalTipAmount) {
        double tipPerPerson = totalTipAmount / numberOfPeople;
        return tipPerPerson;
    }

    public double calculateTotalPerPerson(double totalBill) {
        double totalPerPerson = totalBill / numberOfPeople;
        return totalPerPerson;
    }

    public void printCalculationsInfo(double calculateTotalTipAmount, double calculateTotalBill, double calculateTipPerPerson, double calculateTotalPerPerson)
    {
        System.out.println("Total tip amount: $" + (Math.ceil(calculateTotalTipAmount * 100) / 100));
        System.out.println("Total bill: $" + (Math.ceil(calculateTotalBill * 100) / 100));
        System.out.println("Tip per person: $" + (Math.ceil(calculateTipPerPerson * 100) / 100));
        System.out.println("Total per person: $" + (Math.ceil(calculateTotalPerPerson * 100) / 100));
    }
}