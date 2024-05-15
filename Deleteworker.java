package zoo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hotelmanagement.Mainpage;
import hotelmanagement.database;

public class Deleteworker implements ActionListener {
	JFrame f1;
	JPanel P1;
	JButton b1, b2;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t12, t13;
public static void main(String[] args) {
		Deleteworker w = new Deleteworker();
		w.frame1();
		w.dworker();
		w.butt3();
}
public void frame1() {
		f1 = new JFrame();
		f1.setSize(800, 500);
		f1.setVisible(true);
		f1.setTitle("DELETE  WORKER");

		P1 = new JPanel();
		P1.setBackground(Color.gray);

		P1.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));

		JLabel l1 = new JLabel("DELETE WORKER");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.yellow);

		P1.add(l1);
		f1.add(P1);
	}
public void dworker() {
		Panel p = new Panel();
GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p.setLayout(gbl);
		c.insets = new Insets(5, 5, 15, 15);

		l1 = new JLabel();
		l1.setText(" WORKER ID:");
		l1.setForeground(Color.white);
		c.gridx = 0;
		c.gridy = 1;
		gbl.setConstraints(l1, c);

		t1 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 1;
		gbl.setConstraints(t1, c);

		p.add(l1);
		p.add(t1);

		P1.add(p);

	}

	public void butt3() {
		Panel p3 = new Panel();
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p3.setLayout(gbl);
		c.insets = new Insets(10, 10, 10, 10);

		b1 = new JButton("DELETE");
		b1.setBackground(Color.green);
		b1.addActionListener(this);
		c.gridx = 1;
		c.gridy = 9;
		gbl.setConstraints(b1, c);
		p3.add(b1);

		b2 = new JButton("BACK");
		b2.setBackground(Color.white);
		b2.addActionListener(this);
		c.gridx = 5;
		c.gridy = 9;
		gbl.setConstraints(b2, c);
		p3.add(b2);
		p3.setBackground(Color.white);
		P1.add(p3);

	}

	@Override
	public void actionPerformed(ActionEvent e)

	{
		if (e.getSource() == b1) {

			JOptionPane.showMessageDialog(f1, "DELETED SUCCESSFULLY");

			Zoodatabase d = new Zoodatabase();
			String s1 = "delete from worker where id ='" + t1.getText() + "'";

			try {

				PreparedStatement p = d.con.prepareStatement(s1);

				int i = p.executeUpdate();

				if (i == 1) {
					System.out.println("DELETED SUCCESSFULLY");
				} else {
					System.out.println("  NOT DELETED ");

				}
			} catch (SQLException e1)

			{
				e1.printStackTrace();
			}
		}

		else if (e.getSource() == b2) {

			Zooimage mp = new Zooimage();
			mp.frame2();
			mp.button2();

			f1.setVisible(false);
		}}}
