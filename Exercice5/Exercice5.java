package Exercice5;
import java.util.Scanner;

public class Exercice5 {
	
	public static void main(String[] args) {
		int a,b;
		int somme , produit,mod;
		System.out.println("Veuillez entrer 2 chiffres: ");
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			if(scan.hasNextInt()== true)
			{
				a = scan.nextInt();
				b = scan.nextInt();
				break;
			}
			else
			{
				System.out.println("Veuilliez entrer un nombre entier valide :");
				scan.nextLine();
			}
		}
		
		somme = a+b;
		produit = a*b;
		mod = a%b;
		System.out.println("La Somme est : " +a+ "+" +b+ "=" +somme);
		System.out.println("Le Produit est : " +a+ "*" +b+ "=" +produit);
		System.out.println("Le Modulo est : " +a+ "%" +b+ "=" +mod);
		
	}
}