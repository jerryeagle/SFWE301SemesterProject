import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class academicsPage implements ActionListener{
	 
JFrame academicsPage = new JFrame();
JLabel headerlabel = new JLabel();
JPanel headerPanel = new JPanel();
JPanel centerPanel = new JPanel();

ImageIcon major = new ImageIcon(getClass().getResource("major.png"));
JButton majorButton = new JButton(major);

ImageIcon masters = new ImageIcon(getClass().getResource("masters.png"));
JButton mastersButton = new JButton(masters);

ImageIcon phd = new ImageIcon(getClass().getResource("phd.png"));
JButton phdButton = new JButton(phd);
//
ImageIcon map = new ImageIcon(getClass().getResource("map.png"));
JButton mapButton = new JButton(map);

ImageIcon thinktank = new ImageIcon(getClass().getResource("thinktank.png"));
JButton thinktankButton = new JButton(thinktank);

ImageIcon salt = new ImageIcon(getClass().getResource("salt.png"));
JButton saltButton = new JButton(salt);

ImageIcon drc = new ImageIcon(getClass().getResource("drc.png"));
JButton drcButton = new JButton(drc);
//
ImageIcon scholar = new ImageIcon(getClass().getResource("scholar.png"));
JButton scholarButton = new JButton(scholar);

JButton onealButton = new JButton("Sharon Oneal");
JButton julianaButton = new JButton("Juliana Lincoln");
JButton maturButton = new JButton("Mohammad Abu Matar");
JButton saldanaButton = new JButton("Diana Saldana");
JButton satamButton = new JButton("Pratik Satam");

ImageIcon advisor = new ImageIcon(getClass().getResource("advisor.png"));


academicsPage(){ //Creates a Frame
//Here is where we create and place the header Logo
ImageIcon ualogo = new ImageIcon(getClass().getResource("ualogo.png"));
headerlabel.setIcon(ualogo);
headerlabel.setBounds(5,5,280,40);

//Title for the academics section
JLabel academiclabel = new JLabel();
academiclabel.setForeground(new Color(21, 36, 74));
academiclabel.setFont(new Font("Proxima Nova", 0, 24));
academiclabel.setText("<html>Check out the various Software Engineering degrees offered at the U of A!<br/>"
		+ "</html");
academiclabel.setBounds(300,5,1200,30);

//Here we create the header
headerPanel.setVisible(true);
headerPanel.setBackground(new Color(171, 5, 32));
headerPanel.setPreferredSize(new Dimension(1600,50));
headerPanel.setLayout(null);


majorButton.setBounds(130,100,200,200);
majorButton.setOpaque(false);
majorButton.setContentAreaFilled(false);
majorButton.setFocusable(false);
majorButton.addActionListener(this);

JLabel majorlabel = new JLabel();
majorlabel.setForeground(new Color(21, 36, 74));
majorlabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
majorlabel.setText("<html> Software Engineering Major/Minor</html>");
majorlabel.setBounds(135,250,200,50);


mastersButton.setBounds(430,100,200,200);
mastersButton.setOpaque(false);
mastersButton.setContentAreaFilled(false);
mastersButton.setFocusable(false);
mastersButton.addActionListener(this);

JLabel masterslabel = new JLabel();
masterslabel.setForeground(new Color(21, 36, 74));
masterslabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
masterslabel.setText("<html> Software Engineering Masters</html>");
masterslabel.setBounds(435,250,200,50);

phdButton.setBounds(750,100,200,200);
phdButton.setOpaque(false);
phdButton.setContentAreaFilled(false);
phdButton.setFocusable(false);
phdButton.addActionListener(this);

JLabel phdlabel = new JLabel();
phdlabel.setForeground(new Color(21, 36, 74));
phdlabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
phdlabel.setText("<html> Software Engineering Doctorate</html>");
phdlabel.setBounds(755,250,200,50);

mapButton.setBounds(1050,100,200,200);
mapButton.setOpaque(false);
mapButton.setContentAreaFilled(false);
mapButton.setFocusable(false);
mapButton.addActionListener(this);

JLabel maplabel = new JLabel();
maplabel.setForeground(new Color(21, 36, 74));
maplabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
maplabel.setText("<html> Software Engineering 4 Year Course Map</html>");
maplabel.setBounds(1055,250,200,50);

JLabel resourcelabel = new JLabel();
resourcelabel.setForeground(new Color(21, 36, 74));
resourcelabel.setFont(new Font("Proxima Nova", 0, 24));
resourcelabel.setText("<html>Needing tutoring or other helpful resources? Check out the ones below!<br/>"
		+ "</html");
resourcelabel.setBounds(300,300,1200,30);

thinktankButton.setBounds(150,390,200,200);
thinktankButton.setOpaque(false);
thinktankButton.setContentAreaFilled(false);
thinktankButton.setFocusable(false);
thinktankButton.addActionListener(this);

JLabel thinktanklabel = new JLabel();
thinktanklabel.setForeground(new Color(21, 36, 74));
thinktanklabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
thinktanklabel.setText("<html> Think Tank</html>");
thinktanklabel.setBounds(155,530,200,50);


saltButton.setBounds(430,390,200,200);
saltButton.setOpaque(false);
saltButton.setContentAreaFilled(false);
saltButton.setFocusable(false);
saltButton.addActionListener(this);

JLabel saltlabel = new JLabel();
saltlabel.setForeground(new Color(21, 36, 74));
saltlabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
saltlabel.setText("<html> Strategic Alternative Learning Techniques</html>");
saltlabel.setBounds(435,540,200,50);

drcButton.setBounds(750,390,200,200);
drcButton.setOpaque(false);
drcButton.setContentAreaFilled(false);
drcButton.setFocusable(false);
drcButton.addActionListener(this);

JLabel drclabel = new JLabel();
drclabel.setForeground(new Color(21, 36, 74));
drclabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
drclabel.setText("<html> Disability Resource Center</html>");
drclabel.setBounds(755,530,200,50);

scholarButton.setBounds(1050,390,200,200);
scholarButton.setOpaque(false);
scholarButton.setContentAreaFilled(false);
scholarButton.setFocusable(false);
scholarButton.addActionListener(this);

JLabel scholarlabel = new JLabel();
scholarlabel.setForeground(new Color(21, 36, 74));
scholarlabel.setFont(new Font("Proxima Nova", Font.PLAIN, 16));
scholarlabel.setText("<html> Scholarship Universe</html>");
scholarlabel.setBounds(1055,530,170,50);

//Divider
JLabel divider= new JLabel();
divider.setOpaque(true);
divider.setBackground(new Color(55, 141, 189));
divider.setBounds(200,595, 900 , 1);

JLabel facultylabel = new JLabel();
facultylabel.setForeground(new Color(21, 36, 74));
facultylabel.setFont(new Font("Proxima Nova", 0, 24));
facultylabel.setText("<html>Get to know the awesome software engineering team!<br/>"
		+ "</html");
facultylabel.setBounds(400,600,1200,30);

onealButton.setBounds(50,690,200,50);
onealButton.setFont(new Font("Proxima Nova", Font.BOLD, 14));
onealButton.setOpaque(false);
onealButton.setContentAreaFilled(false);
onealButton.setFocusable(false);
onealButton.addActionListener(this);


julianaButton.setBounds(325,690,200,50);
julianaButton.setFont(new Font("Proxima Nova", Font.BOLD, 14));
julianaButton.setOpaque(false);
julianaButton.setContentAreaFilled(false);
julianaButton.setFocusable(false);
julianaButton.addActionListener(this);

maturButton.setBounds(600,690,200,50);
maturButton.setFont(new Font("Proxima Nova", Font.BOLD, 14));
maturButton.setOpaque(false);
maturButton.setContentAreaFilled(false);
maturButton.setFocusable(false);
maturButton.addActionListener(this);

saldanaButton.setBounds(875,690,200,50);
saldanaButton.setFont(new Font("Proxima Nova", Font.BOLD, 14));
saldanaButton.setOpaque(false);
saldanaButton.setContentAreaFilled(false);
saldanaButton.setFocusable(false);
saldanaButton.addActionListener(this);

satamButton.setBounds(1150,690,200,50);
satamButton.setFont(new Font("Proxima Nova", Font.BOLD, 14));
satamButton.setOpaque(false);
satamButton.setContentAreaFilled(false);
satamButton.setFocusable(false);
satamButton.addActionListener(this);

JLabel advisorLabel = new JLabel();
advisorLabel.setIcon(advisor);
advisorLabel.setBounds(14,500,100,100);

JLabel advisorLabel2 = new JLabel();
advisorLabel2.setForeground(new Color(21, 36, 74));
advisorLabel2.setFont(new Font("Proxima Nova", 0, 10));
advisorLabel2.setText("Meet with an advisor");
advisorLabel2.setBounds(16,596, 150 , 25);





//Here we create the center panel of the page
centerPanel.setVisible(true);
centerPanel.setBackground(new Color(226, 233, 235));
centerPanel.setPreferredSize(new Dimension(1600,500));
centerPanel.setLayout(null);
centerPanel.add(academiclabel);
centerPanel.add(majorlabel);
centerPanel.add(masterslabel);
centerPanel.add(phdlabel);
centerPanel.add(maplabel);
centerPanel.add(resourcelabel);
centerPanel.add(thinktanklabel);
centerPanel.add(saltlabel);
centerPanel.add(drclabel);
centerPanel.add(scholarlabel);
centerPanel.add(facultylabel);
centerPanel.add(advisorLabel);
centerPanel.add(advisorLabel2);
centerPanel.add(divider);


academicsPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Exit out of program
academicsPage.setExtendedState(JFrame.MAXIMIZED_BOTH); //Set frame to full screen
academicsPage.setTitle("Software Engineering Academics Page");
academicsPage.setLayout(new BorderLayout());
academicsPage.setResizable(false); //Prevent frame from being resized
academicsPage.setVisible(true); // Make the frame visible
academicsPage.getContentPane().setBackground(Color.white); //Set background color

ImageIcon sfwelogo = new ImageIcon(getClass().getResource("sfwelogo.png"));
academicsPage.setIconImage(sfwelogo.getImage());

headerPanel.add(headerlabel); //Add UA logo to header
academicsPage.add(headerPanel,BorderLayout.NORTH); //Add header


academicsPage.add(majorButton);
academicsPage.add(mastersButton);
academicsPage.add(phdButton);
academicsPage.add(mapButton);
academicsPage.add(thinktankButton);
academicsPage.add(saltButton);
academicsPage.add(drcButton);
academicsPage.add(scholarButton);
academicsPage.add(onealButton);
academicsPage.add(julianaButton);
academicsPage.add(maturButton);
academicsPage.add(saldanaButton);
academicsPage.add(satamButton);
academicsPage.add(centerPanel,BorderLayout.CENTER);

}
public void actionPerformed(ActionEvent e) {
	if (e.getSource()== majorButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://www.arizona.edu/degree-search/majors/software-engineering").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== mastersButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://grad.arizona.edu/catalog/programinfo/SYEMS").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== phdButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://grad.arizona.edu/catalog/programinfo/SIEPHD").toURI());
		}
		catch(Exception e1) {
			}
		}
	else if (e.getSource()== mapButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://engineering.arizona.edu/pdfs/4-year-degree-plans/2022/SoftwareEngineering22-23.pdf").toURI());
		}
		catch(Exception e1) {
			}
		}
	else if (e.getSource()== thinktankButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://thinktank.arizona.edu/").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== saltButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://salt.arizona.edu/").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== drcButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://drc.arizona.edu/").toURI());
		}
		catch(Exception e1) {
			}
		}
	else if (e.getSource()== scholarButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://arizona.scholarshipuniverse.com/student").toURI());
		}
		catch(Exception e1) {
			}
		}
	else if (e.getSource()== onealButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://profiles.arizona.edu/person/sharononeal").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== julianaButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://sie.engineering.arizona.edu/faculty-staff/faculty/juliana-lincoln").toURI());
		}
		catch(Exception e1) {
			}
		}
		
	else if (e.getSource()== maturButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://profiles.arizona.edu/person/mabumatar").toURI());
		}
		catch(Exception e1) {
			}
		}
	else if (e.getSource()== saldanaButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://profiles.arizona.edu/person/dianasaldana").toURI());
		}
		catch(Exception e1) {
			}
		}
	else if (e.getSource()== satamButton) {
		try {
			Desktop.getDesktop().browse(new URL("https://profiles.arizona.edu/person/pratiksatam").toURI());
		}
		catch(Exception e1) {
			}
		}
}
}
