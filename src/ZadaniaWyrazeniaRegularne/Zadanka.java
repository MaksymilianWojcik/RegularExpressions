package ZadaniaWyrazeniaRegularne;

import java.util.regex.Pattern;

public class Zadanka {

	
	public static void main(String[] args){
		
		// - Czy pierwsze trzy znaki s� dowolne, za� nast�pne 3 znaki
		// tylko cyframi?
		
		//pierwsyz parametr to nasze wymogi, drugi to przyklad sprawdzany
		//System.out.println(Pattern.matches(".{3}\\d{3}", "134123"));
		
		// ten drugi bekslesz oznacza, ze nasz \d jest jakims
		//polecniem dla rigexu a nie dla stringa,
		//bez tego String wyswietlil by blad
		
		// sprawdzenie: dla przykladu as123 dla blad
		// ale juz asd123 dla true, tak samo aj3456, 543543 itp itd
		
		
		
		String text = "AA44445555";
		
		
		
		// - Czy string zawiera tylko cyfry? 
		System.out.println(Pattern.matches("\\d+", text));
		
		//- Czy string zawiera tylko litery?
		System.out.println(Pattern.matches("[a-zA-Z]+", text));
		
		//- Czy string zawiera tylko cyfry i litery? 
		System.out.println(Pattern.matches("\\w+", text));
		
		// - Czy string zawiera tylko cyfry i ma dok�adnie 5 znak�w?
		System.out.println(Pattern.matches("\\d{5}", text));
		
		//- Czy string rozpoczyna si� od "J"? 
		System.out.println(Pattern.matches("J.*", text));
		
		//- Czy string rozpoczyna si� od "J" i ko�czy na "U"? 
		System.out.println(Pattern.matches("J.*U", text));
		
		// - Czy string rozpoczyna si� od wielkiej litery? 
		System.out.println(Pattern.matches("[A-Z].*", text));
		
		// - Czy string zawiera spacj�? (bia�y znak)? 
		System.out.println(Pattern.matches(".*\\s.*", text));
		
		//- Czy string jest numerem telefonu zaczynaj�cym si� od 7 lub 8 lub 9? 
		System.out.println(Pattern.matches("[7-9]\\d{8}", text));
		
		// - Czy string jest numerem bankowym? (Zak�adaj�c, �e zaczyna si� od dw�ch liter,
		// nast�pnie 4 grupy po 4 cyfry)
		System.out.println(Pattern.matches("([a-zA-Z]{2}[a-zA-Z]?)(\\d{4}){2}", text));
		//lub krocej:
		System.out.println(Pattern.matches("([a-zA-Z]{2,3})(\\d{4})(\\d{4})", text));
		//- Czy string jest kodem pocztowym?
		System.out.println(Pattern.matches("\\d{2}\\-\\d{3}", text));
		
		
		
		
		
	}
	
}
