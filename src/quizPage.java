import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class quizPage implements ActionListener{
	
String[] questions = {	//Question 1 
						"What programming language is this written in? \r\n"
						+ "cout << \"Hello world!\" << endl;",
						//Question 2
						"What was the favorite language of Software Engineers in 2022?",
						//Question 3
						"When did the SFWE BS degree debut at the University of Arizona?",
						//Question 4
						"What does a backend engineer specialize in?",
						//Question 5
						"What programming language is this written in? \r\n"
						+ "topFrame = new JFrame(\"Salary\");",
						//Question 6
						"What happens with requirements during validation?",
						//Question 7
						"Which requirement is a proper requirement?",
						//Question 8
						"What class is named Software Assurance and Security?",
						//Question 9
						"Who is the Software Engineering academic advisor?",
						//Question 10
						"Why is Software Engineering right for you?"
	 };

String[][] options = {	//Question 1 
						{"Java", "C++", "Python", "Javascript"},
						//Question 2
						{"Java", "C++", "Python", "Javascript"},
						//Question 3
						{"2018", "2019", "2020", "2021"},
						//Question 4
						{"Developing the user interface" , "Managing the infrastructure of applications" , 
							"Developing the software not visible to the users" , "Checks for potential problems and functionality"},
						//Question 5
						{"Java", "C++", "Python", "Javascript"},
						//Question 6
						{"Convert requirements into a standard form", "Maintain the integrity of the requirements baseline for a product", 
							"Discover requirements by working with ALL stakeholders", "Ensure the requirements describe/define what the customer/user needs"},
						//Question 7
						{"The system shall accept >= 200 inputs", "The system shall be easy to use", "The system shall be bug-free", "The system shall be easily accessible"},
						//Question 8
						{"SFWE302", "SFWE401", "ECE275", "SFWE402"},
						//Question 9
						{"Sharon Oneal", "Mildred Curran", "Juliana Lincoln", "Alexis Vasquez"},
						//Question 10
						{"The median salary for software engineers is over $110,000", "Students are able participate in national competitions and student clubs", 
							"Students will gain specialized software skills in high demand by top employers.", "All of the above!"}
	 };
char[] answers = 	 {	//Question 1 
						'B',
						//Question 2
						'A',
						//Question 3
						'D',
						//Question 4
						'C',
						//Question 5
						'A',
						//Question 6
						'D',
						//Question 7
						'A',
						//Question 8
						'B',
						//Question 9
						'C',
						//Question 10
						'D',
	 };
char guess;
char answer;
int index;
int correctGuesses = 0;
int totalQuestions = questions.length;
int result;
int seconds = 10;
	 
JFrame quizPage = new JFrame();
JTextField textfield = new JTextField();
JTextArea textarea = new JTextArea();
JLabel headerlabel = new JLabel();
JPanel headerPanel = new JPanel();
JPanel centerPanel = new JPanel();

JButton buttonA = new JButton();
JButton buttonB = new JButton();
JButton buttonC = new JButton();
JButton buttonD = new JButton();
JLabel answerLabelA = new JLabel();
JLabel answerLabelB = new JLabel();
JLabel answerLabelC = new JLabel();
JLabel answerLabelD = new JLabel();
JLabel timeLabel = new JLabel();
JLabel secondsLeft = new JLabel();
JTextField numberRight = new JTextField();
JTextField percentage = new JTextField();

Timer timer = new Timer(1000,new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		seconds--;
		secondsLeft.setText(String.valueOf(seconds));
		if(seconds<=0) {
			displayAnswer();
		}
		}
});


