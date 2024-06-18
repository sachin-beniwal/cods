import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApp extends JFrame {

    private JLabel questionLabel;
    private ButtonGroup optionsGroup;
    private JRadioButton option1, option2, option3, option4;
    private JButton submitButton;

    private String[][] questions = {
            {"What is the capital of France?", "Paris", "Berlin", "Madrid", "Rome"},
            {"Which programming language is this quiz written in?", "Java", "Python", "C++", "JavaScript"},
            {"What is the largest planet in our solar system?", "Jupiter", "Saturn", "Neptune", "Mars"}
    };

    private int currentQuestionIndex = 0;

    public QuizApp() {
        setTitle("Quiz Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        setLayout(new GridLayout(7, 1));

        add(questionLabel);
        add(option1);
        add(option2);
        add(option3);
        add(option4);
        add(submitButton);

        setVisible(true);
    }

    private void initComponents() {
        questionLabel = new JLabel(questions[currentQuestionIndex][0]);

        optionsGroup = new ButtonGroup();
        option1 = new JRadioButton(questions[currentQuestionIndex][1]);
        option2 = new JRadioButton(questions[currentQuestionIndex][2]);
        option3 = new JRadioButton(questions[currentQuestionIndex][3]);
        option4 = new JRadioButton(questions[currentQuestionIndex][4]);

        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });
    }

    private void checkAnswer() {
        JRadioButton selectedOption = null;

        if (option1.isSelected()) {
            selectedOption = option1;
        } else if (option2.isSelected()) {
            selectedOption = option2;
        } else if (option3.isSelected()) {
            selectedOption = option3;
        } else if (option4.isSelected()) {
            selectedOption = option4;
        }

        if (selectedOption != null && selectedOption.getText().equals(questions[currentQuestionIndex][1])) {
            JOptionPane.showMessageDialog(this, "Correct!");
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect. The correct answer is: " + questions[currentQuestionIndex][1]);
        }

        if (currentQuestionIndex < questions.length - 1) {
            // Move to the next question
            currentQuestionIndex++;
            updateQuestion();
        } else {
            // End of the quiz
            JOptionPane.showMessageDialog(this, "Quiz completed!");
            System.exit(0);
        }
    }

    private void updateQuestion() {
        questionLabel.setText(questions[currentQuestionIndex][0]);
        option1.setText(questions[currentQuestionIndex][1]);
        option2.setText(questions[currentQuestionIndex][2]);
        option3.setText(questions[currentQuestionIndex][3]);
        option4.setText(questions[currentQuestionIndex][4]);

        optionsGroup.clearSelection(); // Clear previous selection
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizApp();
            }
        });
    }
}
