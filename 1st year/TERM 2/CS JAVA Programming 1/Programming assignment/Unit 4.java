Unit 4 Programming Assignment Solution


The quiz questions, answers, and choices for correct answer should be unique for each submission. Here is an example.

import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MultipleChoiceQuestion {   
	static int nQuestions = 0;
	static int nCorrect = 0;
	String question;
	String correctAnswer;
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";
		correctAnswer = answer;
		correctAnswer= correctAnswer.toUpperCase();
	}

String ask() {
	 while (true) {
		 String answer = JOptionPane.showInputDialog(question);
		 answer = answer.toUpperCase();
		 boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
		 if (valid) return answer;
		 JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
	 }
 }


void check() {
	 nQuestions++;
	 String answer = ask();
	 if (answer.equals(correctAnswer)) {
		 JOptionPane.showMessageDialog(null,"Correct!");
		 nCorrect++;
	 } else {
		 JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
	 }
}

void showResults() {
	JOptionPane.showMessageDialog(null,nCorrect+" correct out of"+nQuestions+" questions");
}

}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Quiz {
	 public static void main(String[] args) {
		 MultipleChoiceQuestion question = new MultipleChoiceQuestion("What is a quiz?",
		 "a test of knowledge, especially a brief informal test given to students",
		 "42",
		 "a duck",
		 "to get to the other side",
		 "To be or not to be, that is the question.",
		 "a");
		 question.check();
		 question.showResults();
		 MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("When is a quiz?",
		 "a long, long ago",
		 "right now",
		 "the best of times",
		 "the worst of times",
		 "nevermore","b");
		 question1.check();
		 question1.showResults();
		 MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("Where is a quiz?",
		 "a galaxy far, far away",
		 "under the sea",
		 "right here",
		 "there and back again",
		 "the other side of the mountain",
		 "c");		 
		 question2.check();
		 question2.showResults();

	}
} 





