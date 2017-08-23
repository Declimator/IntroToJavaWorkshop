package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("wHaT iS yOuR nAmE?!!!!!");
    JOptionPane.showMessageDialog(null, "Hello " + answer);
}
}