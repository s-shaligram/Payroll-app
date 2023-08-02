import java.util.ArrayList;

/*Name- Sameer Shaligram
 * Date- Dec 11, 2022
 * Purpose- Payroll: a class which calculates net pay for any Employee object
 */
public class Payroll {

    //variable declaration

    public static double EI_RATE = 0.0188;
    public static double CPP_RATE = 0.0495;
    public static double TAX_RATE = 0.2;
    public static double RSP_RATE = 0.04;
    public static int CURRENT_YEAR = 2022;

    private Employee emp;

    //no-arg constructors

    public Payroll(){
        
    }

    //1-arg constructor
    public Payroll(Employee emp){

        this.emp = emp;
    }

    //getter and setter methods

    public Employee getEmp() {

        return emp;
    }

    public void setEmp(Employee emp) {

        this.emp = emp;
    }

    //calculates the employee’s net pay by subtracting all deductions and contributions from this employee’s weekly pay

    public double calculateNetPay(){

        return emp.calculatePay() - (ei() + cpp() + tax() + rsp());
    }

    //calculates the employment insurance deduction
    private double ei(){

        return emp.calculatePay() * EI_RATE;
        
    }

    //calculates the Canada Pension Plan deduction
    private double cpp(){

        double cpp;

        if(parseYear(emp.getBirthDate()) > 18){
            cpp = emp.calculatePay() * CPP_RATE;
        }

        else
        cpp = 0.0;

        return cpp;
    }

    //calculates the Income Tax deduction, after ei and cpp have been deducted (tax rate % of employee’s weekly pay)
    private double tax(){
        
        double temp;
        double taxes;
        temp = emp.calculatePay() - (ei() + cpp());

        taxes = temp * TAX_RATE;

        return taxes;
    }

    //calculates the employee’s contribution to a retirement savings plan
    private double rsp(){

        int hiredYears = parseYear((emp.getHireDate()).substring(0,4));
        //int noYears = CURRENT_YEAR - hiredYears;
        
        double temp;
        double rsps;

        temp = emp.calculatePay() - (ei() + cpp() + tax());

        if(hiredYears > 2)
        rsps = temp * RSP_RATE;

        else
        rsps = 0.0;

        return rsps;
    }

    private int parseYear(String date){

        String str = date.substring(0,4);
        return CURRENT_YEAR - Integer.parseInt(str);
    }

    public static void printReport(ArrayList<Payroll> list){

        double total_grossPay = 0.0;
        double total_ei = 0.0;
        double total_cpp = 0.0;
        double total_tax = 0.0;
        double total_rsp = 0.0;
        double total_netPay = 0.0;

        System.out.println();
        System.out.println("--------------   ----------   -------------   -----------   ----------   ----------   ----------   ---------   -----------");
        System.out.println("Level            First        Last            Gross Pay     EI           CPP          Tax          RSP         Net Pay");
        System.out.println("--------------   ----------   -------------   -----------   ----------   ----------   ----------   ---------   -----------");

        for(Payroll p : list)
        {
    
            System.out.printf("%-16s %-12s %-15s %,-13.2f %,-12.2f %,-12.2f %,-12.2f %,-11.2f %,.2f\n", (p.getEmp()).getLevel(), (p.getEmp()).getFirstName(), (p.getEmp()).getLastName(), (p.getEmp()).calculatePay(), p.ei(), p.cpp(), p.tax(), p.rsp(), p.calculateNetPay());
            total_grossPay += (p.getEmp()).calculatePay();
            total_ei += p.ei();
            total_cpp += p.cpp();
            total_tax += p.tax();
            total_rsp += p.rsp();
            total_netPay += p.calculateNetPay();
        }

        System.out.println("--------------   ----------   -------------   -----------   ----------   ----------   ----------   ---------   -----------");
        System.out.printf("%-45s %,-13.2f %,-12.2f %,-12.2f %,-12.2f %,-11.2f %,.2f\n\n", "Total", total_grossPay, total_ei, total_cpp, total_tax, total_rsp, total_netPay);

    }

}
