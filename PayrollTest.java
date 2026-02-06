// Mohammad Ali Bokhari
// COMP 1112 – Lab 3 Inheritance

public class PayrollTest {

    public static void main(String[] args) {

        CommissionEmployee employee =
                new CommissionEmployee("Mohammad", "Bokhari",
                        "123-45-6789", 5000.00, 0.10);

        System.out.println(employee);
        System.out.println("Earnings: $" + employee.earnings());
    }
}
