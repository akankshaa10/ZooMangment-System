package zoo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

publicclass Zooimage implements ActionListener

{
	JFrame f, f1, f2, f3, f4, f5, j;

	JPanel panel, p, pa, pan, pane;

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
			b24, b25, b26, b27, b28, b29, b30, b31, back1, back2, back3, back4, back5, del1, del2, del3, b50, log;

	publicstaticvoid main(String args[]) {
		Zooimage mp = new Zooimage();
		mp.frame();

	}

	publicvoid frame()

	{

		j = new JFrame();

//				super(title);
		j.setSize(2000, 2000);

		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1 = new JButton("Workers");
		b1.addActionListener(this);
		b2 = new JButton("Animals");
		b2.addActionListener(this);
		b3 = new JButton("Suppliers");
		b3.addActionListener(this);
		b4 = new JButton("Visitors");
		b4.addActionListener(this);
		log = new JButton("LogOut");
		log.addActionListener(this);

		Container c1 = j.getContentPane();
		c1.setLayout(new BorderLayout(8, 6));
		c1.setBackground(Color.cyan);
		j.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.blue));

		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.cyan);
		topPanel.setLayout(new FlowLayout(900, 900, 900));
		c1.add(topPanel, BorderLayout.NORTH);

		JLabel l = new JLabel("WELCOME TO AVP ZOO..!!", SwingConstants.CENTER);
		l.setLayout(null);
		Font f = new Font("Goudy Stout", Font.BOLD, 30);
		l.setFont(f);
		c1.add(l, BorderLayout.NORTH);

		JPanel middlePanel = new JPanel();
		middlePanel.setBackground(Color.cyan);
		middlePanel.setLayout(new FlowLayout(40, 40, 40));

		JPanel gridPanel = new JPanel();
		gridPanel.setBackground(Color.cyan);
		gridPanel.setLayout(new GridLayout(0, 1, 100, 30));

		gridPanel.add(b1);
		gridPanel.add(b2);
		gridPanel.add(b3);
		gridPanel.add(b4);
		gridPanel.add(log);

		JLabel l1 = new JLabel("", SwingConstants.CENTER);
		l1.setOpaque(true);
		l1.setBackground(Color.gray);
		middlePanel.add(gridPanel);
//				middlePanel.setBackground(Color.black);

		ImageIcon icon3 = new ImageIcon("D:\\images\\zoo3.gif");
		Image img3 = icon3.getImage();
		JLabel l2 = new JLabel(icon3);
		l2.setBackground(Color.green);
		l2.setBounds(200, 10, 900, 1040);
		Image newimg3 = img3.getScaledInstance(l2.getWidth(), l2.getHeight(), Image.SCALE_SMOOTH);
		l1.add(l2);
		c1.add(l1);
		c1.add(middlePanel, BorderLayout.WEST);

	}

	publicvoid frame2() {
		f1 = new JFrame();
		f1.setSize(800, 800);
		f1.setVisible(true);
		f1.setTitle("WORKERS_INFO");

		pa = new JPanel();
		pa.setBackground(Color.gray);

		pa.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));

		JLabel l1 = new JLabel("WORKERS-INFORMATION");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.cyan);

		pa.add(l1);

		ImageIcon icon = new ImageIcon("D:\\images\\or2.jpg");
		Image img = icon.getImage();
		JLabel l2 = new JLabel(icon, JLabel.CENTER);
		l2.setBounds(0, 0, 100, 90);
		Image newimg = img.getScaledInstance(l2.getWidth(), l2.getHeight(), Image.SCALE_SMOOTH);

		pa.add(l2);

		pa.add(l1);
		f1.add(pa);
	}

	publicvoid button2() {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 1, 20, 20));

		b5 = new JButton("**ADD-WORKER**");
		b5.setBackground(Color.yellow);
		b5.addActionListener(this);
		p1.add(b5);

		b6 = new JButton("**UPDATE-DETAILS**");
		b6.setBackground(Color.yellow);
		b6.addActionListener(this);
		p1.add(b6);

		b7 = new JButton("**VIEW-DETAILS**");
		b7.setBackground(Color.yellow);
		b7.addActionListener(this);
		p1.add(b7);

		b8 = new JButton("**DELETE**");
		b8.setBackground(Color.yellow);
		b8.addActionListener(this);
		p1.add(b8);

		back1 = new JButton("back");
		back1.setBackground(Color.yellow);
		back1.addActionListener(this);
		p1.add(back1);
		p1.setBackground(Color.gray);
		pa.add(p1);
	}

	publicvoid frame3() {
		f3 = new JFrame();
		f3.setSize(800, 800);
		f3.setVisible(true);
		f3.setTitle("ANIMALS INFORMATION");

		pan = new JPanel();
		pan.setBackground(Color.black);

		pan.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));

		JLabel l1 = new JLabel("ANIMALS-INFORMATION");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);

		l1.setForeground(Color.cyan);

		ImageIcon icon = new ImageIcon("D:\\images\\zoo5.gif");
		Image img = icon.getImage();
		JLabel l3 = new JLabel(icon, JLabel.CENTER);
		l3.setBounds(0, 0, 100, 90);
		Image newimg = img.getScaledInstance(l3.getWidth(), l3.getHeight(), Image.SCALE_SMOOTH);

		pan.add(l3);

		pan.add(l1);
		f3.add(pan);
	}

	publicvoid button3() {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 1, 20, 20));

		b9 = new JButton("**ADD NEW ANIMALS**");
		b9.setBackground(Color.yellow);
		b9.addActionListener(this);
		p1.add(b9);
