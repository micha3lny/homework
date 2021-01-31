package homework.git;

public class Car extends Type implements CarType {

	
	public Car (String type) {
		setType(type);
	}
	
	public void setType(String type) {
		this.type= type;
	}
	
	public void pickup() {
		
		if (getType().equals("pickup")) {
			System.out.println("to jest pick up");
		} else if (getType().equals("sedan")){
			setType("pickup");
			System.out.println("zamieniono z sedana w pickupa");
		}
		else if (getType().equals("combi")){
			setType("pickup");
			System.out.println("zamieniono z kombi w pickupa");
		}
	}
	
	
	public void sedan() {
		
		if (getType().equals("sedan")) {
			System.out.println("to jest ju¿ sedan");
		} else if (getType().equals("pickup")){
			
			System.out.println("nie mozna zamieniæ pickupa w sedana");
		}
		else if (getType().equals("kombi")){
			
			System.out.println("nie mo¿na zamieniæ kombi w sedana");
		}
	}
	
	
	public void combi() {
		
		if (getType().equals("combi")) {
			System.out.println("to jest combi");
		} else if (getType().equals("pickup")){
			
			System.out.println("nie mozna zamieniæ pickupa w combi");
		}
		else if (getType().equals("sedan")){
			
			System.out.println("nie mo¿na zamieniæ sedana w combi");
		}
	}
	
	
	
}
