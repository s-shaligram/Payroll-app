import java.util.ArrayList;

/*Name- Sameer Shaligram
 * Date- Dec 11, 2022
 * Purpose- PayrollTester: a driver class which you will use to test your Employee hierarchy and Payroll class and their methods
 */
public class PayrollTester {

public static void main(String[] args){

    //1. Write a brief message to the screen

    System.out.printf("\n%s \n%s","Welcome to the Payroll Tester", "-----------------------------");

    //2.six Employee objects by instantiating Supervisor, Worker, and TeamLeader objects

    Supervisor s1 = new Supervisor("Supervisor", "D'arcy", "French", "2001 10 31", "1976 09 08", 176000, 105);

    Supervisor s2 = new Supervisor("Supervisor", "Janelle", "Birch", "2010 09 314", "1971 10 14", 96000, 70);

    Worker w1 = new Worker("Worker", "Daniel", "Van Patter", "2021 04 30", "2005 01 20", 2, 25.50, 41.0);

    Worker w2 = new Worker("Worker", "Thomas", "O'Neil", "1999 01 31", "1970 05 29", 1, 45.50, 40.0);

    TeamLeader t1 = new TeamLeader("Team Leader", "Judy", "Campbell", "2003 02 25", "1983 11 23", 1, 65.50, 41.0, 54);

    TeamLeader t2 = new TeamLeader("Team Leader", "John", "Greene", "2021 02 28", "1985 03 05", 2, 45.50, 45.0, 75);

    //3. Print each object, using its toString() method. Each toString() should include the object’s calculatePay() method and, in the case of a TeamLeader object, its calculateTrainingLeft() method.

    System.out.println(s1.toString());

    System.out.println(s2.toString());

    System.out.println(w1.toString());

    System.out.println(w2.toString());

    System.out.println(t1.toString());

    System.out.println(t2.toString());

    //4. Create an ArrayList of Payroll objects using the six Employee objects.

    ArrayList<Payroll> list = new ArrayList<>();

    Payroll p1 = new Payroll(s1);

    list.add(p1);

    Payroll p2 = new Payroll(s2);

    list.add(p2);

    Payroll p3 = new Payroll(w1);

    list.add(p3);

    Payroll p4 = new Payroll(w2);

    list.add(p4);

    Payroll p5 = new Payroll(t1);

    list.add(p5);

    Payroll p6 = new Payroll(t2);

    list.add(p6);

    System.out.println("\n* * * * * Payroll Report * * * * * ");

    System.out.println("for the week ending December 2, 2022");

    //5. Print the list calling the static method printReport().

    Payroll.printReport(list);

    //6. Update the Employee objects for the next pay period in the following ways:

    s1.setProductionRate(115); //a. D’arcy French’s production rate this week is 115%

    s2.setProductionRate(110); //b. Janelle Birch’s production rate is 110%

    w1.setHours(44.0); //c. Daniel Van Patter worked 44 hours and received an increase in his hourly rate of $1.50
    w1.setRate(27.00); 

    w2.setHours(37); //d. Thomas O’Neil worked 37 hours

    t1.setHours(42.75); //e. Judy Campbell worked 42.75 hours and completed an additional 10 hours of training
    t1.setCompletedTraining(64);
    t1.calculateTrainingLeft();

    t2.setHours(44); //f. John Greene worked 44 hours and completed an additional 6 hours of training and John was switched to the day shift this week
    t2.setCompletedTraining(81);
    t2.calculateTrainingLeft();
    t2.setShift(1);

    //Correction-
    //TeamLeader toString() should output Completed Training (current value of class field) and Training Left (call calculateTrainingLeft())

    System.out.println(t1);

    System.out.println(t2);

    //7. Update the Payroll ArrayList with the updated Employee objects

    p1 = new Payroll(s1);

    p2 = new Payroll(s2);

    p3 = new Payroll(w1);

    p4 = new Payroll(w2);

    p5 = new Payroll(t1);

    p6 = new Payroll(t2);

    //8. Print the list calling the static method printReport().

    System.out.println("\n* * * * * Payroll Report * * * * * ");

    System.out.println("for the week ending December 9, 2022");

    Payroll.printReport(list);

}
}