quizPage(){ //Creates a Frame
//Here is where we create and place the header Logo
ImageIcon ualogo = new ImageIcon(getClass().getResource("ualogo.png"));
headerlabel.setIcon(ualogo);
headerlabel.setBounds(5,5,280,40);

//Here we create the header
headerPanel.setVisible(true);
headerPanel.setBackground(new Color(171, 5, 32));
headerPanel.setPreferredSize(new Dimension(1300,50));
headerPanel.setLayout(null);


//Here we create the center panel of the page
centerPanel.setVisible(true);
centerPanel.setBackground(new Color(226, 233, 235));
centerPanel.setPreferredSize(new Dimension(1300,500));
centerPanel.setLayout(null);
centerPanel.add(textfield);
centerPanel.add(textarea);
centerPanel.add(buttonA);
centerPanel.add(buttonB);
centerPanel.add(buttonC);
centerPanel.add(buttonD);
centerPanel.add(answerLabelA);
centerPanel.add(answerLabelB);
centerPanel.add(answerLabelC);
centerPanel.add(answerLabelD);
centerPanel.add(secondsLeft);
centerPanel.add(timeLabel);

textfield.setBounds(0, 0, 1400, 50);
textfield.setBackground(null);
textfield.setForeground(new Color(21, 36, 74));
textfield.setFont(new Font("Proxima Nova", Font.BOLD, 48));
textfield.setBorder(BorderFactory.createBevelBorder(1));
textfield.setHorizontalAlignment(JTextField.CENTER);
textfield.setEditable(false);

textarea.setBounds(0, 50, 1400, 100);
textarea.setLineWrap(true);
textarea.setWrapStyleWord(true);
textarea.setBackground(null);
textarea.setForeground(new Color(21, 36, 74));
textarea.setFont(new Font("Proxima Nova", Font.PLAIN, 32));
textarea.setEditable(false);

buttonA.setBounds(10,175,100,100);
buttonA.setFont(new Font("Proxima Nova", Font.PLAIN, 28));
buttonA.setText("A");
buttonA.setOpaque(false);
buttonA.setFocusable(false);
buttonA.setContentAreaFilled(false);
buttonA.addActionListener(this);

answerLabelA.setBounds(125,175,1100,100);
answerLabelA.setBackground(null);
answerLabelA.setForeground(new Color(21, 36, 74));
answerLabelA.setFont(new Font("Proxima Nova", Font.PLAIN, 28));

buttonB.setBounds(10,300,100,100);
buttonB.setFont(new Font("Proxima Nova", Font.PLAIN, 28));
buttonB.setText("B");
buttonB.setOpaque(false);
buttonB.setFocusable(false);
buttonB.setContentAreaFilled(false);
buttonB.addActionListener(this);

answerLabelB.setBounds(125,300,1100,100);
answerLabelB.setBackground(null);
answerLabelB.setForeground(new Color(21, 36, 74));
answerLabelB.setFont(new Font("Proxima Nova", Font.PLAIN, 28));

buttonC.setBounds(10,425,100,100);
buttonC.setFont(new Font("Proxima Nova", Font.PLAIN, 28));
buttonC.setText("C");
buttonC.setOpaque(false);
buttonC.setFocusable(false);
buttonC.setContentAreaFilled(false);
buttonC.addActionListener(this);

answerLabelC.setBounds(125,425,1100,100);
answerLabelC.setBackground(null);
answerLabelC.setForeground(new Color(21, 36, 74));
answerLabelC.setFont(new Font("Proxima Nova", Font.PLAIN, 28));

buttonD.setBounds(10,550,100,100);
buttonD.setFont(new Font("Proxima Nova", Font.PLAIN, 28));
buttonD.setText("D");
buttonD.setOpaque(false);
buttonD.setFocusable(false);
buttonD.setContentAreaFilled(false);
buttonD.addActionListener(this);

answerLabelD.setBounds(125,550,1100,100);
answerLabelD.setBackground(null);
answerLabelD.setForeground(new Color(21, 36, 74));
answerLabelD.setFont(new Font("Proxima Nova", Font.PLAIN, 28));

secondsLeft.setBounds(1260,590,100,100);
secondsLeft.setBackground(null);
secondsLeft.setForeground(new Color(171, 5, 32));
secondsLeft.setFont(new Font("Proxima Nova", Font.BOLD, 48));
secondsLeft.setBorder(BorderFactory.createBevelBorder(1));
secondsLeft.setOpaque(true);
secondsLeft.setHorizontalAlignment(JTextField.CENTER);
secondsLeft.setText(String.valueOf(seconds));

timeLabel.setBounds(1260, 555,100,25);
timeLabel.setBackground(null);
timeLabel.setForeground(new Color(21, 36, 74));
timeLabel.setFont(new Font("Proxima Nova", Font.PLAIN, 18));
timeLabel.setHorizontalAlignment(JTextField.CENTER);
timeLabel.setText("Time left: ");

numberRight.setBounds(325, 225, 700, 100);
numberRight.setBackground(null);
numberRight.setForeground(new Color(21, 36, 74));
numberRight.setFont(new Font("Proxima Nova", Font.BOLD, 48));
//numberRight.setBorder(BorderFactory.createBevelBorder(1));
numberRight.setHorizontalAlignment(JTextField.CENTER);
numberRight.setEditable(false);

percentage.setBounds(425, 325, 500, 100);
percentage.setBackground(null);
percentage.setForeground(new Color(21, 36, 74));
percentage.setFont(new Font("Proxima Nova", Font.BOLD, 48));
//percentage.setBorder(BorderFactory.createBevelBorder(1));
percentage.setHorizontalAlignment(JTextField.CENTER);
percentage.setEditable(false);

quizPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Exit out of program
quizPage.setExtendedState(JFrame.MAXIMIZED_BOTH); //Set frame to full screen
quizPage.setTitle("Software Engineering Quiz Page");
quizPage.setLayout(new BorderLayout());
quizPage.setResizable(false); //Prevent frame from being resized
quizPage.setVisible(true); // Make the frame visible
quizPage.getContentPane().setBackground(Color.white); //Set background color

ImageIcon sfwelogo = new ImageIcon(getClass().getResource("sfwelogo.png"));
quizPage.setIconImage(sfwelogo.getImage());

headerPanel.add(headerlabel); //Add UA logo to header
quizPage.add(headerPanel,BorderLayout.NORTH); //Add header

//this.add(academicsButton);
quizPage.add(centerPanel,BorderLayout.CENTER);

nextQuestion();
	
}
	public void nextQuestion(){
		if(index>=totalQuestions) {
			results();
		}
		else {
			textfield.setText("Question " + (index+1));
			textarea.setText(questions[index]);
			answerLabelA.setText(options[index][0]);
			answerLabelB.setText(options[index][1]);
			answerLabelC.setText(options[index][2]);
			answerLabelD.setText(options[index][3]);
			timer.start();
		}
	}
	
