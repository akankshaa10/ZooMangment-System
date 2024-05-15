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
import hotelmanagement.Mainpage;
import hotelmanagement.database;
public class Updateworker implements ActionListener {
	JFrame f1;
	JPanel P1;
	JButton b1, b2, b4;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t12, t13;
public static void main(String[] args) {
		Updateworker w = new Updateworker();
		w.frame1();
		w.upworker();
		w.butt3();
}

	public void frame1() {
		f1 = new JFrame();
		f1.setSize(800, 800);
		f1.setVisible(true);
		f1.setTitle(" UPDATE WORKERS DETAILS");

		P1 = new JPanel();
		P1.setBackground(Color.gray);
P1.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));
Label l1 = new Label("UPDATE WORKER DETAILS");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.yellow);

		P1.add(l1);
		f1.add(P1);
	}

	public void upworker() {
		Panel p = new Panel();

		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		p.setLayout(gbl);
		c.insets = new Insets(5, 5, 15, 15);
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
		c.insets = new Insets(5, 5, 5, 5);

		b1 = new JButton("VIEW");
		b1.setBackground(Color.green);
		b1.addActionListener(this);
		c.gridx = 1;
		c.gridy = 9;
		gbl.setConstraints(b1, c);
		p3.add(b1);

		b4 = new JButton("UPDATE");
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		c.gridx = 5;
		c.gridy = 11;
		gbl.setConstraints(b4, c);
		p3.add(b4);

		b2 = new JButton("BACK");
		b2.setBackground(Color.green);
		b2.addActionListener(this);
		c.gridx = 10;
		c.gridy = 9;
		gbl.setConstraints(b2, c);
		p3.add(b2);
		p3.setBackground(Color.yellow);
		P1.add(p3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {

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

					b4.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							JOptionPane.showMessageDialog(f1, "UPDATED SUCCESSFULLY");
							Zoodatabase d = new Zoodatabase();
String s1 = "update worker set name='" + t2.getText() + "'" + "where id='" + t1.getText()+ "'";
String s2 = "update worker set gender ='" + t10.getText() + "'" + "where id='"+ t1.getText() + "'";
String s3 = "update worker set role='" + t3.getText() + "'" + "where id='" + t1.getText()+ "'";
String s4 = "update worker set age='" + t5.getText() + "'" + "where id='" + t1.getText()+ "'";
String s6 = "update worker set experiance ='" + t6.getText() + "'" + "where id='"+ t1.getText() + "'";
String s7 = "update worker set address ='" + t7.getText() + "'" + "where id='"+ t1.getText() + "'";
String s8 = "update worker set phone ='" + t8.getText() + "'" + "where id='" + t1.getText()+ "'";
String s9 = "update worker set  salary ='" + t13.getText() + "'" + "where id='"+ t1.getText() + "'";
String s10 = "update worker set shift ='" + t9.getText() + "'" + "where id='" + t1.getText()+ "'";
String s11 = "update worker set indate ='" + t12.getText() + "'" + "where id='"+ t1.getText() + "'";
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
								PreparedStatement p7 = d.con.prepareStatement(s9);
								int q = p7.executeUpdate();
								if (q == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}
								PreparedStatement p8 = d.con.prepareStatement(s10);
								int r = p8.executeUpdate();
								if (r == 1) {
									System.out.println(" UPDATED!!");

								} else {
									System.out.println("ERROR");
								}
								PreparedStatement p9 = d.con.prepareStatement(s11);
								int s = p9.executeUpdate();
								if (s == 1) {
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
