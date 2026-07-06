import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public  void main(){
    new CalculatorFrame();
}


// Create text labels for prompts
    JLabel firstPromptLabel = new JLabel("Enter First Number: ");
    JLabel secondPromptLabel = new JLabel("Enter Second Number: ");
// Create text fields for entry
    JTextField firstTextField = new JTextField(10);
    JTextField secondTextField = new JTextField(10);

// Create text field for result
    JTextField resultTextField = new JTextField(10);


// create buttons
        JButton multiplyButton = new JButton("*");
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton divideButton = new JButton("/");
        JButton remButton = new JButton("Rem");

    public class CalculatorFrame extends JFrame implements ActionListener {




        CalculatorFrame() {
            // Make program end on closure
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            // Create frame
            JFrame frame = new JFrame();


            // Create label that reads Mini Calculator
            JLabel label = new JLabel("Mini Calculator", SwingConstants.CENTER);

            // Set size for frame
            this.setSize(400, 1000);

            // apply labels
            this.add(label);
            this.add(firstPromptLabel);
            this.add(secondPromptLabel);

            // connect buttons to Action Listener
            multiplyButton.addActionListener(this);
            addButton.addActionListener(this);
            subtractButton.addActionListener(this);
            divideButton.addActionListener(this);
            remButton.addActionListener(this);


            // set font to 14 point, black, and enabled
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
            label.setForeground(Color.BLACK);

            // set font for entry text fields
            firstTextField.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
            firstTextField.setForeground(Color.BLACK);

            secondTextField.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
            secondTextField.setForeground(Color.BLACK);

            // set font for result text fields
            resultTextField.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
            resultTextField.setForeground(Color.BLUE);


            // make text fields editable
            firstTextField.setEditable(true);
            secondTextField.setEditable(true);
            resultTextField.setEditable(false);
            // Add the text fields
            this.add(firstTextField);
            this.add(secondTextField);
            this.add(multiplyButton);
            this.add(addButton);
            this.add(subtractButton);
            this.add(divideButton);
            this.add(remButton);
            this.add(resultTextField);
            this.setLayout(new FlowLayout());


            // Make application visible
            this.setVisible(true);


        }

        @Override
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == multiplyButton) {
                String firstInput = firstTextField.getText();
                String secondInput = secondTextField.getText();
                if (validateInput(firstInput, secondInput)) {
                    double number1 = Double.parseDouble(firstInput);
                    double number2 = Double.parseDouble(firstInput);
                    double result = multiply(number1, number2);
                    String finalResult = String.valueOf(result);
                    resultTextField.setText(finalResult);

                } else if (event.getSource() == addButton) {
                    double number1 = Double.parseDouble(firstInput);
                    double number2 = Double.parseDouble(firstInput);
                    double result = add(number1, number2);
                    String finalResult = String.valueOf(result);
                    resultTextField.setText(finalResult);

                }
            }
        }


        public boolean validateInput(String firstInput, String secondInput) {
            // validate first field
            boolean validInput = true;

            try {
                double number1 = Double.parseDouble(firstInput);

            } catch (NumberFormatException error) {

                validInput = false;
                JOptionPane.showMessageDialog(null, "The first number must have only digits", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }

            // validate second input field

            try {
                double number2 = Double.parseDouble(secondInput);

            } catch (NumberFormatException error) {
                validInput = false;
                JOptionPane.showMessageDialog(null, "The second number must have only digits", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
            return validInput;
        }

        public double multiply(double number1, double number2) {
            double result = number1 * number2;
            return result;


        }

        public double add(double number1, double number2) {
            double result = number1 + number2;
            return result;


        }

        public double subtract(double number1, double number2) {
            double result = number1 - number2;
            return result;


        }

        public double divide(double number1, double number2) {
            double result = number1 / number2;
            return result;


        }

        public double modulo(double number1, double number2) {
            double result = number1 % number2;
            return result;


        }


    }




