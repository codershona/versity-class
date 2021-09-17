Unit 7 Programming Assignment Solution
The quiz questions, answers, and choices for correct answer should be unique for each
submission. Here is an example.
Files "QuestionDialog.java":
import java.awt.event.*;
import javax.swing.*;
public class QuestionDialog extends JDialog implements ActionListener {
String answer;
public void actionPerformed(ActionEvent e) {
answer = e.getActionCommand();
dispose();
}
}
File "Question.java":
import java.awt.*;
import javax.swing.*;
public abstract class Question {
static int nQuestions = 0;
static int nCorrect = 0;
QuestionDialog question;
String correctAnswer;
Question(String question) {
this.question = new QuestionDialog();
this.question.setLayout(new GridLayout(0,1));
this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
}
String ask() {
question.setVisible(true);
return question.answer; 
}
void check() {
nQuestions++;
String answer = ask();
if (answer.equals(correctAnswer)) {
JOptionPane.showMessageDialog(null,"Correct!");
nCorrect++;
} else {
JOptionPane.showMessageDialog(null,"Incorrect. The correct
answer is "+correctAnswer+".");
}
}
void initQuestionDialog() {
this.question.setModal(true);
this.question.pack();
this.question.setLocationRelativeTo(null);
}
static void showResults() {
JOptionPane.showMessageDialog(null,nCorrect+" correct out of
"+nQuestions+" questions");
}
}
File "TrueFalseQuestion.java".
import javax.swing.*;
public class TrueFalseQuestion extends Question {
TrueFalseQuestion(String question, String answer) {
super(question);
JPanel buttons = new JPanel();
addButton(buttons,"TRUE"); 
addButton(buttons,"FALSE");
this.question.add(buttons);
initQuestionDialog();
answer = answer.toUpperCase();
if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") ||
answer.equals("YES")) correctAnswer = "TRUE";
if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") ||
answer.equals("NO")) correctAnswer = "FALSE";
}
void addButton(JPanel buttons, String label) {
JButton button = new JButton(label);
button.addActionListener(question);
buttons.add(button);
}
}
File "MultipleChoiceQuestion.java"
import java.awt.*;
import javax.swing.*;
public class MultipleChoiceQuestion extends Question {
MultipleChoiceQuestion(String query, String a, String b, String c, String d, String
e, String answer) {
super(query);
addChoice("A",a);
addChoice("B",b);
addChoice("C",c);
addChoice("D",d);
addChoice("E",e);
initQuestionDialog();
correctAnswer = answer.toUpperCase(); 
}
void addChoice(String name, String label) {
JPanel choice = new JPanel(new BorderLayout());
JButton button = new JButton(name);
button.addActionListener(question);
choice.add(button,BorderLayout.WEST);
choice.add(new JLabel(label+" ",JLabel.LEFT),BorderLayout.CENTER);
question.add(choice);
}
}
File "Quiz.java". (This file should not have changed since the previous assignment.)
public class Quiz {
public static void main(String[] args) {
Question question = new TrueFalseQuestion("Quizzes are fun!","y");
question.check();
question = new TrueFalseQuestion("Quizzes are more fun than
programming!","n");
question.check();
question = new TrueFalseQuestion("Which one starts with T?","t");
question.check();
question = new TrueFalseQuestion("Which one starts with F?","f");
question.check();
question = new TrueFalseQuestion("Which one is not true?","false");
question.check();
question = new MultipleChoiceQuestion(
"What is a quiz?",
"a test of knowledge, especially a brief informal test given to
students",
"42", 
"a duck",
"to get to the other side",
"To be or not to be, that is the question.",
"a");
question.check();
question = new MultipleChoiceQuestion("When is a quiz?",
"long, long ago",
"right now",
"the best of times",
"the worst of times",
"nevermore",
"b");
question.check();
question = new MultipleChoiceQuestion("Where is a quiz?",
"a galaxy far, far away",
"under the sea",
"right here",
"there and back again",
"the other side of the mountain",
"c");
question.check();
question = new MultipleChoiceQuestion("Why is a quiz?",
"I think, therefore it is.",
"Who is to say?",
"You tell me.",
"Because learning is fun!",
"Because I said so.",
"d");
question.check();
question = new MultipleChoiceQuestion("How is a quiz?",
"fair to middling", 
"not bad",
"by a stroke of luck",
"by accident",
"Using Java object-oriented programming!",
"e");
question.check();
MultipleChoiceQuestion.showResults();
}
}
Screen shot of a true/false question. 
