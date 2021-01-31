package strumienie;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//silnia
		String wynik;
		
		wynik = Stream.iterate(1, i -> i + 1).limit(5).reduce(1, (total, b) -> total * b).toString();
		
		System.out.println("wynik silni " + wynik);
		
		
		
		// ciag Fibonnaciego
		
		StringBuilder wynikFib = new StringBuilder(""); 
		
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(7).forEach(x -> wynikFib.append(x[0] + " "));

		System.out.println("Ci¹g Fibonnaciego " + wynikFib);
		
		
		// litery alfabetu
		
		StringBuilder wynikAlfa = new StringBuilder(""); 
		Stream.iterate('A', i -> (char) (i + 1)).limit(26).forEach(x -> wynikAlfa.append(x + " "));
		
		System.out.println("litery alfabetu " + wynikAlfa);
		
		
		
		// odwrócony alfabet
		//StringBuilder wynikAlfaOd = new StringBuilder(""); 
		
		
		StringBuilder wynikAlfaOd = new StringBuilder(""); 
		
		Stream.iterate('A', i -> (char) (i + 1)).limit(26).sorted(Collections.reverseOrder()).forEach(i -> wynikAlfaOd.append(i + " ") );
				
	
		System.out.println( "odwrócony alfabet " + wynikAlfaOd);
		
		
		
	}

}
