package ie.atu;

public class ShiftWorker extends Employee {
    public int Shift;
    public int Payroll;
    public double HourlyPay;
    public String id;
    public String name;

    public ShiftWorker(){
    }

    public ShiftWorker(int Shift, int Payroll, double HourlyPay, String id, String name)
    {
        super(id, name);
        this.Shift = Shift;
        this.Payroll = Payroll;
        this.HourlyPay = HourlyPay;
    }

    public int getShift() {
        return Shift;
    }

    public void setShift(int shift) {
        Shift = shift;
    }

    public int getPayroll() {
        return Payroll;
    }

    public void setPayroll(int payroll) {
        Payroll = payroll;
    }

    public double getHourlyPay() {
        return HourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        HourlyPay = hourlyPay;
    }

    public String getReportdetails() {
        System.out.println("Employee's name:" + name);
        System.out.println("Employee's shift: " + Shift);
        System.out.println("Employee's payroll: " + Payroll);
        System.out.println("Employee's Hourly Rate" + HourlyPay);
        return null;
    }
}
