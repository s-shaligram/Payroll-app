/*Name- Sameer Shaligram
 * Date- Dec 11, 2022
 * Purpose- Supervisor: a subclass of Employee
 */
public class Supervisor extends Employee {
    
    //variable declaration

    private double salary;
    private int productionRate;

    //no-arg constructor

    public Supervisor(){
        super(null, null, null, null, null);
        salary = 0.0;
        productionRate = 0;
    }

    //7-arg constructor

    public Supervisor(String level, String firstName, String lastName, String hireDate, String birthDate, double salary, int productionRate) {

        super(level, firstName, lastName, hireDate, birthDate);

        this.salary = salary;
        this.productionRate = productionRate;
    }

    //getter and setter methods

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getProductionRate() {
        return productionRate;
    }

    public void setProductionRate(int productionRate) {
        this.productionRate = productionRate;
    }

    //a method to calculate the bonus earned

    private double calculateBonus(){

        double bonus = 0.0;

        if(productionRate < 75){

            bonus = 0.0;
        }

        else if(productionRate >= 75 && productionRate <= 100){

            bonus = ((salary/50) * 0.05);
        }

        else if(productionRate >= 101 && productionRate <= 120){

            bonus = ((salary/50) * 0.15);
        }

        return bonus;
    
    }

    //implementing abstract method from parent abstract class

    public double calculatePay(){ 

        return (salary/50) + calculateBonus();
    }

    public String toString(){

        return super.toString() +
        String.format("\nSalary: %14s%,.2f \n%-20s %d%s \nGross Pay: %11s%,.2f", "$", salary, "Production Rate: ", productionRate, "%", "$", calculatePay());
    }

}
