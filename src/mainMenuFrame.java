import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainMenuFrame implements ActionListener{
	
//	private static final Object academicsButton = null;
	
	//only the esc key on the computer can exit out of the main page
	KeyListener exit=new KeyAdapter(){
		  public void keyPressed(KeyEvent evt) { //Create a key press 
		   if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
		    System.exit(0);
		   }
		  }
		 };
		 
	JFrame mainmenuframe = new JFrame();
	
	ImageIcon academics = new ImageIcon(getClass().getResource("academics.png"));
	JButton academicsButton = new JButton(academics);
	
	ImageIcon engagement = new ImageIcon(getClass().getResource("engagement.png"));
	JButton engagementButton = new JButton(engagement);
	
	ImageIcon quiz = new ImageIcon(getClass().getResource("quiz.png"));
	JButton quizButton = new JButton(quiz);
	
	ImageIcon game = new ImageIcon(getClass().getResource("game.png"));
	JButton gameButton = new JButton(game);
	
	ImageIcon announce = new ImageIcon(getClass().getResource("announce.png"));
	JButton announcementsButton = new JButton(announce);
	
	ImageIcon website = new ImageIcon(getClass().getResource("sfwewebsite.png"));
	
	ImageIcon ig = new ImageIcon(getClass().getResource("ig.png"));
	
	ImageIcon fb = new ImageIcon(getClass().getResource("fb.png"));
	
	
	
