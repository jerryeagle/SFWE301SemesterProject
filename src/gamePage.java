import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class gamePage implements ActionListener{

Random random = new Random();
JFrame gamePage = new JFrame();
JLabel headerlabel = new JLabel();
JPanel headerPanel = new JPanel();
JPanel centerPanel = new JPanel();
JTextField textfield = new JTextField();
JTextArea textarea = new JTextArea();
JButton[] buttons = new JButton[9];
JButton reset = new JButton();
JButton exit=new JButton();
JButton blank=new JButton();
boolean player1_turn;
ImageIcon wilbur = new ImageIcon(getClass().getResource("wilbur.png"));
ImageIcon wilma = new ImageIcon(getClass().getResource("wilma.png"));
ImageIcon ua = new ImageIcon(getClass().getResource("ua.png"));

gamePage(){ //Creates a Frame
	//Here is where we create and place the header Logo
	ImageIcon ualogo = new ImageIcon(getClass().getResource("ualogo.png"));
	headerlabel.setIcon(ualogo);
	headerlabel.setBounds(5,5,280,40);
	
	//Here we create the header
	headerPanel.setVisible(true);
	headerPanel.setBackground(new Color(171, 5, 32));
	headerPanel.setPreferredSize(new Dimension(1600,50));
	headerPanel.setLayout(null);
	headerPanel.add(headerlabel); //Add UA logo to header
	
	textfield.setBounds(0, 0, 1400, 50);
	textfield.setBackground(null);
	textfield.setForeground(new Color(21, 36, 74));
	textfield.setFont(new Font("Proxima Nova", Font.BOLD, 36));
	textfield.setText("Lets play some TicTacToe, Wildcat style!");
	textfield.setBorder(BorderFactory.createBevelBorder(1));
	textfield.setHorizontalAlignment(JTextField.CENTER);
	textfield.setEditable(false);
	
	textarea.setBounds(550, 50, 1400, 50);
	textarea.setLineWrap(true);
	textarea.setWrapStyleWord(true);
	textarea.setBackground(null);
	textarea.setForeground(new Color(21, 36, 74));
	textarea.setFont(new Font("Proxima Nova", Font.PLAIN, 38));
	textarea.setEditable(false);
	
	//Here we create the center panel of the page
	centerPanel.setVisible(true);
	centerPanel.setBackground(new Color(226, 233, 235));
	centerPanel.setPreferredSize(new Dimension(1600,500));
	centerPanel.setLayout(null);
	centerPanel.add(textfield);
	centerPanel.add(textarea);
	centerPanel.add(reset);
	centerPanel.add(blank);
	centerPanel.add(exit);
	
	gamePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Exit out of program
	gamePage.setExtendedState(JFrame.MAXIMIZED_BOTH); //Set frame to full screen
	gamePage.setTitle("Software Engineering Game Page");
	gamePage.setLayout(new BorderLayout());
	gamePage.setResizable(false); //Prevent frame from being resized
	gamePage.setVisible(true); // Make the frame visible
	gamePage.getContentPane().setBackground(Color.white); //Set background color
	gamePage.add(headerPanel,BorderLayout.NORTH); //Add header
	gamePage.add(centerPanel,BorderLayout.CENTER); //Add center label
	
	ImageIcon sfwelogo = new ImageIcon(getClass().getResource("sfwelogo.png"));
	gamePage.setIconImage(sfwelogo.getImage());
	
		//Top Row
		int x = 480;
		int y = 100;
		for(int i =0;i<3;i++){
			buttons[i]=new JButton();
			buttons[i].setBounds(x, y, 150, 150);
			buttons[i].setBackground(Color.white);
			centerPanel.add(buttons[i]);
			buttons[i].setFont(new Font("Proxima Nova",Font.BOLD,2));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			x += 150;
		}
		//Middle Row
		x = 480;
		y = 250;
		for(int i =3;i<6;i++){
			buttons[i]=new JButton();
			buttons[i].setBounds(x, y, 150, 150);
			buttons[i].setBackground(Color.white);
			centerPanel.add(buttons[i]);
			buttons[i].setFont(new Font("Proxima Nova",Font.BOLD,2));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			x += 150;
		}
		//Bottom Row
		x = 480;
		y = 400;
		for(int i =6;i<9;i++){
			buttons[i]=new JButton();
			buttons[i].setBounds(x, y, 150, 150);
			buttons[i].setBackground(Color.white);
			centerPanel.add(buttons[i]);
			buttons[i].setFont(new Font("Proxima Nova",Font.BOLD,2));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			x += 150;
		}
		
		reset.setText("Reset");
		reset.setBounds(480, 550, 150, 150);
		reset.setForeground(new Color(21, 36, 74));
		reset.setBackground(Color.white);
		reset.setFont(new Font("Proxima Nova",Font.BOLD,36));
		
		blank.setBounds(630, 550, 150, 150);
		blank.setIcon(ua);
		blank.setBackground(Color.white); 
		blank.setFont(new Font("Proxima Nova",Font.BOLD,36));
		
		exit.setText("Exit");
		exit.setBounds(780, 550, 150, 150);
		exit.setForeground(new Color(21, 36, 74)); 
		exit.setBackground(Color.white); 
		exit.setFont(new Font("Proxima Nova",Font.BOLD,36));


		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<9;i++) {
					buttons[i].setText("");
					buttons[i].setIcon(null);
					buttons[i].setEnabled(true);
					buttons[i].setBackground(Color.white);
				}
		firstTurn();
			}
		});

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gamePage.dispose();			}
		});

		firstTurn();
}

