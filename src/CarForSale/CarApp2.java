package CarForSale;

import java.util.ArrayList;
import java.util.Scanner;


public class CarApp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String display = "yes";
		
		ArrayList<UsedCar> car = new ArrayList<>();
		
	do {
		System.out.println("Welcome to GrandCircus Motors Admin Console!\n");
		//
		car.add(new UsedCar("1, Honda","CRV", "2004", 4000, 245000));
		//
		car.add(new UsedCar( "2, Ford","Fiesta", "1990", 1000, 300000));
		//
		car.add(new UsedCar( "3, VolksWagon","Rabbit", "1973", 900, 150000));
		//
		car.add(new UsedCar("4, Honda","CRV", 1990, 1000));
		//
		car.add(new UsedCar("5, Jeep","Cherokee", 1990, 3000 ));
		//
		car.add(new UsedCar( "6, Jeep","Wrangler", 2000, 7000));
		
		
		for (Car i : car) {
		}
			System.out.println(car);
			
		System.out.println("Which car would you like?");
		int num = scan.nextInt();
	
		
		if (num ==1) {
			System.out.println(new UsedCar("1, Honda","CRV", "2004", 4000, 245000));
		}
		else if (num == 2) {
			System.out.println(new UsedCar("2, Ford","Fiesta", "1990", 1000, 300000));
			
		}
		else if (num == 3) {
			System.out.println(new UsedCar("3, VolksWagon","Rabbit", "1973", 900, 150000));
		}
		else if (num == 4) {
			System.out.println(new UsedCar("4, Honda","CRV", 1990, 1000));
		}
		else if (num == 5) {
			System.out.println(new UsedCar("5, Jeep","Cherokee", 1990, 3000 ));
		}
		else if (num == 6) {
			System.out.println(new UsedCar("6, Jeep","Wrangler", 2000, 7000));
		}else {
			System.out.println("Sorry, invalid entry");
		}

		System.out.println("Would you like to buy this car?");
		String buy = scan.next();
		if (buy.equalsIgnoreCase("yes")){
			System.out.println("Excellent! Our finance department will be with you shortly.");
			scan.next();
		
		car.remove(num);			
		
		}
		
		
		for (Car i : car) {
		}
			System.out.println(car);
	}while(display.equalsIgnoreCase("yes"));	
			
	
			
			
			
			
//		for(Car a : car)
//		
//		if (a instanceof UsedCar){	
//			System.out.println(a.getMake() + a.getClass()+ " ");
//		}else if(a instanceof Car){
//			System.out.println(a.getMake() + a.getClass()+ " ");
//		}
		
		
		}
	
	}
