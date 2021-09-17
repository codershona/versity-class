Unit 5 Programming Assignment Solution
The quiz questions, answers, and choices for correct answer should be unique for each submission. Here
is an example.
File "Question.java":
import javax.swing.JOptionPane;
public abstract class Question {
 static int nQuestions = 0;
 static int nCorrect = 0;
 String question;
 String correctAnswer;
 abstract String ask();
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
 static void showResults() {
 JOptionPane.showMessageDialog(null,nCorrect+" correct out of
"+nQuestions+" questions");
 }
}
File "TrueFalseQuestion.java".
import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {
 String ask() {
 while (true) {
 String answer = JOptionPane.showInputDialog(question);
 answer = answer.toUpperCase();
 if (answer.equals("T") || answer.equals("Y") ||
answer.equals("YES")) answer = "TRUE";
 if (answer.equals("F") || answer.equals("N") ||
answer.equals("NO")) answer = "FALSE";
 boolean valid = (answer.equals("FALSE") ||
answer.equals("TRUE"));
 if (valid) return answer;
 JOptionPane.showMessageDialog(null,"Invalid answer. Please
enter TRUE or FALSE.");
 }
 }
 TrueFalseQuestion(String question, String answer) {
 this.question = "TRUE or FALSE: "+question;
 answer = answer.toUpperCase();
 if (answer.equals("T") || answer.equals("TRUE") ||
answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";
 if (answer.equals("F") || answer.equals("FALSE") ||
answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
 }
}
File "MultipleChoiceQuestion.java"
import javax.swing.JOptionPane;
public class MultipleChoiceQuestion extends Question {
 MultipleChoiceQuestion(String query, String a, String b, String c,
String d, String e, String answer) {
 question = query+"\n";
 question += "A. "+a+"\n";
 question += "B. "+b+"\n";
 question += "C. "+c+"\n";
 question += "D. "+d+"\n";
 question += "E. "+e+"\n";
 correctAnswer = answer.toUpperCase();
 }
 String ask() {
 while (true) {
 String answer = JOptionPane.showInputDialog(question);
 answer = answer.toUpperCase();
 boolean valid = (answer.equals("A") || answer.equals("B")
|| answer.equals("C") || answer.equals("D") || answer.equals("E"));
 if (valid) return answer;
 JOptionPane.showMessageDialog(null,"Invalid answer. Please
enter A, B, C, D, or E.");
 }
 }
}
File "Quiz.java".
public class Quiz {
 public static void main(String[] args) {
 Question question = new TrueFalseQuestion("Quizzes are
fun!","y");
 question.check();
 question = new TrueFalseQuestion("Quizzes are more fun
than programming!","n");
 question.check();
 question = new TrueFalseQuestion("Which one starts with
T?","t");
 question.check();
 question = new TrueFalseQuestion("Which one starts with
F?","f");
 question.check();
 question = new TrueFalseQuestion("Which one is not
true?","false");
 question.check();
 question = new MultipleChoiceQuestion(
 "What is a quiz?",
 "a test of knowledge, especially a brief informal
test given to students",
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