public class TipCalculator {
    private double bill;
    private double tipPercentage;
    private double numberOfPeople;
    private double totalTipAmount;
    private double totalBill;
    private double tipPerPerson;
    private double totalPerPerson;

    public TipCalculator(double bill, double tipPercentage, double numberOfPeople) {
        this.bill = bill;
        this.tipPercentage = tipPercentage;
        this.numberOfPeople = numberOfPeople;
    }

    public double calculateTotalTipAmount(double TipCalculator) {
        double totalTipAmount = bill * (1 + (tipPercentage / 100));
        return totalTipAmount;
    }

    public double calculateTotalBill(double TipCalculator) {
        double totalBill = bill + totalTipAmount;
        return totalBill;
    }

    public double calculateTipPerPerson(double TipCalculator) {
        double tipPerPerson = totalTipAmount / numberOfPeople;
        return tipPerPerson;
    }

    public double calculateTotalPerPerson(double TipCalculator) {
        double totalPerPerson = totalBill / numberOfPeople;
        return totalPerPerson;
    }

    public void printCalculationsInfo()
    {
        System.out.println("Total tip amount: $" + (Math.ceil(totalTipAmount * 100) / 100));
        System.out.println("Total bill: $" + (Math.ceil(totalBill * 100) / 100));
        System.out.println("Tip per person: $" + (Math.ceil(tipPerPerson * 100) / 100));
        System.out.println("Total per person: $" + (Math.ceil(totalPerPerson * 100) / 100));
    }
}