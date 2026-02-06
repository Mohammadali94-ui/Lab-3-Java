public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    // Constructor using super()
    public CommissionEmployee(String firstName, String lastName, String ssn,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    // Getters + setters with validation
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0 && commissionRate < 1) {
            this.commissionRate = commissionRate;
        }
    }

    // earnings override
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    // toString override
    @Override
    public String toString() {
        return super.toString()
                + "\nGross Sales: $" + grossSales
                + "\nCommission Rate: " + commissionRate;
