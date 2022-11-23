import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class engagementPage implements ActionListener{
	 
JFrame engagementPage = new JFrame();
JLabel headerlabel = new JLabel();
JPanel headerPanel = new JPanel();
JPanel centerPanel = new JPanel();

ImageIcon sfweclub = new ImageIcon(getClass().getResource("sfweclub.png"));
JButton sfweclubButton = new JButton(sfweclub);

ImageIcon engramb = new ImageIcon(getClass().getResource("engramb.png"));
JButton engrambButton = new JButton(engramb);

ImageIcon informs = new ImageIcon(getClass().getResource("informs.png"));
JButton informsButton = new JButton(informs);

ImageIcon iise = new ImageIcon(getClass().getResource("iise.png"));
JButton iiseButton = new JButton(iise);

ImageIcon ieee = new ImageIcon(getClass().getResource("ieee.png"));
JButton ieeeButton = new JButton(ieee);

ImageIcon handshake = new ImageIcon(getClass().getResource("handshake.png"));
JButton handshakeButton = new JButton(handshake);

ImageIcon onet = new ImageIcon(getClass().getResource("onet.png"));
JButton onetButton = new JButton(onet);

ImageIcon stats = new ImageIcon(getClass().getResource("sfwestats.png"));

ImageIcon discord = new ImageIcon(getClass().getResource("discord.png"));

engagementPage(){ //Creates a Frame
//Here is where we create and place the header Logo
ImageIcon ualogo = new ImageIcon(getClass().getResource("ualogo.png"));
headerlabel.setIcon(ualogo);
headerlabel.setBounds(5,5,280,40);

//Main heading of the page
JLabel centerlabel1 = new JLabel();
centerlabel1.setForeground(new Color(21, 36, 74));
centerlabel1.setFont(new Font("Proxima Nova", 0, 24));
centerlabel1.setText("<html>Check out these amazing clubs and get involved with other students!<br/>"
		+ "</html");
centerlabel1.setBounds(300,5,1200,30);

//this is the SFWE statistics
JLabel centerlabel2 = new JLabel();
centerlabel2.setIcon(stats);
centerlabel2.setBounds(650,362,700,330);

//this is the SFWE discord
JLabel centerlabel3 = new JLabel();
centerlabel3.setIcon(discord);
centerlabel3.setBounds(14,520,200,200);

//this is the SFWE discord subtitle
JLabel centerlabel4 = new JLabel();
centerlabel4.setForeground(new Color(21, 36, 74));
centerlabel4.setFont(new Font("Proxima Nova", 0, 12));
centerlabel4.setText("Check us out on discord!");
centerlabel4.setBounds(1,670, 150 , 25);

JLabel centerlabel5 = new JLabel();
centerlabel5.setForeground(new Color(21, 36, 74));
centerlabel5.setFont(new Font("Proxima Nova", 0, 24));
centerlabel5.setText("<html>Explore Software Engineering career information below. It is never too early!<br/>"
		+ "</html");
centerlabel5.setBounds(300,335,1200,30);

//Divider
JLabel centerlabel6 = new JLabel();
centerlabel6.setOpaque(true);
centerlabel6.setBackground(new Color(55, 141, 189));
centerlabel6.setBounds(250,300, 900 , 1);

//Here we create the header
headerPanel.setVisible(true);
headerPanel.setBackground(new Color(171, 5, 32));
headerPanel.setPreferredSize(new Dimension(1600,50));
headerPanel.setLayout(null);

//Here we create and place the sfwe club button
sfweclubButton.setBounds(70,100,200,200);
sfweclubButton.setOpaque(false);
sfweclubButton.setContentAreaFilled(false);
sfweclubButton.setFocusable(false);
sfweclubButton.addActionListener(this);

//Here we create and place the engineering ambassadors button
engrambButton.setBounds(320,100,200,200);
engrambButton.setOpaque(false);
engrambButton.setContentAreaFilled(false);
engrambButton.setFocusable(false);
engrambButton.addActionListener(this);

//Here we create and place the informs button
informsButton.setBounds(570,100,200,200);
informsButton.setOpaque(false);
informsButton.setContentAreaFilled(false);
informsButton.setFocusable(false);
informsButton.addActionListener(this);

//Here we create and place the iise/incose button
iiseButton.setBounds(820,100,200,200);
iiseButton.setOpaque(false);
iiseButton.setContentAreaFilled(false);
iiseButton.setFocusable(false);
iiseButton.addActionListener(this);

//Here we create and place the ieee button
ieeeButton.setBounds(1070,100,200,200);
ieeeButton.setOpaque(false);
ieeeButton.setContentAreaFilled(false);
ieeeButton.setFocusable(false);
ieeeButton.addActionListener(this);

////Here we create and place the handshake button
handshakeButton.setBounds(170,470,200,200);
handshakeButton.setOpaque(false);
handshakeButton.setContentAreaFilled(false);
handshakeButton.setFocusable(false);
handshakeButton.addActionListener(this);

////Here we create and place the onet button
onetButton.setBounds(420,470,200,200);
onetButton.setOpaque(false);
onetButton.setContentAreaFilled(false);
onetButton.setFocusable(false);
onetButton.addActionListener(this);


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

centerPanel.add(centerlabel1);
centerPanel.add(centerlabel2);
centerPanel.add(centerlabel3);
centerPanel.add(centerlabel4);
centerPanel.add(centerlabel5);
centerPanel.add(centerlabel6);


engagementPage.add(sfweclubButton);
engagementPage.add(engrambButton);
engagementPage.add(informsButton);
engagementPage.add(iiseButton);
engagementPage.add(ieeeButton);
engagementPage.add(handshakeButton);
engagementPage.add(onetButton);
engagementPage.add(centerPanel,BorderLayout.CENTER);
}

public void actionPerformed(ActionEvent e) {
	if (e.getSource()== sfweclubButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://linktr.ee/sewildcats").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== engrambButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://engineering.arizona.edu/current/ambassadors").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== informsButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://arizona.campuslabs.com/engage/organization/informs").toURI());
		}
		catch(Exception e1) {
			}
		}
			
	else if (e.getSource()== iiseButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://arizona.campusgroups.com/iise/home/").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource() == ieeeButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://www.uaieee.org/").toURI());
		}
		catch(Exception e1) {
	}
	}
	else if (e.getSource() == handshakeButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://joinhandshake.com/").toURI());
		}
		catch(Exception e1) {
		}
		}
	else if (e.getSource() == onetButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://www.onetonline.org/").toURI());
		}
		catch(Exception e1) {
		}
		}

}
}
