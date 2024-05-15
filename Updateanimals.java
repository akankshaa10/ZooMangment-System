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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Updateanimla implements ActionListener {
	JFrame f1;
	JPanel P1;
	JButton b1, b2, tab2;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t12, t13;

	public static void main(String[] args) {
		Updateanimla w = new Updateanimla();
		w.frame1();
		w.upanimal();
		w.butt3();

	}

	public void frame1() {
		f1 = new JFrame();
		f1.setSize(800, 800);
		f1.setVisible(true);
		f1.setTitle("UPDATE ANIMALS DETAILS");

		P1 = new JPanel();
		P1.setBackground(Color.gray);

		P1.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));

		JLabel l1 = new JLabel(" UPDATE ANIMALS DETAILS");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.orange);

		P1.add(l1);
		f1.add(P1);
	}

	public void upanimal() {
		Panel p = new Panel();

		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p.setLayout(gbl);
		c.insets = new Insets(5, 5, 15, 15);

//		JComboBox room,gender,ward,status;

		l1 = new JLabel();
		l1.setText(" ANIMAL ID:");
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
		l2.setText("ANIMAL NAME:");
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
		l3.setText("TYPE:");
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
		l4.setText("SPECIES:");
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
		l7.setText("GENDER:");
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
		l8.setText("AGE:");
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
		l9.setText("VACCINE:");
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
		l10.setText("ARRIVAL DATE:");
		c.gridx = 0;
		c.gridy = 8;
		gbl.setConstraints(l10, c);

		t8 = new JTextField(20);
		c.gridx = 1;
		c.gridy = 8;
		gbl.setConstraints(t8, c);
		p.add(l10);
		p.add(t8);


		p.setBackground(Color.WHITE);
		P1.add(p);
	}

	public void butt3() {
		Panel p3 = new Panel();
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p3.setLayout(gbl);
		c.insets = new Insets(5, 5, 5, 5);

		b1 = new JButton("CHECK");
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);
		c.gridx = 1;
		c.gridy = 9;
		gbl.setConstraints(b1, c);
		p3.add(b1);

		tab2 = new JButton("UPDATE ");
		tab2.setBackground(Color.white);
		tab2.addActionListener(this);
		c.gridx = 5;
		c.gridy = 9;
		gbl.setConstraints(tab2, c);
		p3.add(tab2);

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

			String str = "Select * from animals where id='" + t1.getText() + "'";
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo", "root", "");
				Statement sm = con.createStatement();

				ResultSet r = sm.executeQuery(str);

				int flag = 0;

				String id;
				String name;
				String type;
				String species;
				String gender;
				String age;
				String vaccine;
				String arrivaldate;
				String id1 = null, name1 = null, type1 = null, species1 = null, gender1 = null, age1 = null,
						vaccine1 = null, arrivaldate1 = null;
				while (r.next()) {

					name = r.getString(2);
					name1 = String.valueOf(name);

					type = r.getString(3);
					type1 = String.valueOf(type);

					species = r.getString(4);
					species1 = String.valueOf(species);

					gender = r.getString(5);
					gender1 = String.valueOf(gender);

					age = r.getString(6);
					age1 = String.valueOf(age);

					vaccine = r.getString(7);
					vaccine1 = String.valueOf(vaccine);

					arrivaldate = r.getString(8);
					arrivaldate1 = String.valueOf(arrivaldate);

					flag = 1;

				}
				if (flag == 1) {
					t2.setText(name1);
					t10.setText(type1);
					t3.setText(species1);
					t5.setText(gender1);
					t6.setText(age1);
					t7.setText(vaccine1);
					t8.setText(arrivaldate1);

					tab2.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							JOptionPane.showMessageDialog(f1, "UPDATED SUCCESSFULLY");
							Zoodatabase d = new Zoodatabase();
String s1 = "update animals set name='" + t2.getText() + "'" + "where id='" + t1.getText()+ "'";
String s2 = "update animals set type ='" + t10.getText() + "'" + "where id='" + t1.getText()+ "'";
String s3 = "update animals set species='" + t3.getText() + "'" + "where id='"+ t1.getText() + "'";
							String s4 = "update animals set gender='" + t5.getText() + "'" + "where id='" + t1.getText()
									+ "'";
String s6 = "update animals set age ='" + t6.getText() + "'" + "where id='" + t1.getText()+ "'";
							String s7 = "update animals set vaccine ='" + t7.getText() + "'" + "where id='"
									+ t1.getText() + "'";
							String s8 = "update animals set arrivaldate ='" + t8.getText() + "'" + "where id='"
									+ t1.getText() + "'";

//							
							try {

						PreparedStatement p = d.con.prepareStatement(s1);
								int i = p.executeUpdate();
								if (i == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}
						PreparedStatement p1 = d.con.prepareStatement(s2);
								int j = p1.executeUpdate();
								if (j == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}
				PreparedStatement p2 = d.con.prepareStatement(s3);
								int k = p2.executeUpdate();
								if (k == 1) {
									System.out.println(" UPDATED!!");

								} else {
				System.out.println("ERROR");
								}
						PreparedStatement p3 = d.con.prepareStatement(s4);
								int l = p3.executeUpdate();
								if (l == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}
						PreparedStatement p4 = d.con.prepareStatement(s6);
								int m = p4.executeUpdate();
								if (m == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}
						PreparedStatement p5 = d.con.prepareStatement(s7);
								int n = p5.executeUpdate();
								if (n == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}
						PreparedStatement p6 = d.con.prepareStatement(s8);
								int o = p6.executeUpdate();
								if (o == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}

							} catch (Exception e3) {
								e3.printStackTrace();
							}

						}
					});

				}

				else {
					System.out.println("MENU NOT FOUND!!!");
				}
			}

			catch (SQLException e1)

			{
				e1.printStackTrace();
			}
		}

		else if (e.getSource() == b2) {

			Zooimage mp = new Zooimage();
			mp.frame3();
			mp.button3();

			f1.setVisible(false);
		}

	}

}
