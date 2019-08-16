package qwerty;

import java.util.HashMap;
import java.util.Scanner;

public class ECommerce {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> customer = new HashMap<>();
		HashMap<String, Integer> product = new HashMap<>();
		String ch;
		do {
			System.out.println("1. Create Customer");
			System.out.println("2. To login");
			System.out.println("3. Create Product");
			System.out.println("2. To display product");
			System.out.println("Enter your choice(n to exit): ");
			ch = scan.next();
			switch (ch) {
			case "1":
				createCustomer(customer);
				break;

			case "2":
				boolean bool = login(customer);
				if (bool) {
					System.out.println("1. Create Order");
					System.out.println("2. Checkout");
					System.out.println("Enter your choice: ");
				}
				else {
					System.out.println("Wrong Credentials, Try again");
				}
				break;

			case "3":
				createProduct(product);
				break;

			case "4":
				displayProduct(product);
				break;

			default:
				break;
			}
		} while (ch != "n");
	}
	
	public static void createCustomer(HashMap<String, String> map) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter user name : ");
		String name = scan.next();

		System.out.println("Enter password : ");
		String pass = scan.next();

		map.put(name, pass);

	}

	public static boolean login(HashMap<String, String> map) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter user name : ");
		String name = scan.next();

		System.out.println("Enter password : ");
		String pass = scan.next();

		if (map.containsKey(name)) {
			if (pass == map.get(name)) {
				return true;
			}
		}
		return false;

	}

		public static void createProduct(HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter product name : ");
		String pname = scan.next();

		System.out.println("Enter price : ");
		int price = scan.nextInt();

		map.put(pname, price);
	}

	public static void displayProduct(HashMap<String, Integer> map) {
		System.out.println(map);
	}
	
	public static void createOrder()
	{
		
	}
	
	public static void checkout()
	{
		
	}
	

}
