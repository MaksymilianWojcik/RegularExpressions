package teoria;

import java.io.IOException;

public class Wyjatki {

	public static void main(String[] args){
		// TODO Auto-generated method stub

			new Wyjatki().divide(5, 0);

	}
	
	
	public Wyjatki(){
		System.out.println(divide(5,0));
	}
	
	

	public int divide(int a, int b){
		if (b==0){
			throw new IllegalArgumentException(" BLAD dzielenia przez 0");
		}
		return a/b;
	}

}
