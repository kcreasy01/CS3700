//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// import swing JOption
import javax.swing.JOptionPane;





void main() {
    // Prompt user for username.
    String username = JOptionPane.showInputDialog("Enter username: ");

    // Prompt user for password.
    String password = JOptionPane.showInputDialog("Enter password: ");

    // Compare the username to Hero and password to Zero. If both are equal, print access message.
    // If either are not equal, print wrong credentials message.
    if (Objects.equals(username, "Hero") && Objects.equals(password, "Zero"))
        JOptionPane.showMessageDialog(null, "Access Granted");
    else
        JOptionPane.showMessageDialog(null, "Incorrect Credentials");




    // end main method
}
