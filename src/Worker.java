/*Name- Sameer Shaligram
 * Date- Dec 11, 2022
 * Purpose- Worker: a subclass of Employee
 */
public class Worker extends Employee{

    //variable declaration

    private int shift;
    private double rate;
    private double hours;

    //no-arg constructor

    public Worker(){
        super(null, null, null, null, null);
        shift = 0;
        rate = 0.0;
        hours = 0.0;
    }

    //8-arg constructor

    public Worker(String level, String firstName, String LastName, String hireDate, String birthDate, int shift, double rate, double hours) {

        super(level, firstName, LastName, hireDate, birthDate);

        this.shift = shift;
        this.rate = rate;
        this.hours = hours;
    }

    //getter and setter methods

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //implementing abstract method from parent abstract class

    public double calculatePay(){

        double pay = 0.0;

        if(shift == 1){

            pay = hours * rate;
        }

        else if(shift == 2){

            pay = hours * rate + (hours * rate * 0.03);
        }

        return pay;
    }

    public String toString(){

        String str = "";

        if(shift == 1){
            str = String.format("\n%s%30s \nHourly Pay Rate: %5s%,.2f \nHourse Worked: %,10.1f \nGross Pay: %11s%,.2f","Shift: ", "day (no premium)", "$", rate, hours, "$", calculatePay());
        }

        else if(shift == 2){
            str = String.format("\n%s%35s \nHourly Pay Rate: %5s%,.2f \nHourse Worked: %,10.1f \nGross Pay: %11s%,.2f","Shift: ", "night (shift premium)", "$", rate, hours, "$", calculatePay());
        }

        return super.toString() + str;
    }
}
