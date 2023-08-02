/*Name- Sameer Shaligram
 * Date- Dec 11, 2022
 * Purpose- Employee: an abstract superclass which holds features that are common to its subclasses
 */


public abstract class Employee{

    //variable declaration

    private String level;
    private String firstName;
    private String lastName;
    private String hireDate;
    private String birthDate;
    private String employeeNumber;

    //5-arg constructor

    public Employee(String level, String firstName, String lastName, String hireDate, String birthDate){

        this.level = level;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.birthDate = birthDate;
        setEmployeeNumber();
    }

    //getter and setter methods

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    //a method call in the constructor to the setter method setEmployeeNumber() which creates a unique ID number.
    private void setEmployeeNumber() {

        employeeNumber = generateLevelCode();

            
    }

    //the employee’s level code is generated by calling generateLevelCode()
    private String generateLevelCode(){

        String code = "";

        if(level.equals("Worker")){

            code = "WKR-";
        }

        else if(level.equals("Team Leader")){

             code = "LDR-";
        }

        else if(level.equals("Supervisor")){

            code = "SPR-";
       }

       int[] randomArray = new int[5];

       for(int i = 0; i < randomArray.length; i++)
            {
                randomArray[i] = (int)(Math.random() * 10); //random 5-digits from 0-9
            }

            StringBuilder sb = new StringBuilder(randomArray.length);
            for (int i : randomArray) {
                sb.append(i);
            }

            String s = sb.toString();

            //arr = Arrays.toString(randomArray);

            //}
        
            String empNum = code + (lastName.substring(0,2)).toUpperCase() + (firstName.substring(0,2)).toUpperCase() + "-" + s;

        return empNum;

    }

    //abstract method - calculatePay() which will return weekly gross pay for any Employee subclass

    public abstract double calculatePay();

    public String toString(){


        String str = String.format("\n%-20s %s \n%-20s %s \n%-20s %s \n%-20s %s \n%-20s %s \n%-20s %s", "Employee Level: ", level, "First Name: ", firstName, "Last Name: ", lastName, "Hire Date: ", hireDate, "Birth Date: ", birthDate, "Employee Number: ", employeeNumber);
        return str;
        
    }


}