@Override
public void actionPerformed(ActionEvent e) {
	
	buttonA.setEnabled(false);
	buttonB.setEnabled(false);
	buttonC.setEnabled(false);
	buttonD.setEnabled(false);
	
	if (e.getSource() == buttonA) {
		answer = 'A';
		if(answer == answers[index]) {
			correctGuesses++;
		}	
	}
	if (e.getSource() == buttonB) {
		answer = 'B';
		if(answer == answers[index]) {
			correctGuesses++;
		}	
	}
	if (e.getSource() == buttonC) {
		answer = 'C';
		if(answer == answers[index]) {
			correctGuesses++;
		}	
	}
	if (e.getSource() == buttonD) {
		answer = 'D';
		if(answer == answers[index]) {
			correctGuesses++;
		}	
	}
	displayAnswer();
}

public void displayAnswer() {
	
	timer.stop();
	buttonA.setEnabled(false);
	buttonB.setEnabled(false);
	buttonC.setEnabled(false);
	buttonD.setEnabled(false);
	
	if(answers[index] != 'A') {
		answerLabelA.setForeground(new Color(171, 5, 32));
	}
	else {
		answerLabelA.setForeground(new Color(112, 184, 101));
	}
	
	if(answers[index] != 'B') {
		answerLabelB.setForeground(new Color(171, 5, 32));
	}
	else {
		answerLabelB.setForeground(new Color(112, 184, 101));
	}
	
	if(answers[index] != 'C') {
		answerLabelC.setForeground(new Color(171, 5, 32));
	}
	else {
		answerLabelC.setForeground(new Color(112, 184, 101));
	}
	
	if(answers[index] != 'D') {
		answerLabelD.setForeground(new Color(171, 5, 32));
	}
	else {
		answerLabelD.setForeground(new Color(112, 184, 101));
	}
		
	Timer pause = new Timer(1000,new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			answerLabelA.setForeground(new Color(21, 36, 74));
			answerLabelB.setForeground(new Color(21, 36, 74));
			answerLabelC.setForeground(new Color(21, 36, 74));
			answerLabelD.setForeground(new Color(21, 36, 74));
			
			answer = ' ';
			seconds = 10;
			secondsLeft.setText(String.valueOf(seconds));
			buttonA.setEnabled(true);
			buttonB.setEnabled(true);
			buttonC.setEnabled(true);
			buttonD.setEnabled(true);
			index++;
			nextQuestion();
		}
	});
	pause.setRepeats(false);
	pause.start();
}
public void results() {
	buttonA.setEnabled(false);
	buttonB.setEnabled(false);
	buttonC.setEnabled(false);
	buttonD.setEnabled(false);
	
	result = (int)((correctGuesses/(double)totalQuestions)*100);
	textfield.setText("RESULTS: ");
	textarea.setText("");
	answerLabelA.setText("");
	answerLabelB.setText("");
	answerLabelC.setText("");
	answerLabelD.setText("");
	
	numberRight.setText("You got " + correctGuesses + " out of " + totalQuestions+ " correct");
	percentage.setText("You scored a " + result+"%");
	centerPanel.add(percentage);
	centerPanel.add(numberRight);
}

}
	

