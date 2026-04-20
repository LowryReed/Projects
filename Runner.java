import javax.swing.JOptionPane;

public class Runner {
    public static void main(String[] args) {
        String input;
        int questions, missed;

        try {
            // Collect and parse input, which could throw a NumberFormatException
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            questions = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            missed = Integer.parseInt(input);

            Exam exam = new Exam(questions, missed);

            // Display results to the user via a message dialog
            String message = "Each question counts " + exam.getPointsEach() + " points.";
            message += "\nScore: " + exam.getScore() + "\nGrade: " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException | ArithmeticException e) {
            // Handle cases where input is not a number or the exam has 0 questions
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter valid numbers.");
        }
        System.exit(0);
    }
}