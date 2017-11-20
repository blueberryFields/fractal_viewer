package fractalviewer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Swingövning3GUI implements ActionListener {

	int imageNr = 0;
	JFrame frame = new JFrame("Sebastians Fractal viewer");
	JPanel buttonPanel = new JPanel();
	JLabel picture = new JLabel();
	JButton föregående = new JButton("Föregående");
	JButton nästa = new JButton("Nästa");
	Dimension buttonDimension = new Dimension(100, 30);

	ImageIcon fractal1 = new ImageIcon("src/ovningar/fractals/Alien_pillar_1.3_scaled_119.png");
	ImageIcon fractal2 = new ImageIcon("src/ovningar/fractals/Antennae_1.0_scaled_220.png");
	ImageIcon fractal3 = new ImageIcon("src/ovningar/fractals/Outrails_1.1_scaleed_109.png");

	ImageIcon[] iconArr = { fractal1, fractal2, fractal3 };

	Swingövning3GUI() {
		nästa.setPreferredSize(buttonDimension);
		föregående.setPreferredSize(buttonDimension);
		nästa.addActionListener(this);
		föregående.addActionListener(this);
		buttonPanel.add(föregående);
		buttonPanel.add(nästa);
		buttonPanel.setBackground(Color.DARK_GRAY);
		picture.setSize(550, 350);
		picture.setIcon(iconArr[imageNr]);
		frame.setLayout(new FlowLayout());
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.add(picture);
		frame.add(buttonPanel);
		frame.setSize(new Dimension(550, 350));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nästa) {
			if (imageNr == 2) {
				imageNr = 0;
			} else {
				imageNr++;
			}
			picture.setIcon(iconArr[imageNr]);
		} else if (e.getSource() == föregående) {
			if (imageNr == 0) {
				imageNr = 2;
			} else {
				imageNr--;
			}
			picture.setIcon(iconArr[imageNr]);
		}

	}

}
