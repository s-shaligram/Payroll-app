/*Name- Sameer Shaligram
 * Date- Dec 11, 2022
 * Purpose- TeamLeader: a subclass of Worker
 */
public class TeamLeader extends Worker{


    //variable declaration

    private static int REQUIRED_TRAINING = 150;
    private static double MONTHLY_BONUS = 100;

    private int completedTraining;

    //no-arg constructors

    public TeamLeader(){
        super();
        completedTraining = 0;
    }

    //9-arg constructor

    public TeamLeader(String level, String firstName, String lastName, String hireDate, String birthDate, int shift, double rate, double hours, int completedTraining)
    {
        super(level, firstName, lastName, hireDate, birthDate, shift, rate, hours);

        this.completedTraining = completedTraining;
    }

    //getter and setter methods

    public int getRequiredTraining() {
        return REQUIRED_TRAINING;
    }

    public double getMonthly_Bonus() {
        return MONTHLY_BONUS;
    }

    public int getCompletedTraining() {
        return completedTraining;
    }

    public void setCompletedTraining(int completedTraining) {
        this.completedTraining = completedTraining;
    }

    //Override the calculatePay() method
    public double calculatePay(){

        return super.calculatePay() + 25;
    }
    //calculateTrainingLeft() method, using the required training hours constant and the team leader’s completed training
    public int calculateTrainingLeft(){

        return REQUIRED_TRAINING - completedTraining;
    }

    public String toString(){

        //String str = "";

        return super.toString() + 
        String.format("\n%s %d \n%-20s %d", "Completed Training: ", completedTraining, "Training Left: ", calculateTrainingLeft());
    }
}
