package homework.git;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("pickup");
		Car car2 = new Car("sedan");
		
		System.out.println("ten samochód to "+car1.getType());
		car1.sedan();
		System.out.println("ten samochód to "+car1.getType());
		
		car2.combi();
		System.out.println("ten samochód to "+car2.getType());
		
		
		car2.pickup();
		System.out.println("ten samochód to "
				+ ""+car2.getType());
		
		
	}

}
