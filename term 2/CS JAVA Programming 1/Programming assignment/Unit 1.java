CS 1102 Unit 1 Programming Assignment Solution
Answer:
import javax.swing.JOptionPane;
public class SuperPower {
public static void main(String[] args) {
String power = JOptionPane.showInputDialog("What is your super power?");
power = power.toUpperCase();
JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
}
} 