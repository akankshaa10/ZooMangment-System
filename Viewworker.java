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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hotelmanagement.database;

public class Viewworker implements ActionListener {
	JFrame f1;
	JPanel P1;
	JButton b1, b2, tab1;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t12, t13;

	public static void main(String[] args) {
		Viewworker w = new Viewworker();
		w.frame1();
		w.viewworker();
		w.butt3();

	}

	public void frame1() {
		f1 = new JFrame();
		f1.setSize(800, 800);
		f1.setVisible(true);
		f1.setTitle("  VIEW WORKERS DETAILS");

		P1 = new JPanel();
		P1.setBackground(Color.gray);

		P1.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));

		Label l1 = new Label(" VIEW WORKER DETAILS");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.orange);

		P1.add(l1);
		f1.add(P1);
	}

	public void viewworker() {
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

		p.setBackground(Color.white);
		P1.add(p);

	}

	public void butt3() {
		Panel p3 = new Panel();
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p3.setLayout(gbl);
		c.insets = new Insets(5, 5, 5, 5);

		b1 = new JButton("VIEW");
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);
		c.gridx = 1;
		c.gridy = 9;
		gbl.setConstraints(b1, c);
		p3.add(b1);

		tab1 = new JButton("TABLE VIEW ");
		tab1.setBackground(Color.white);
		tab1.addActionListener(this);
		c.gridx = 5;
		c.gridy = 9;
		gbl.setConstraints(tab1, c);
		p3.add(tab1);

		b2 = new JButton("BACK");
		b2.setBackground(Color.WHITE);
		b2.addActionListener(this);
		c.gridx = 15;
		c.gridy = 9;
		gbl.setConstraints(b2, c);
		p3.add(b2);
		p3.setBackground(Color.ORANGE);
		P1.add(p3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1)

		{

			Zoodatabase d = new Zoodatabase();

			String str = "Select * from worker where id='" + t1.getText() + "'";
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo", "root", "");
				Statement sm = con.createStatement();

				ResultSet r = sm.executeQuery(str);

				int flag = 0;
				String name;

				String role;
				String age;
				String gender;
				String phone;
				String experiance;
				String address;
				String shift;
				String salary;
				String indate;

				String name1 = null, role1 = null, age1 = null, gender1 = null, phone1 = null, experiance1 = null,
						address1 = null, shift1 = null, salary1 = null, indate1 = null;
				while (r.next()) {

					name = r.getString(2);
					name1 = String.valueOf(name);

					role = r.getString(3);
					role1 = String.valueOf(role);

					age = r.getString(4);
					age1 = String.valueOf(age);

					gender = r.getString(5);
					gender1 = String.valueOf(gender);

					phone = r.getString(6);
					phone1 = String.valueOf(phone);

					experiance = r.getString(7);
					experiance1 = String.valueOf(experiance);

					address = r.getString(8);
					address1 = String.valueOf(address);

					shift = r.getString(9);
					shift1 = String.valueOf(shift);

					salary = r.getString(10);
					salary1 = String.valueOf(salary);

					indate = r.getString(11);
					indate1 = String.valueOf(indate);

					flag = 1;

				}
				if (flag == 1) {
					t2.setText(name1);

					t10.setText(gender1);
					t3.setText(role1);
					t5.setText(age1);
					t6.setText(experiance1);
					t7.setText(address1);
					t8.setText(phone1);
					t9.setText(shift1);
					t12.setText(indate1);
					t13.setText(salary1);

				} else {
					System.out.println("MENU NOT FOUND!!!");
				}
			}

			catch (Exception e1) {
				e1.printStackTrace();

			}
		}

		else if (e.getSource() == b2) {

			Zooimage mp = new Zooimage();
			mp.frame2();
			mp.button2();
			f1.setVisible(false);
		}

		else if (e.getSource() == tab1) {
			Workertable st = new Workertable();
			st.wtabel();

		}}}


