package teoria;

public class teoria {
	
	/*
	 //kolekcje i porownanie ich szybkosci pracy 
	 http://infotechgems.blogspot.ie/2011/11/java-collections-performance-time.html 
	  
	  No i np. mozemy z tej storny wywnioskowac, ze np
	  ArrayLista ma szybszy parametr Get niz np LinkedList, ale
	  LinkedList szybsza jest przy usuwaniu elementow (remove)
	  
	  Typy generyczne uzywamy jak wiemy co chcemy zrobic? lol 
	  w sensie jakie obiekty chyba itp. uzywamy do tego kolekcji
	  aby zdefiniowac, jaka grupe danych bedziemy przechowywac, dane
	  jakiego typu. Poki co tyle
	  http://kobietydokodu.pl/niezbednik-juniora-generyki/
	  
	  
	  A teraz glowne zajecai: 
	  	Wyrazenia regularne (inaczej zwane rigexy) pozwalaja na sprawdzenie,
	  czy dany ciag znakow jest napisany wedlug naszego wzorca ktorego sobie
	  wlasnie rigexem okreslimy. Czyli za jego pomoca sprawdzamy czy ciag znakow
	  odpowiada naszym wymaganiom, ktore okreslimy
	  Inaczej mowiac okreslaja wzorce dla ciagow znakow
	  	Wyrazenia regularne udostepniaja precyzyjna skladnie pozwalajaca
	  okreslac, jakie ciagi liter sa poprawnym dopasowaniem
	  	W wyrazeniach regularnych wsyzstkie znaki poza tymi:
	  	.*+?{|()[\^$ nie zmieniaja swojego znaczenia. np Java pasuje 
	  	jedynie do Java.
	  	
	  	- Znak . dopasowywany do dowolnego znaku. Np .a.a zostanie dopasowane 
	  	do Java jak i do data
	    
	    - * oznacza, ze poprzedzajace konstrukcje moga byc powtorzone 0 lub 
	    wiecej razy
	    
	    - + jest 1 lub wiecej razy
	    
	    - Przedrostek ? oznacza, ze konstrukcja jest opcjonalna (0 lub 1 raz)
	    
	    Przyklad: be+s? dopasuje sie do be, bee, oraz bees
	    
	    Kwantyfikatory:
	    co najmniej n i max m
	    a{1,4}b daje ab, aab, aaab , aaaab
	    co najmniej n
	    a{3,}b daje aaab, aaaab aaaaab (i podobne)
	    maksymalnie n
	    a{,3}b daje b, ab, aab, aaab
	    dokladnie n
	    a{3}b daje aaab
	    
	    Zakresy:
	    [abcde] jedna z ltier a b c d e
	    [a-zA-Z] jedna z liter od a do Z mala lub duza
	    [a-c3-5] od a do c lub cyfra od 3 do 5
	    [a-c14-7] litera od a do c lub cyfra 1 lub cyfra od 4 do 7
	    [abc\[\]] a lub b lub c ub nawias kwadratowy
	    [.] dowolna litera 
	    
	    clab: [abcde].*
	    
	    Klasy znakow:
	    \d cyfra z zakresu [0-9]
	    \D znak nie bedacy cyfra [^0-9]
	    \s Bialy znak [\t\n\x0B\f\r]
	    \S znak nie bedacy bialym znakiem [^\s]
	    \w mala lub duza litera lub cyfra [a-zA-Z_0-9]
	    \W znak nie bedacy cyfra lub litera [^\w]
	    
	    Grupy:
	    Sluza do laczenia bardzie jskomplikowanych struktur. Do
	    oznacznai grup uzywamy zwyklych nawiasow
	    a(bcd)* - litera a oraz ciag bcd zero lub wiecej razy
	    a(b(cd)?)+ - liera a, a nastepnie jedno lub wiecej 
	    powtorzen b lub bcd
	    
	    Przyklad: walidacja adresu ip:
	    np. 255.255.10.1
	    
	    ([0-9]{1,3}\.){3}[0-9]{1-3}
	    
	    a) [0-9]{1,3}\.  znaki od 0-9 w ilosci od 1-3
	    na ktorych koncu znajduje sie znak kropki
	    
	    b) {3} - powtorzenie kombinacji trzykrotnie
	    
	    c) [0-9]{1,3} - ostatnia czesc adresu IP, 
	    znaki 0-9 w ilosci 1-3
	    
	    
	    Klasy Pattern i Matcher
	    Pattern reprezentuje samo wyrazenie regularne bez odniesienia
	    sie do jakeigos konkretnego tekstu
	    Jej metoda .matcher(String) zwraca obiekt klasy Matcher, ktory reprezentuje
	    wynik wyszukiwania na konkretym ciagu znakow
	    
	    Np tworzymy jakies Matcher
	    Matcher matcher = pattern.matcher("aaaaaaaaaaaabcde");
	    i sprawdzamy czy to pasuje do takiej deifinicji:	    
	    System.out.println(Pattern.matches(".*\\s.*", "asd55"));
	    
	    
	    
	    
	  
	  
	 
	 */
}
