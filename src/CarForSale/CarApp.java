package CarForSale;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to GrandCircus Motors Admin Console!");
		
		
//Prmpts # cars
		System.out.println("How many cars would youlike to enter?");
		int numCars = scan.nextInt();

		// New Array to hold cars info
		ArrayList<Car> listOfCars = new ArrayList<>();

		for (int i = 0; i < numCars; i++) {

			System.out.println("Car # " + (1 + i) + " Enter the make");
			String make = scan.nextLine();
			scan.nextLine();

			System.out.println("Car # " + (1 + i) + " Enter the model");
			String model = scan.nextLine();

			System.out.println("Car # " + (1 + i) + " Enter the year");
			int year = scan.nextInt();

			System.out.println("Car # " + (1 + i) + " Enter the price");
			double price = scan.nextInt();
			
			listOfCars.add(new Car(make, model, year, price));
			System.out.println();
			scan.nextLine();
		}
		System.out.println("Current Inventory");
		System.out.println(listOfCars);
		
	}

}