mainMenuFrame() throws FileNotFoundException{ //Creates a Frame
	
//Here is where we create and place the header Logo
ImageIcon ualogo = new ImageIcon(getClass().getResource("ualogo.png"));
JLabel headerlabel = new JLabel();
headerlabel.setIcon(ualogo);
headerlabel.setBounds(5,5,280,40);

//Here we create the header
JPanel headerPanel = new JPanel();
headerPanel.setVisible(true);
headerPanel.setBackground(new Color(171, 5, 32));
headerPanel.setPreferredSize(new Dimension(1600,50));
headerPanel.setLayout(null);

//Here we create and place the academics button
academicsButton.setBounds(100,180,200,200);
academicsButton.setOpaque(false);
academicsButton.setContentAreaFilled(false);
academicsButton.setFocusable(false);
academicsButton.addActionListener(this);

//Here we create and place the engagement button
engagementButton.setBounds(400,180,200,200);
engagementButton.setOpaque(false);
engagementButton.setContentAreaFilled(false);
engagementButton.setFocusable(false);
engagementButton.addActionListener(this);

//Here we create and place the engagement button
quizButton.setBounds(700,180,200,200);
quizButton.setOpaque(false);
quizButton.setContentAreaFilled(false);
quizButton.setFocusable(false);
quizButton.addActionListener(this);

//Here we create and place the engagement button
gameButton.setBounds(1000,180,200,200);
gameButton.setOpaque(false);
gameButton.setContentAreaFilled(false);
gameButton.setFocusable(false);
gameButton.addActionListener(this);

//Here we create and place the engagement button
announcementsButton.setBounds(900,492,100,100);
announcementsButton.setOpaque(false);
announcementsButton.setContentAreaFilled(false);
announcementsButton.setFocusable(false);
announcementsButton.addActionListener(this);

//Main heading of the page
JLabel centerlabel1 = new JLabel();
centerlabel1.setForeground(new Color(21, 36, 74));
centerlabel1.setFont(new Font("Proxima Nova", Font.PLAIN, 18));
centerlabel1.setText("<html><font face=\"Proxima Nova\" size=\"28\"> Welcome to the Software Engineering Interactive Display</font><br/>"
		+ "<i>This tool will help you learn more about the software engineering programs available at the University of Arizona,"
		+"<br/>get connected with other students through various clubs, and prepare yourself for future employment.</i><br/>"
		+ "</html");
centerlabel1.setBounds(220,0,1200,100);


//centerlables 2 - 5 are the subtitles for each button informing user what clicking the button will do
JLabel centerlabel2 = new JLabel();
centerlabel2.setForeground(new Color(21, 36, 74));
centerlabel2.setFont(new Font("Proxima Nova", Font.PLAIN, 14));
centerlabel2.setText("<html> Learn all about the Software <br/>"
		+"Engineering Major, Minor,"
		+"<br/> and graduate programs."
		+ "<br/></html>");
centerlabel2.setBounds(110,327,200,70);

JLabel centerlabel3 = new JLabel();
centerlabel3.setForeground(new Color(21, 36, 74));
centerlabel3.setFont(new Font("Proxima Nova", Font.PLAIN, 14));
centerlabel3.setText("<html> Explore ways to connect <br/>"
		+"and get involved with other"
		+"<br/>students and explore careers"
		+"<br/>in software engineering.</html>");
centerlabel3.setBounds(410,334,200,70);

JLabel centerlabel4 = new JLabel();
centerlabel4.setForeground(new Color(21, 36,74));
centerlabel4.setFont(new Font("Proxima Nova", Font.PLAIN, 14));
centerlabel4.setText("<html> Test your Software Engineer <br/>"
		+"knowledge. Don't worry, this"
		+"<br/>won't count against your"
		+"<br/>academic record.</html>");
centerlabel4.setBounds(710,334,200,70);

JLabel centerlabel5 = new JLabel();
centerlabel5.setForeground(new Color(21, 36, 74));
centerlabel5.setFont(new Font("Proxima Nova", Font.PLAIN, 14));
centerlabel5.setText("<html> Play a fun and interactive<br/>"
		+"coding game. Designed by"
		+"<br/>a fellow SFWE student!"
		+"<br/></html>");
centerlabel5.setBounds(1010,327,200,70);

//Quote at the bottom of the page
JLabel centerlabel6 = new JLabel();
centerlabel6.setForeground(new Color(171, 5, 32));
centerlabel6.setFont(new Font("Proxima Nova", Font.ITALIC, 16));
centerlabel6.setText("<html>“Our world is becoming more connected and automated every day, and software engineers are a critical part of building the necessary technological infrastructure.”<br/>"
		+ " -David W. Hahn, Craig M. Berge Dean of the College of Engineering.</html>");
centerlabel6.setBounds(100,585,1300,50);

//this is the SFWE website qr code
JLabel centerlabel7 = new JLabel();
centerlabel7.setIcon(website);
centerlabel7.setBounds(300,390,200,200);

//this is the SFWE website subtitle
JLabel centerlabel8 = new JLabel();
centerlabel8.setForeground(new Color(21, 36, 74));
centerlabel8.setFont(new Font("Proxima Nova", Font.PLAIN, 12));
centerlabel8.setText("SFWE Website");
centerlabel8.setBounds(306,540, 100 , 25);

//this is the SFWE instagram qr code
JLabel centerlabel9 = new JLabel();
centerlabel9.setIcon(ig);
centerlabel9.setBounds(500,390,200,200);

JLabel centerlabel10 = new JLabel();
centerlabel10.setForeground(new Color(21, 36, 74));
centerlabel10.setFont(new Font("Proxima Nova", Font.PLAIN, 12));
centerlabel10.setText("SFWE Instagram");
centerlabel10.setBounds(505,540, 100 , 25);

//this is the SFWE facebook qr code
JLabel centerlabel11 = new JLabel();
centerlabel11.setIcon(fb);
centerlabel11.setBounds(700,390,200,200);

JLabel centerlabel12 = new JLabel();
centerlabel12.setForeground(new Color(21, 36, 74));
centerlabel12.setFont(new Font("Proxima Nova", Font.PLAIN, 12));
centerlabel12.setText("SFWE Facebook");
centerlabel12.setBounds(705,540, 100 , 25);

JLabel centerlabel13 = new JLabel();
centerlabel13.setForeground(new Color(21, 36, 74));
centerlabel13.setFont(new Font("Proxima Nova", Font.PLAIN, 12));
centerlabel13.setText("Announcements");
centerlabel13.setBounds(905,540, 100 , 25);

//Divider 1
JLabel centerlabel14 = new JLabel();
centerlabel14.setOpaque(true);
centerlabel14.setBackground(new Color(55, 141, 189));
centerlabel14.setBounds(200,425, 900 , 1);

//Divider 2
JLabel centerlabel15 = new JLabel();
centerlabel15.setOpaque(true);
centerlabel15.setBackground(new Color(55, 141, 189));
centerlabel15.setBounds(200,575, 900 , 1);

//Attempt at creating an announcements ticker from a txt file:

//File announcementsFile = new File("C:\\Users\\Coulter\\Desktop\\announcements.txt"); //import announcements txt. This will need to change once txt file is uploaded on SFWE computer
//@SuppressWarnings("resource")
//Scanner scan = new Scanner(announcementsFile);
//String announcementsContent = "";
//while (scan.hasNextLine()) {
//	announcementsContent = announcementsContent.concat(scan.nextLine() + "\n");
//}
//JTextArea textArea = new JTextArea(200,100);
//JScrollPane announcescroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//System.out.println(announcementsContent);
//textArea.setText(announcementsContent);
//textArea.setLineWrap(true);
//textArea.setWrapStyleWord(true);
//
//JLabel centerlabel10 = new JLabel();
//centerlabel10.add(announcescroll);
////centerlabel10.setText(announcementsContent);
//centerlabel10.setBounds(365,420,200,100);

//Here we create the center panel of the page
JPanel centerPanel = new JPanel();
centerPanel.setVisible(true);
centerPanel.setBackground(new Color(226, 233, 235));
centerPanel.setPreferredSize(new Dimension(1600,500));
centerPanel.setLayout(null);


//Here we add the Native American statement to the footer
JLabel footerlabel = new JLabel();
footerlabel.setForeground(Color.white);
footerlabel.setText("<html>We respectfully acknowledge the University of Arizona is on the land and territories of Indigenous peoples. <br/> Today, Arizona is home to 22 federally recognized tribes, with Tucson being home to the O’odham and the Yaqui. <br/> Committed to diversity and inclusion, the University strives to build sustainable relationships with sovereign Native Nations and Indigenous communities through education offerings, partnerships, and community service.</html>");
footerlabel.setVerticalAlignment(JLabel.CENTER);
footerlabel.setHorizontalAlignment(JLabel.CENTER);

//Here we create the footer
JPanel footerPanel = new JPanel();
footerPanel.setBackground(new Color(21, 36, 74));
footerPanel.setPreferredSize(new Dimension(1600,75));
footerPanel.setLayout(new BorderLayout());

//Creating the main menu frame
mainmenuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of program
mainmenuframe.setExtendedState(JFrame.MAXIMIZED_BOTH); //Set frame to full screen
mainmenuframe.setUndecorated(true); //remove top bar
mainmenuframe.setLayout(new BorderLayout());
mainmenuframe.setResizable(false); //Prevent frame from being resized
mainmenuframe.setVisible(true); // Make the frame visible
mainmenuframe.addKeyListener(exit); //When user presses esc the frame closes
mainmenuframe.getContentPane().setBackground(Color.white); //Set background color

//adding the header panel/label to the main menu frame
headerPanel.add(headerlabel); //Add UA logo to header
mainmenuframe.add(headerPanel,BorderLayout.NORTH); //Add header

//adding all the information to the centerpanel
centerPanel.add(centerlabel1);
centerPanel.add(centerlabel2);
centerPanel.add(centerlabel3);
centerPanel.add(centerlabel4);
centerPanel.add(centerlabel5);
centerPanel.add(centerlabel6);
centerPanel.add(centerlabel7);
centerPanel.add(centerlabel8);
centerPanel.add(centerlabel9);
centerPanel.add(centerlabel10);
centerPanel.add(centerlabel11);
centerPanel.add(centerlabel12);
centerPanel.add(centerlabel13);
centerPanel.add(centerlabel14);
centerPanel.add(centerlabel15);

//adding the buttons to the main menu frame
mainmenuframe.add(academicsButton);
mainmenuframe.add(engagementButton);
mainmenuframe.add(quizButton);
mainmenuframe.add(gameButton);
mainmenuframe.add(announcementsButton);
mainmenuframe.add(centerPanel,BorderLayout.CENTER);


footerPanel.add(footerlabel);
mainmenuframe.add(footerPanel,BorderLayout.SOUTH);//Add footer
}
@Override
//Here is what happens when a button is pressed
public void actionPerformed(ActionEvent e) {
	if (e.getSource()== academicsButton) {
		
		academicsPage academicspage = new academicsPage();
		
	}
		
	else if (e.getSource()== engagementButton) {
			
		engagementPage engagementpage = new engagementPage();
	}
		
	else if (e.getSource()== quizButton) {
			
			quizPage quizpage = new quizPage();
	}
			
	else if (e.getSource()== gameButton) {
				
		gamePage gamepage = new gamePage();
		
	}
	else if (e.getSource() == announcementsButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://news.engineering.arizona.edu/").toURI());
		}
		catch(Exception e1) {
	}
	}

}

}