import java.util.*;

public class store {
	
	private Boolean result = true, result2 = true;
	private int option;
	private Scanner in = new Scanner(System.in);
	private String name, pass;
	private Scanner in2 = new Scanner(System.in);
	customer c = new customer();
	cart ca = new cart();
	
	public static void main(String [] args) {
	store store = new store();
}
	public store() {
		page();
	}
	
private void page() {
	while (result == true) {
	try {
	System.out.println("Welcome to Shaun's Supermarket!");
	System.out.println("");
	System.out.println("Options: ");
	System.out.println("1 -Store Page-");
	System.out.println("2 -Login-");
	System.out.println("3 -Customer Details-");
	System.out.println("4 -Your Cart-");
	System.out.print("Your option: ");
	option = in.nextInt();
	switch(option) {
	case 1:
		System.out.println("---------------------------");
		products();
		break;
	case 2:
		System.out.println("---------------------------");
		login();
		break;
	case 3:
		System.out.println("---------------------------");
		cus_details();
		break;
	case 4:
		System.out.println("---------------------------");
		cart();
		break;
	default:
		System.out.println("---------------------------");
		System.out.println("Please enter a valid value");
		System.out.println("---------------------------");
		continue;
	}
	break;
	
} catch(InputMismatchException e) {
	System.out.println("---------------------------");
	System.out.println("Please enter a valid value");
	System.out.println("---------------------------");
	in.next();
	result = true;}
}}

private void products() {
	ca.items.add("Tomato");
	ca.items.add("Potato");
	ca.items.add("Watermelon");
	ca.items.add("Grapes");
	ca.items.add("Apple");
	for (int i = 0; i < ca.getItems().size();i++) 
    { 		   
        System.out.println(ca.items.get(i)); 		
    }   
	System.out.println("Product listing: ");
	System.out.println("What would you like to add to cart?");
	System.out.println("Your options:");
	option = in.nextInt();
	System.out.println("0 - View Cart");
	switch(option) {
		case 0:
			cart();
			break;
		case 1:
	}
}


private void login() {
	while (true) {
			System.out.print("Enter your account name: ");
			name = in2.next();
			System.out.println("");
			System.out.print("Enter your account password: ");
			pass = in2.next();
			if (c.getName() == null || c.getPassword() == null) {
				System.out.println("--------------");
				System.out.println("No user exists");
				System.out.println("--------------");
				while (result2 == true) {
				System.out.println("Would you like to create an account?");
				System.out.println("1 -Yes-");
				System.out.println("2 -No-");
				System.out.print("Your option: ");
				try {
				option = in2.nextInt();
				switch (option) {
				case 1:
					name = null;
					pass = null;
					register();
					break;
				case 2:
					System.out.println("-----------------------------------");
					System.out.println("You are redirected to the main page");
					System.out.println("-----------------------------------");
					page();
					break;
				default:
					System.out.println("---------------------------");
					System.out.println("Please enter a valid value");
					System.out.println("---------------------------");
					continue;
				}
				break;}
				catch(InputMismatchException e) {
					System.out.println("---------------------------");
					System.out.println("Please enter a valid value");
					System.out.println("---------------------------");
					in2.next();
					result2 = true;}}}
			
			else if (name.equals(c.getName()) && pass.equals(c.getPassword())) {
				System.out.println("----------");
				System.out.printf("Welcome %s!", c.getName());
				System.out.println("");
				System.out.println("----------");
			}
			
			else if (c.getName() != name && c.getPassword() != pass) {
				System.out.println("----------------------------------");
				System.out.println("Username or password is incorrect.");
				System.out.println("----------------------------------");
				continue;
			}
			
			break;}}

private void cus_details() {
	if (c.getName().equals(null)) {
		System.out.println("--------------------------------");
		System.out.println("Please login to see your details");
		System.out.println("--------------------------------");
		login();
		}
	else {
	System.out.println("");
	System.out.printf("Username: %s",c.getName());
	System.out.println("");
	System.out.printf("Password: %s",c.getPassword());
	System.out.println("");
	System.out.printf("Gender: %s",c.getGender());
	System.out.println("");
	System.out.printf("Email: %s",c.getEmail());
	System.out.println("");
	System.out.printf("Phone Number: %d",c.getPhone());
	System.out.println("");
	System.out.printf("Age: %d",c.getAge());}
	option = in.nextInt();
	boolean result3 = true;
	while (result3 == true) {
	try {
	switch(option) {
	case 1:
		System.out.println("---------------------------");
		products();
		break;
	case 2:
		System.out.println("---------------------------");
		login();
		break;
	default:
		System.out.println("---------------------------");
		System.out.println("Please enter a valid value");
		System.out.println("---------------------------");
		continue;
	}
	break;}

	catch(InputMismatchException e) {
	System.out.println("---------------------------");
	System.out.println("Please enter a valid value");
	System.out.println("---------------------------");
	in.next();
	result3 = true;}}}


private void register() {
	System.out.println("-------------------------");
	Scanner in3 = new Scanner(System.in);
	System.out.print("Enter your preferred name: ");
	String name1 = in3.next();
	c.setName(name1);
	System.out.print("Enter your preferred password: ");
	String pass1 = in3.next();
	c.setPassword(pass1);
	System.out.print("Enter your gender: ");
	String gender1 = in3.next();
	c.setGender(gender1);
	System.out.print("Enter your email: ");
	String email1 = in3.next();
	c.setEmail(email1);
	System.out.print("Enter your phone number: ");
	int phone1 = in3.nextInt();
	c.setPhone(phone1);
	System.out.print("Enter your age: ");
	int age1 = in3.nextInt();
	c.setAge(age1);
	System.out.println("----------------------------------------");
	System.out.println("You have succesfully created an account!");
	System.out.println("----------------------------------------");
	login();
}

public void cart() {
	ca.items.add("Tomato");
	ca.items.add("Potato");
	ca.items.add("Watermelon");
	ca.items.add("Grapes");
	ca.items.add("Apple");
	System.out.println("Items in cart: "); 
	for (int i = 0; i < ca.getItems().size();i++) 
    { 		   
        System.out.println(ca.items.get(i)); 		
    }  
	System.out.println("Price: RM 120.95"); 

	checkout();

}

public void checkout() {
	System.out.println("Thank you for purchasing with us!"); 
}}