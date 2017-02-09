package teoria;

public class TeoriaWyjatki {
	/* 
	 Wyjatki - W programach, ktore tworzymy wystepuja bledy wszelkiego rodzaju.
	 Moga byc spowodowane wadliwie napisanym programem np.
	 
	 
	 try{
	 	kod programu mogacy generowac wyjatki
	 }
	 
	 catch (TypWyjatku1 a){
	 	Obsluga ywjatku a
	 }
	 catch (TypWyjatku2 b){
	 	Obsuga wyjatku b
	 }
	 finally{
	 	Blok instrukcji, ktory wykona sie niezaleznie,
	 	czy wyjatki wystapia, czy nie
	 }
	 
	 
	 
	 
	 WYKORZYSTANIE WLASNEGO WYJATKU
	 
	 public static double divide(double a, double b) throws DivideZeroException{
	 	if(b==0){
	 		throw new DivideZeroException("Nie mozna podzielic przez 0");
	 	}
	 	return a/b;
	 }
	 
	 
	 MAMY 2 rodzaje wyjatkow. Unchecked i checked, czyli takie ktore musimy przechwytywac
	 i takie, ktore mozemy ale nie musimy przechwytywac. Te ktore musimy przechwytywac, to 
	 RunTime Expcetion, czyli np. operacje wyjscia/wejscia (zapisaywanie, odczytywanie pliku) internety
	 itp itd. RunTime exception musimy przechwytywac.
	 
	 Inne wyjatki sa do naszej dyspozycji, jak np NullPointerException, ale nie musimy ich uzywac.
	 Z takich popularnych to IoException, IndexOutOfBounds itp itd.
	 */
	
	
}
