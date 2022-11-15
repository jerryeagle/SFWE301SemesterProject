import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class engagementPage {
	 
JFrame engagementPage = new JFrame();
JLabel headerlabel = new JLabel();
JPanel headerPanel = new JPanel();
JPanel centerPanel = new JPanel();

engagementPage(){ //Creates a Frame
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

engagementPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Exit out of program
engagementPage.setExtendedState(JFrame.MAXIMIZED_BOTH); //Set frame to full screen
engagementPage.setTitle("Software Engineering Engagement Page");
engagementPage.setLayout(new BorderLayout());
engagementPage.setResizable(false); //Prevent frame from being resized
engagementPage.setVisible(true); // Make the frame visible
engagementPage.getContentPane().setBackground(Color.white); //Set background color

ImageIcon sfwelogo = new ImageIcon(getClass().getResource("sfwelogo.png"));
engagementPage.setIconImage(sfwelogo.getImage());

headerPanel.add(headerlabel); //Add UA logo to header
engagementPage.add(headerPanel,BorderLayout.NORTH); //Add header

//this.add(academicsButton);
engagementPage.add(centerPanel,BorderLayout.CENTER);

}
}
