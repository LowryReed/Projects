public class Exam extends Assessment {
    private double pointsEach;

    public Exam(int questions, int missed) {
        // Manually throw exception if questions is 0 to handle the error in Runner
        if (questions == 0) throw new ArithmeticException();

        this.pointsEach = 100.0 / questions;
        double numericScore = 100.0 - (missed * pointsEach);

        // Sets the calculated score using the inherited method from Assessment
        setScore((int) numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }
}