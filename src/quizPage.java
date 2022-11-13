import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class quizPage {
	 
JFrame quizPage = new JFrame();
JLabel headerlabel = new JLabel();
JPanel headerPanel = new JPanel();
JPanel centerPanel = new JPanel();

quizPage(){ //Creates a Frame
//Here is where we create and place the header Logo
ImageIcon ualogo = new ImageIcon(getClass().getResource("ualogo.png"));
headerlabel.setIcon(ualogo);
headerlabel.setBounds(5,5,280,40);

//Here we create the header
headerPanel.setVisible(true);
headerPanel.setBackground(new Color(171, 5, 32));
headerPanel.setPreferredSize(new Dimension(1600,50));
headerPanel.setLayout(null);


//Here we create the center panel of the page
centerPanel.setVisible(true);
centerPanel.setBackground(new Color(226, 233, 235));
centerPanel.setPreferredSize(new Dimension(1600,500));
centerPanel.setLayout(null);

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

}
}