@Override
public void actionPerformed(ActionEvent e) {
	
	for(int i=0;i<9;i++) {
		if(e.getSource()==buttons[i]) {
			if(player1_turn) {
				if(buttons[i].getText()=="");
					buttons[i].setForeground(new Color(21, 36, 74));
					buttons[i].setIcon(wilbur);
					buttons[i].setText("X");
					player1_turn=false;
					textarea.setText("It is Wilma's Turn");
					check();
			}	
			else
				if(buttons[i].getText()=="");
				buttons[i].setForeground(new Color(171, 5, 32));
				buttons[i].setIcon(wilma);
				buttons[i].setText("O");
				player1_turn=true;
				textarea.setText("It is Wilbur's Turn");
				check();
			}	
	}
	}
public void firstTurn() {
	
	try {
		Thread.sleep(2500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	if(random.nextInt(2)==0) {
		player1_turn=true;
		textarea.setText("It is Wilbur's Turn");
	}
	else {
		player1_turn=false;
		textarea.setText("It is Wilma's Turn");
	}
}

public void check() {
	//check X Win Conditons
	if(
			(buttons[0].getText()=="X") && 
			(buttons[1].getText()=="X") && 
			(buttons[2].getText()=="X")) {
			xWins(0,1,2);
		}
	if(
			(buttons[3].getText()=="X") && 
			(buttons[4].getText()=="X") && 
			(buttons[5].getText()=="X")) {
				xWins(3,4,5);
			}
	if(
			(buttons[6].getText()=="X") && 
			(buttons[7].getText()=="X") && 
			(buttons[8].getText()=="X")) {
				xWins(6,7,8);
			}
	if(
			(buttons[0].getText()=="X") && 
			(buttons[3].getText()=="X") && 
			(buttons[6].getText()=="X")) {
				xWins(0,3,6);
			}
	if(
			(buttons[1].getText()=="X") && 
			(buttons[4].getText()=="X") && 
			(buttons[7].getText()=="X")) {
				xWins(1,4,7);
			}
	if(
			(buttons[2].getText()=="X") && 
			(buttons[5].getText()=="X") && 
			(buttons[8].getText()=="X")) {
				xWins(2,5,8);
			}
	if(
			(buttons[0].getText()=="X") && 
			(buttons[4].getText()=="X") && 
			(buttons[8].getText()=="X")) {
				xWins(0,4,8);
			}
	if(
			(buttons[2].getText()=="X") && 
			(buttons[4].getText()=="X") && 
			(buttons[6].getText()=="X")) {
				xWins(2,4,6);
			}
//check o win conditions
	if(
			(buttons[0].getText()=="O") && 
			(buttons[1].getText()=="O") && 
			(buttons[2].getText()=="O")) {
			oWins(0,1,2);
		}
	if(
			(buttons[3].getText()=="O") && 
			(buttons[4].getText()=="O") && 
			(buttons[5].getText()=="O")) {
			oWins(3,4,5);
			}
	if(
			(buttons[6].getText()=="O") && 
			(buttons[7].getText()=="O") && 
			(buttons[8].getText()=="O")) {
			oWins(6,7,8);
			}
	if(
			(buttons[0].getText()=="O") && 
			(buttons[3].getText()=="O") && 
			(buttons[6].getText()=="O")) {
			oWins(0,3,6);
			}
	if(
			(buttons[1].getText()=="O") && 
			(buttons[4].getText()=="O") && 
			(buttons[7].getText()=="O")) {
			oWins(1,4,7);
			}
	if(
			(buttons[2].getText()=="O") && 
			(buttons[5].getText()=="O") && 
			(buttons[8].getText()=="O")) {
			oWins(2,5,8);
			}
	if(
			(buttons[0].getText()=="O") && 
			(buttons[4].getText()=="O") && 
			(buttons[8].getText()=="O")) {
			oWins(0,4,8);
			}
	if(
			(buttons[2].getText()=="O") && 
			(buttons[4].getText()=="O") && 
			(buttons[6].getText()=="O")) {
			oWins(2,4,6);
			}
//draw conditions
	else if(checkDraw()) {
		textarea.setText("Tied up! Press reset.");
	}
}

public void xWins(int a, int b, int c) {
	buttons[a].setBackground(new Color(112, 184, 101));
	buttons[b].setBackground(new Color(112, 184, 101));
	buttons[c].setBackground(new Color(112, 184, 101));
	
	for(int i=0;i<9;i++) {
		buttons[i].setEnabled(false);
	}
	textarea.setText("   Wilbur Wins!");
}

public void oWins(int a, int b, int c) {
	buttons[a].setBackground(new Color(112, 184, 101));
	buttons[b].setBackground(new Color(112, 184, 101));
	buttons[c].setBackground(new Color(112, 184, 101));
	
	for(int i=0;i<9;i++) {
		buttons[i].setEnabled(false);
	}
	textarea.setText("    Wilma Wins!");
	
}

	public boolean checkDraw(){
		boolean full = true;
		for(int i =0 ; i<9; i++) {
			if(buttons[i].getText().charAt(0)==' ')
				full = false;
		}
		return full;
	}
}	


