import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Q1 extends JFrame implements ItemListener, ActionListener{
		
		final int snappers = 70, porks = 60, beefs = 50, ducks = 50, tofus = 15, dumplings = 25, springs = 15, buns = 20,
				teas = 2, waters = 1, fruits = 5, sodas = 3, tiras = 15, cheeses = 15;
		int total = 0;
		
		JCheckBox snapper, pork, duck, beef, tofu, dumpling, spring, bun, tea, water, fruit, tira, cheese, soda;
		JTextField totalp = new JTextField(15);
		JTextField after = new JTextField(10);
		JButton OK;
		JFrame frame2;
		
		Font font = new Font("Serif", Font.BOLD,40);
		Font font2 = new Font("SansSerif", Font.PLAIN,18);
		Font sub = new Font("Monospace", Font.BOLD,10);
		Font con = new Font("SansSerif", Font.BOLD,15);
		Color min = new Color(236,233,227);
		
		Q1() {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(min);
		
		OK = new JButton ("CONFIRM");
		OK.setHorizontalAlignment(SwingConstants.RIGHT);
		OK.setBounds(360,570,105,35);
		OK.setFont(con);
		OK.setBackground(min);
		panel.add(OK);
		
		JLabel title = new JLabel ("THE GRAND LOTUS");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(45,-30,500,150);
		title.setFont(font);
		panel.add(title);
		
		JLabel title2 = new JLabel ("CHINESE CUISINE");
		title2.setHorizontalAlignment(SwingConstants.CENTER);
		title2.setBounds(195,65,200,20);
		title2.setFont(font2);
		panel.add(title2);
		
		after.setHorizontalAlignment(SwingConstants.CENTER);
		after.setBounds(150,90,300,20);
		after.setBackground(min);
		panel.add(after);
		
		JLabel main = new JLabel ("MAIN COURSES");
		main.setHorizontalAlignment(SwingConstants.LEFT);
		main.setBounds(60,140,200,20);
		main.setFont(font2);
		panel.add(main);
		
		snapper = new JCheckBox ("RED SNAPPER FLAMBÉ | $" + snappers, false);
		snapper.setHorizontalAlignment(SwingConstants.LEFT);
		snapper.setBounds(20,165,200,20);
		snapper.setBackground(min);
		JLabel snapper2 = new JLabel ("Deep Fried Fish Fillet with fresh lime and");
		snapper2.setHorizontalAlignment(SwingConstants.LEFT);
		snapper2.setBounds(25,178,250,20);
		snapper2.setFont(sub);
		JLabel snapper3 = new JLabel ("orange juice, celery and black pepper");
		snapper3.setHorizontalAlignment(SwingConstants.LEFT);
		snapper3.setBounds(25,188,250,20);
		snapper3.setFont(sub);
		JLabel snapper4 = new JLabel ("flambéed with colntreau.");
		snapper4.setHorizontalAlignment(SwingConstants.LEFT);
		snapper4.setBounds(25,198,250,20);
		snapper4.setFont(sub);
		panel.add(snapper);
		panel.add(snapper2);
		panel.add(snapper3);
		panel.add(snapper4);
		
		pork = new JCheckBox ("CANTONESE ROASTED PORK | $" + porks,false);
		pork.setHorizontalAlignment(SwingConstants.LEFT);
		pork.setBounds(20,225,250,20);
		pork.setBackground(min);
		JLabel pork2 = new JLabel ("Belly pork seasoned and cooked to");
		pork2.setHorizontalAlignment(SwingConstants.LEFT);
		pork2.setBounds(25,238,250,20);
		pork2.setFont(sub);
		JLabel pork3 = new JLabel ("perfection in a honey glaze served on a");
		pork3.setHorizontalAlignment(SwingConstants.LEFT);
		pork3.setBounds(25,248,250,20);
		pork3.setFont(sub);
		JLabel pork4 = new JLabel ("bed of choi sum.");
		pork4.setHorizontalAlignment(SwingConstants.LEFT);
		pork4.setBounds(25,258,250,20);
		pork4.setFont(sub);
		panel.add(pork);
		panel.add(pork2);
		panel.add(pork3);
		panel.add(pork4);
		
		beef = new JCheckBox ("CHILI BEEF | $" + beefs,false);
		beef.setHorizontalAlignment(SwingConstants.LEFT);
		beef.setBounds(20,285,250,20);
		beef.setBackground(min);
		JLabel beef2 = new JLabel ("Char grilled sizzling sliced sirloin served");
		beef2.setHorizontalAlignment(SwingConstants.LEFT);
		beef2.setBounds(25,298,250,20);
		beef2.setFont(sub);
		JLabel beef3 = new JLabel ("well done with thai lemongrass and");
		beef3.setHorizontalAlignment(SwingConstants.LEFT);
		beef3.setBounds(25,308,250,20);
		beef3.setFont(sub);
		JLabel beef4 = new JLabel ("bird's eye chili dip.");
		beef4.setHorizontalAlignment(SwingConstants.LEFT);
		beef4.setBounds(25,318,250,20);
		beef4.setFont(sub);
		panel.add(beef);
		panel.add(beef2);
		panel.add(beef3);
		panel.add(beef4);
		
		duck = new JCheckBox ("PECKING DUCK | $" +ducks,false);
		duck.setHorizontalAlignment(SwingConstants.LEFT);
		duck.setBounds(20,345,250,20);
		duck.setBackground(min);
		JLabel duck2 = new JLabel ("With shredded cucumber and tamarind");
		duck2.setHorizontalAlignment(SwingConstants.LEFT);
		duck2.setBounds(25,358,250,20);
		duck2.setFont(sub);
		JLabel duck3 = new JLabel ("sauce.");
		duck3.setHorizontalAlignment(SwingConstants.LEFT);
		duck3.setBounds(25,368,250,20);
		duck3.setFont(sub);
		panel.add(duck);
		panel.add(duck2);
		panel.add(duck3);
		
		JLabel credit = new JLabel ("For any inquiries,  ");
		credit.setHorizontalAlignment(SwingConstants.CENTER);
		credit.setBounds(195,615,200,20);
		JLabel credit2 = new JLabel ("Please contact us at: +603-5576-234");
		credit2.setHorizontalAlignment(SwingConstants.CENTER);
		credit2.setBounds(165,630,250,20);
		panel.add(credit);
		panel.add(credit2);
		
		JLabel side = new JLabel ("SIDES:");
		side.setHorizontalAlignment(SwingConstants.LEFT);
		side.setBounds(60,410,200,20);
		side.setFont(font2);
		panel.add(side);
		
		tofu = new JCheckBox ("DRIED TOFU | $" + tofus,false);
		tofu.setHorizontalAlignment(SwingConstants.LEFT);
		tofu.setBounds(20,435,200,20);
		tofu.setBackground(min);
		JLabel tofu2 = new JLabel ("Freshly made with natural soy milk!");
		tofu2.setHorizontalAlignment(SwingConstants.LEFT);
		tofu2.setBounds(25,448,200,20);
		tofu2.setFont(sub);
		JLabel tofu3 = new JLabel ("(6 Pieces)");
		tofu3.setHorizontalAlignment(SwingConstants.LEFT);
		tofu3.setBounds(25,458,200,20);
		tofu3.setFont(sub);
		panel.add(tofu);
		panel.add(tofu2);
		panel.add(tofu3);
		
		dumpling = new JCheckBox("CHINESE DUMPLINGS | $" +dumplings,false);
		dumpling.setHorizontalAlignment(SwingConstants.LEFT);
		dumpling.setBounds(20,485,200,20);
		dumpling.setBackground(min);
		JLabel dumpling2 = new JLabel ("Wrapped in dumpling skin with pork and");
		dumpling2.setHorizontalAlignment(SwingConstants.LEFT);
		dumpling2.setBounds(25,498,200,20);
		dumpling2.setFont(sub);
		JLabel dumpling3 = new JLabel ("spring onions. (12 Pieces)");
		dumpling3.setHorizontalAlignment(SwingConstants.LEFT);
		dumpling3.setBounds(25,508,200,20);
		dumpling3.setFont(sub);
		panel.add(dumpling);
		panel.add(dumpling2);
		panel.add(dumpling3);
		
		spring = new JCheckBox("SPRING ROLLS | $" +springs,false);
		spring.setHorizontalAlignment(SwingConstants.LEFT);
		spring.setBounds(20,535,250,20);
		spring.setBackground(min);
		JLabel spring2 = new JLabel ("Wrapped in dumpling skin with pork and");
		spring2.setHorizontalAlignment(SwingConstants.LEFT);
		spring2.setBounds(25,548,250,20);
		spring2.setFont(sub);
		JLabel spring3 = new JLabel ("spring onions. (12 Pieces)");
		spring3.setHorizontalAlignment(SwingConstants.LEFT);
		spring3.setBounds(25,558,250,20);
		spring3.setFont(sub);
		panel.add(spring);
		panel.add(spring2);
		panel.add(spring3);
		
		JLabel drink = new JLabel ("DRINKS:");
		drink.setHorizontalAlignment(SwingConstants.LEFT);
		drink.setBounds(350,140,200,20);
		drink.setFont(font2);
		panel.add(drink);
		
		tea = new JCheckBox("HOT TEA | $" +teas,false);
		tea.setHorizontalAlignment(SwingConstants.LEFT);
		tea.setBounds(310,165,200,20);
		tea.setBackground(min);
		panel.add(tea);
		
		soda = new JCheckBox("SODA | $" + sodas,false);
		soda.setHorizontalAlignment(SwingConstants.LEFT);
		soda.setBounds(310,185,200,20);
		soda.setBackground(min);
		panel.add(soda);
		
		water = new JCheckBox("MINERAL WATER | $" + waters,false);
		water.setHorizontalAlignment(SwingConstants.LEFT);
		water.setBounds(310,205,200,20);
		water.setBackground(min);
		panel.add(water);
		
		fruit = new JCheckBox("FRUIT JUICE | $" + fruits,false);
		fruit.setHorizontalAlignment(SwingConstants.LEFT);
		fruit.setBounds(310,225,200,20);
		fruit.setBackground(min);
		panel.add(fruit);
		
		JLabel des = new JLabel ("DESSERT:");
		des.setHorizontalAlignment(SwingConstants.LEFT);
		des.setBounds(350,270,200,20);
		des.setFont(font2);
		panel.add(des);
		
		tira = new JCheckBox("TIRAMISU CAKE | $" + tiras,false);
		tira.setHorizontalAlignment(SwingConstants.LEFT);
		tira.setBounds(310,295,200,20);
		tira.setBackground(min);
		JLabel tira2 = new JLabel ("Fresly Made Coffee-Flavoured Italian");
		tira2.setHorizontalAlignment(SwingConstants.LEFT);
		tira2.setBounds(315,308,200,20);
		tira2.setFont(sub);
		JLabel tira3 = new JLabel ("Dessert (1 Piece)");
		tira3.setHorizontalAlignment(SwingConstants.LEFT);
		tira3.setBounds(315,318,200,20);
		tira3.setFont(sub);
		panel.add(tira);
		panel.add(tira2);
		panel.add(tira3);
		
		cheese = new JCheckBox("CHEESECAKE | $" + cheeses,false);
		cheese.setHorizontalAlignment(SwingConstants.LEFT);
		cheese.setBounds(310,345,200,20);
		cheese.setBackground(min);
		JLabel cheese2 = new JLabel ("Sweet Dessert made from cheese, eggs");
		cheese2.setHorizontalAlignment(SwingConstants.LEFT);
		cheese2.setBounds(315,358,200,20);
		cheese2.setFont(sub);
		JLabel cheese3 = new JLabel ("and sugar. (1 Piece)");
		cheese3.setHorizontalAlignment(SwingConstants.LEFT);
		cheese3.setBounds(315,368,200,20);
		cheese3.setFont(sub);
		panel.add(cheese);
		panel.add(cheese2);
		panel.add(cheese3);
		
		JLabel image = new JLabel(new ImageIcon("C:\\Users\\User\\Desktop\\rsz_spring-rolls-thumb-new.jpg"));
		image.setHorizontalAlignment(SwingConstants.CENTER);
		image.setBounds(120,165,600,600);
		panel.add(image);
		
		totalp.setText("$" + total);
		after.setText("");
		
		snapper.addItemListener(this);
		duck.addItemListener(this);
		beef.addItemListener(this);
		pork.addItemListener(this);
		dumpling.addItemListener(this);
		tofu.addItemListener(this);
		spring.addItemListener(this);
		tea.addItemListener(this);
		soda.addItemListener(this);
		water.addItemListener(this);
		fruit.addItemListener(this);
		tira.addItemListener(this);
		cheese.addItemListener(this);
		OK.addActionListener(this);
		
		JLabel fin = new JLabel("The total price of your order is ");
		fin.setHorizontalAlignment(SwingConstants.RIGHT);
		fin.setBounds(280,535,200,20);
		totalp.setHorizontalAlignment(SwingConstants.RIGHT);
		totalp.setBounds(485,535,35,20);
		totalp.setBackground(min);
		panel.add(fin);
		panel.add(totalp);
		
		JFrame frame = new JFrame("THE GRAND LOTUS - Online Order Service");
		frame.setSize(600,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.add(panel);
		
		
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		Object source = e.getSource();
		int select = e.getStateChange();
		
		if(source == snapper)
			if(select == ItemEvent.SELECTED)
				total += snappers;
			else
				total -= snappers;
		if(source == pork)
			if(select == ItemEvent.SELECTED)
				total += porks;
			else
				total -= porks;
		if(source == beef)
			if(select == ItemEvent.SELECTED)
				total += beefs;
			else
				total -= beefs;
		if(source == duck)
			if(select == ItemEvent.SELECTED)
				total += ducks;
			else
				total -= ducks;
		if(source == spring)
			if(select == ItemEvent.SELECTED)
				total += springs;
			else
				total -= springs;
		if(source == tofu)
			if(select == ItemEvent.SELECTED)
				total += tofus;
			else
				total -= tofus;
		if(source == dumpling)
			if(select == ItemEvent.SELECTED)
				total += dumplings;
			else
				total -= dumplings;
		if(source == tea)
			if(select == ItemEvent.SELECTED)
				total += teas;
			else
				total -= teas;
		if(source == soda)
			if(select == ItemEvent.SELECTED)
				total += sodas;
			else
				total -= sodas;
		if(source == water)
			if(select == ItemEvent.SELECTED)
				total += waters;
			else
				total -= waters;
		if(source == fruit)
			if(select == ItemEvent.SELECTED)
				total += fruits;
			else
				total -= fruits;
		if(source == tira)
			if(select == ItemEvent.SELECTED)
				total += tiras;
			else
				total -= tiras;
		if(source == cheese)
			if(select == ItemEvent.SELECTED)
				total += cheeses;
			else
				total -= cheeses;
		

		totalp.setText("$" + total);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		after.setText("Thank you for purchasing with us!");
	}
	public static void main(String[] args) {
		new Q1();
	}
}
