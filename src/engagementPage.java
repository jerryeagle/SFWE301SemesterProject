import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
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
centerlabel1.setFont(new java.awt.Font("Proxima Nova Reg", 0, 28));
centerlabel1.setText("<html>Check out these amazing clubs and get involved with other students!<br/>"
		+ "</html");
centerlabel1.setBounds(250,0,1200,100);

//this is the SFWE statistics
JLabel centerlabel2 = new JLabel();
centerlabel2.setIcon(stats);
centerlabel2.setBounds(650,360,700,330);

//this is the SFWE discord
JLabel centerlabel3 = new JLabel();
centerlabel3.setIcon(discord);
centerlabel3.setBounds(10,520,200,200);

//this is the SFWE discord subtitle
JLabel centerlabel4 = new JLabel();
centerlabel4.setForeground(new Color(21, 36, 74));
centerlabel4.setFont(new java.awt.Font("Proxima Nova Reg", 0, 12));
centerlabel4.setText("SFWE Discord");
centerlabel4.setBounds(20,670, 100 , 25);

JLabel centerlabel5 = new JLabel();
centerlabel5.setForeground(new Color(21, 36, 74));
centerlabel5.setFont(new java.awt.Font("Proxima Nova Reg", 0, 28));
centerlabel5.setText("<html>Explore Software engineering career information below It is never too early!<br/>"
		+ "</html");
centerlabel5.setBounds(250,290,1200,100);

//Here we create the header
headerPanel.setVisible(true);
headerPanel.setBackground(new Color(171, 5, 32));
headerPanel.setPreferredSize(new Dimension(1600,50));
headerPanel.setLayout(null);

sfweclubButton.setBounds(70,140,200,200);
sfweclubButton.setOpaque(false);
sfweclubButton.setContentAreaFilled(false);
sfweclubButton.setFocusable(false);
sfweclubButton.addActionListener(this);

//Here we create and place the engagement button
engrambButton.setBounds(320,140,200,200);
engrambButton.setOpaque(false);
engrambButton.setContentAreaFilled(false);
engrambButton.setFocusable(false);
engrambButton.addActionListener(this);

//Here we create and place the engagement button
informsButton.setBounds(570,140,200,200);
informsButton.setOpaque(false);
informsButton.setContentAreaFilled(false);
informsButton.setFocusable(false);
informsButton.addActionListener(this);

//Here we create and place the engagement button
iiseButton.setBounds(820,140,200,200);
iiseButton.setOpaque(false);
iiseButton.setContentAreaFilled(false);
iiseButton.setFocusable(false);
iiseButton.addActionListener(this);

ieeeButton.setBounds(1070,140,200,200);
ieeeButton.setOpaque(false);
ieeeButton.setContentAreaFilled(false);
ieeeButton.setFocusable(false);
ieeeButton.addActionListener(this);

////Here we create and place the handshake button
handshakeButton.setBounds(140,470,200,200);
handshakeButton.setOpaque(false);
handshakeButton.setContentAreaFilled(false);
handshakeButton.setFocusable(false);
handshakeButton.addActionListener(this);

////Here we create and place the onet button
onetButton.setBounds(390,470,200,200);
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