//						  dfsgdhtfg
//				

		b10 = new JButton("** UPDATE ANIMALS**");
		b10.setBackground(Color.yellow);
		b10.addActionListener(this);
		p1.add(b10);

		b11 = new JButton("** VIEW ALL ANIMALS**");
		b11.setBackground(Color.yellow);
		b11.addActionListener(this);
		p1.add(b11);
		pan.add(p1);

		b12 = new JButton("**DELETE**");
		b12.setBackground(Color.yellow);
		b12.addActionListener(this);
		p1.add(b12);

		back2 = new JButton("BACK");
		back2.setBackground(Color.yellow);
		back2.addActionListener(this);
		p1.add(back2);
		p1.setBackground(Color.black);
		pan.add(p1);

	}

	publicvoid frame4() {
		f4 = new JFrame();
		f4.setSize(800, 800);
		f4.setVisible(true);
		f4.setTitle("VISITORS INFORMATION");

		pane = new JPanel();
		pane.setBackground(Color.black);

		pane.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));

		JLabel l1 = new JLabel("VISITORS INFORMATION");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.cyan);
		ImageIcon icon = new ImageIcon("D:\\images\\visitor.gif");
		Image img = icon.getImage();
		JLabel l2 = new JLabel(icon, JLabel.CENTER);
		l2.setBounds(0, 0, 100, 90);
		Image newimg = img.getScaledInstance(l2.getWidth(), l2.getHeight(), Image.SCALE_SMOOTH);

		pane.add(l2);

		pane.add(l1);
		f4.add(pane);
	}

	publicvoid button4() {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 1, 20, 20));

		b13 = new JButton("** ADD VISITORS**");
		b13.setBackground(Color.yellow);
		b13.addActionListener(this);
		p1.add(b13);

		b14 = new JButton("** VIEW VISITORS**");
		b14.setBackground(Color.yellow);
		b14.addActionListener(this);
		p1.add(b14);

		b15 = new JButton("**UPDATE VISITOR**");
		b15.setBackground(Color.yellow);
		b15.addActionListener(this);
		p1.add(b15);

		b50 = new JButton("** DELETE VISITOR**");
		b50.setBackground(Color.yellow);
		b50.addActionListener(this);
		p1.add(b50);

		back3 = new JButton("**BACK**");
		back3.setBackground(Color.yellow);
		back3.addActionListener(this);
		p1.add(back3);

		p1.setBackground(Color.black);
		pane.add(p1);
	}

	publicvoid Frame5() {

		f5 = new JFrame();

		f5.setSize(800, 800);
		f5.setVisible(true);

		JLabel l1 = new JLabel("SUPPLIERS");
		Font f = new Font("Algerian", Font.BOLD, 30);
		l1.setFont(f);
		l1.setForeground(Color.blue);

		f5.add(l1);

		Container p1 = f5.getContentPane();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();

		jp1.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));
		JPanel p11 = new JPanel();
		p11.setLayout(new GridLayout(0, 1, 20, 20));

		b16 = new JButton("** ADD NEW FOOD SUPPLIER  **");
		b16.setBackground(Color.yellow);
		b16.addActionListener(this);

		b17 = new JButton("** VIEW ALL FOOD SUPPLIERS **");
		b17.setBackground(Color.yellow);
		b17.addActionListener(this);

		b18 = new JButton("** UPDATE FOOD SUPPLIERS  **");
		b18.setBackground(Color.yellow);
		b18.addActionListener(this);

		del1 = new JButton("** DELETE **");
		del1.setBackground(Color.yellow);
		del1.addActionListener(this);

		p11.setBackground(Color.black);

		p11.add(b16);
		p11.add(b17);
		p11.add(b18);
		p11.add(del1);

		jp1.add(p11);

		jp2.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));
		JPanel p12 = new JPanel();
		p12.setLayout(new GridLayout(0, 1, 20, 20));

		b20 = new JButton("** ADD NEW EQUIPMENT SUPPLIER  **");
		b20.setBackground(Color.yellow);
		b20.addActionListener(this);

		b21 = new JButton("** VIEW ALL EQUIPMENT SUPPLIERS **");
		b21.setBackground(Color.yellow);
		b21.addActionListener(this);

		b22 = new JButton("** UPDATE EQUIPMENT SUPPLIERS  **");
		b22.setBackground(Color.yellow);
		b22.addActionListener(this);

		del2 = new JButton("** DELETE  **");
		del2.setBackground(Color.yellow);
		del2.addActionListener(this);

		p12.add(b20);
		p12.add(b21);
		p12.add(b22);
		p12.add(del2);
		p12.setBackground(Color.black);

		jp2.add(p12);

		jp3.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));
		JPanel p13 = new JPanel();
		p13.setLayout(new GridLayout(0, 1, 20, 20));

		b24 = new JButton("** ADD NEW MEDICINE SUPPLIER  **");
		b24.setBackground(Color.yellow);
		b24.addActionListener(this);

		b25 = new JButton("** VIEW ALL MEDICINE SUPPLIERS **");
		b25.setBackground(Color.yellow);
		b25.addActionListener(this);

		b26 = new JButton("** UPDATE MEDICINE SUPPLIERS  **");
		b26.setBackground(Color.yellow);
		b26.addActionListener(this);

		del3 = new JButton("** DELETE  **");
		del3.setBackground(Color.yellow);
		del3.addActionListener(this);

		p13.setBackground(Color.black);

		p13.add(b24);
		p13.add(b25);
		p13.add(b26);

		p13.add(del3);

		jp3.add(p13);

		jp4.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 50));
		jp4.setBackground(Color.black);
		JPanel p14 = new JPanel();
		p14.setLayout(new GridLayout(0, 1, 20, 20));

		b28 = new JButton("** HOMEPAGE  ---->  **");
		b28.setBackground(Color.yellow);
		b28.addActionListener(this);
		p14.setBackground(Color.black);

		p14.add(b28);

		jp4.add(p14);

		jp1.setBackground(Color.black);
		jp2.setBackground(Color.black);
		jp3.setBackground(Color.black);
		JTabbedPane jt1 = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.WRAP_TAB_LAYOUT);
		jt1.add("FOOD", jp1);
		jt1.add("EQUIPMENT", jp2);
		jt1.add("MEDICINE", jp3);
		jt1.add("HOMEPAGE", jp4);
		f5.add(jt1);

	}

	@Override
	publicvoid actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			frame2();
			button2();
			j.setVisible(false);

		}

		if (e.getSource() == b5) {
			AddWorker w = new AddWorker();
			w.frame1();
			w.worker();
			w.butt3();

			f1.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == b7) {

			Viewworker w = new Viewworker();
			w.frame1();
			w.viewworker();
			w.butt3();

			f1.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == b6) {
			Updateworker w = new Updateworker();
			w.frame1();
			w.upworker();
			w.butt3();

			f1.setVisible(false);
			j.setVisible(false);

		}

		if (e.getSource() == b8) {
			Deleteworker w = new Deleteworker();
			w.frame1();
			w.dworker();
			w.butt3();

			f1.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == back1) {

			frame();
			f1.setVisible(false);
			j.setVisible(true);

		}

		if (e.getSource() == b2) {
			frame3();
			button3();
			j.setVisible(false);
			f1.setVisible(false);

		}

		if (e.getSource() == b9) {
			Addanimals w = new Addanimals();
			w.frame1();
			w.animal();
			w.butt3();
			f3.setVisible(false);
			j.setVisible(false);
//									

		}
		if (e.getSource() == b10) {
			Updateanimla w = new Updateanimla();
			w.frame1();
			w.upanimal();
			w.butt3();

			f3.setVisible(false);
			j.setVisible(false);

		}

		if (e.getSource() == b11) {
			Viewanimals w = new Viewanimals();
			w.frame1();
			w.viewanimal();
			w.butt3();

			f3.setVisible(false);
			j.setVisible(false);

		}

		if (e.getSource() == b12) {
			Deleteanimal w = new Deleteanimal();
			w.frame1();
			w.danimal();
			w.butt3();

			f3.setVisible(false);
			j.setVisible(false);

		}

		if (e.getSource() == back2) {
			frame();

			f3.setVisible(false);
//									    j.setVisible(false);

		}

		if (e.getSource() == b3) {
			Frame5();
			j.setVisible(false);

		}

		if (e.getSource() == b16) {
			Addfood w = new Addfood();
			w.frame1();
			w.addfood();
			w.butt3();
			f5.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == b17) {
			Viewfood w = new Viewfood();
			w.frame1();
			w.viewfood();
			w.butt3();

			f5.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == b18) {
			Updatefood w = new Updatefood();
			w.frame1();
			w.upfood();
			w.butt3();

			f5.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == del1) {
			Deletefood w = new Deletefood();
			w.frame1();
			w.dfood();
			w.butt3();

			f5.setVisible(false);
			j.setVisible(false);

		}

		if (e.getSource() == b20) {
			Addequipment w = new Addequipment();
			w.frame1();
			w.addequipment();
			w.butt3();

			f5.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == b21) {
			Viewequipment w = new Viewequipment();
			w.frame1();
			w.viewequip();
			w.butt3();
			f5.setVisible(false);
			j.setVisible(false);

		}

		if (e.getSource() == b22) {
			Updateequiptment w = new Updateequiptment();
			w.frame1();
			w.upequip();
			w.butt3();

			f5.setVisible(false);
			j.setVisible(false);

		}

		if (e.getSource() == del2) {
			Deleteequipment w = new Deleteequipment();
			w.frame1();
			w.dequip();
			w.butt3();
			f5.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == b24) {
			Addmedicine w = new Addmedicine();
			w.frame1();
			w.addmed();
			w.butt3();
			f5.setVisible(false);
			j.setVisible(false);
		}
		if (e.getSource() == b25) {
			Viewmedicine w = new Viewmedicine();
			w.frame1();
			w.viewemedi();
			w.butt3();

			f5.setVisible(false);
			j.setVisible(false);
		}

		if (e.getSource() == b26) {
			Updatemedicine w = new Updatemedicine();
			w.frame1();
			w.upmed();
			w.butt3();

			f5.setVisible(false);
			j.setVisible(false);
		}
		if (e.getSource() == del3) {
			Deletemedicine w = new Deletemedicine();
			w.frame1();
			w.dmed();
			w.butt3();
			f5.setVisible(false);
			j.setVisible(false);
		}

		if (e.getSource() == b4) {
			frame4();
			button4();
			j.setVisible(false);
		}

		if (e.getSource() == b13) {
			Addvisitor w = new Addvisitor();
			w.frame1();
			w.addvisit();
			w.butt3();
			f4.setVisible(false);
			j.setVisible(false);
		}

		if (e.getSource() == b14) {

			Viewvisit w = new Viewvisit();
			w.frame1();
			w.viewvisit();
			w.butt3();
			f4.setVisible(false);
			j.setVisible(false);
		}
		if (e.getSource() == b15) {

			Updatevisitor w = new Updatevisitor();
			w.frame1();
			w.upvisit();
			w.butt3();
			f4.setVisible(false);
			j.setVisible(false);
		}
		if (e.getSource() == b50) {
			Deltetvisitor w = new Deltetvisitor();
			w.frame1();
			w.dvisitor();
			w.butt3();
			f4.setVisible(false);
			j.setVisible(false);

		}
		if (e.getSource() == back3) {
			frame();
			f4.setVisible(false);
			j.setVisible(true);

		}

		if (e.getSource() == log) {
			j.setVisible(false);

		}

		if (e.getSource() == b28) {

			frame();
			f5.setVisible(false);

		}

	}

}
