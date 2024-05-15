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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hotelmanagement.Mainpage;
import hotelmanagement.database;

//import swingszoo.Workers;

public class AddWorker implements ActionListener {
	JFrame f1;
	JPanel P1;
	JButton b1, b2;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t12, t13;

	public static void main(String[] args) {
		AddWorker w = new AddWorker();
		w.frame1();
		w.worker();
		w.butt3();

	}

	public void frame1() {
		f1 = new JFrame();
		f1.setSize(800, 800);
		f1.setVisible(true);
		f1.setTitle(" ADD WORKERS");

		P1 = new JPanel();
		P1.setBackground(Color.GRAY);

		P1.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));

		Label l1 = new Label(" ADD WORKER");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.orange);
//		         l1.setBackground(Color.black);
		P1.add(l1);
		f1.add(P1);
	}

	public void worker() {
		Panel p = new Panel();

		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p.setLayout(gbl);
		c.insets = new Insets(5, 5, 15, 15);

//		JComboBox room,gender,ward,status;

		l1 = new JLabel();
		l1.setText(" WORKER ID:");
		c.gridx = 0;
		c.gridy = 1;
		gbl.setConstraints(l1, c);

		t1 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 1;
		gbl.setConstraints(t1, c);

		p.add(l1);
		p.add(t1);

		l2 = new JLabel();
		l2.setText("FULL NAME:");
		c.gridx = 0;
		c.gridy = 2;
		gbl.setConstraints(l2, c);

		t2 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 2;
		gbl.setConstraints(t2, c);
		p.add(l2);
		p.add(t2);

		l3 = new JLabel();
		l3.setText("GENDER:");
		c.gridx = 0;
		c.gridy = 3;
		gbl.setConstraints(l3, c);

		t10 = new JTextField(20);

		c.gridx = 1;
		c.gridy = 3;

		gbl.setConstraints(t10, c);
		p.add(l3);
		p.add(t10);

		l4 = new JLabel();
		l4.setText("ROLE");
		c.gridx = 0;
		c.gridy = 4;
		gbl.setConstraints(l4, c);
		t3 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 4;
		gbl.setConstraints(t3, c);
		p.add(l4);
		p.add(t3);

		l7 = new JLabel();
		l7.setText("AGE");
		c.gridx = 0;
		c.gridy = 5;
		gbl.setConstraints(l7, c);
		t5 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 5;
		gbl.setConstraints(t5, c);
		p.add(l7);
		p.add(t5);

		l8 = new JLabel();
		l8.setText("EXPERIANCE");
		c.gridx = 0;
		c.gridy = 6;
		gbl.setConstraints(l8, c);

		t6 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 6;
		gbl.setConstraints(t6, c);
		p.add(l8);
		p.add(t6);

		l9 = new JLabel();
		l9.setText("ADDRESS:");
		c.gridx = 0;
		c.gridy = 7;
		gbl.setConstraints(l9, c);

		t7 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 7;
		gbl.setConstraints(t7, c);
		p.add(l9);
		p.add(t7);

		l10 = new JLabel();
		l10.setText("PHONE-NO:");
		c.gridx = 0;
		c.gridy = 8;
		gbl.setConstraints(l10, c);

		t8 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 8;
		gbl.setConstraints(t8, c);
		p.add(l10);
		p.add(t8);

//			
//			

		l11 = new JLabel();
		l11.setText("SHIFT");
		c.gridx = 0;
		c.gridy = 9;
		gbl.setConstraints(l11, c);

		t9 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 9;
		gbl.setConstraints(t9, c);
		p.add(l11);
		p.add(t9);
		l12 = new JLabel();
		l12.setText("IN-DATE");
		c.gridx = 0;
		c.gridy = 10;
		gbl.setConstraints(l12, c);

		t12 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 10;
		gbl.setConstraints(t12, c);
		p.add(l12);
		p.add(t12);

		l13 = new JLabel();
		l13.setText("SALARY");
		c.gridx = 0;
		c.gridy = 11;
		gbl.setConstraints(l13, c);

		t13 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 11;
		gbl.setConstraints(t13, c);
		p.add(l13);
		p.add(t13);

		p.setBackground(Color.WHITE);
		P1.add(p);

	}

	public void butt3() {
		Panel p3 = new Panel();
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p3.setLayout(gbl);
		c.insets = new Insets(10, 10, 10, 10);

		b1 = new JButton("ADD");
		b1.setBackground(Color.green);
		b1.addActionListener(this);
		c.gridx = 1;
		c.gridy = 9;
		gbl.setConstraints(b1, c);
		p3.add(b1);

		b2 = new JButton("BACK");
		b2.setBackground(Color.green);
		b2.addActionListener(this);
		c.gridx = 5;
		c.gridy = 9;
		gbl.setConstraints(b2, c);
		p3.add(b2);
		p3.setBackground(Color.orange);
		P1.add(p3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		{
			if (e.getSource() == b1) {

				JOptionPane.showMessageDialog(f1, "ADDED SUCCESSFULLY");

				Zoodatabase d = new Zoodatabase();
				String id = (t1.getText());
				String name = (t2.getText());
				String gender = (t10.getText());
				String role = (t3.getText());
				String age = (t5.getText());
				String experiance = (t6.getText());
				String address = (t7.getText());
				String phoneno = (t8.getText());
				String shift = (t9.getText());
				String indate = (t12.getText());
				String salary = (t13.getText());

				System.out.println(id);

				System.out.println(name);

				System.out.println(gender);
				System.out.println(role);
				System.out.println(salary);
				System.out.println(experiance);
				System.out.println(address);
				System.out.println(phoneno);
				System.out.println(indate);

				try {

					String s1 = "insert into  worker values(?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement p = d.con.prepareStatement(s1);
					p.setString(1, id);
					p.setString(2, name);
					p.setString(3, role);
					p.setString(4, age);
					p.setString(5, gender);
					p.setString(6, phoneno);
					p.setString(7, experiance);
					p.setString(8, address);
					p.setString(9, shift);
					p.setString(10, salary);
					p.setString(11, indate);
					int i = p.executeUpdate();

					if (i == 1) {
						System.out.println(" ADDED SUCCESSFULLY");
					} else {
						System.out.println(" NOT ADDED ");

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
			}
}
}
}
