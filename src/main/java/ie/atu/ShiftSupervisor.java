package ie.atu;

public class ShiftSupervisor extends ShiftWorker{
    private int Shift;
    private int Payroll;
    private double HourlyPay;
    private String id;
    private String name;
    private double AnnualSalary;

    public ShiftSupervisor()
    {}

    public ShiftSupervisor(int Shift, int Payroll, double HourlyPay, String id, String name, double AnnualSalary)
    {
        super(Shift, Payroll,HourlyPay,id,name);
        this.AnnualSalary = AnnualSalary;
    }

    public double getAnnualSalary() {
        return AnnualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        AnnualSalary = annualSalary;
    }

    public String getReportdetails() {
        System.out.println("Employee's name:" + name);
        System.out.println("Employee's shift: " + Shift);
        System.out.println("Employee's payroll: " + Payroll);
        System.out.println("Employee's Hourly Rate" + HourlyPay);
        return null;
    }
}
