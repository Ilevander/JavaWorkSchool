package Exercice7;
import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) 
	  {
			int x,y,tmp;
			System.out.println("Entrer la valeur de x et y : ");
			Scanner scan = new Scanner(System.in);
			while(scan.hasNextInt()==false)
					{
						System.out.println("Entrer un nombre entier valide : ");
						scan.nextLine();
					}
			x=scan.nextInt();
			y=scan.nextInt();
			System.out.println("Avant : ");
			System.out.println("La valeur de x = " +x+ "\t la valeur de y=" +y);
			tmp = x;
			x = y;
			y = tmp;
			System.out.println("Après : ");
			System.out.println("La valeur de x = " +x+ "\t la valeur de y=" +y);
			
		
		}
}
