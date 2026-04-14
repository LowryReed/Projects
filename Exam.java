/**
 * Reed Lowry
 * This class represents an exam, which is a specific type of assessment.
 * It calculates the score based on the number of questions and the number of missed questions, 
 * and it also provides a method to get the points each question is worth.
 * 13 Apr 2025
 */

public class Exam extends Assessment {
    private double pointsEach;

    public Exam(int questions, int missed) {
        pointsEach = 100.0 / questions;
        int numericScore = (int) Math.round(100.0 - (missed * pointsEach));
        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }
}