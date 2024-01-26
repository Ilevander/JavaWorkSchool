package Exercice8;
import java.util.Scanner;

public class Exercice8 {
public static void main(String[] args)
{
	double total,ttc,pr1,pr2,pr3;
	int qte1,qte2,qte3;
	System.out.println("Taper la quantité commandé de produit 1: ");
	Scanner scan = new Scanner(System.in);
	
	qte1 = scan.nextInt();
	System.out.println("Taper le prix unitaire de produit 1 :");
	pr1 = scan.nextDouble();
	System.out.println("Taper la quantité commandé de produit 2 :");
	qte2 = scan.nextInt();
	System.out.println("Taper le prix unitaire de produit 2 :");
	pr2 = scan.nextDouble();
	System.out.println("Taper la quantité commandé de produit 3 :");
	qte3 = scan.nextInt();
	System.out.println("Taper le prix unitaire de produit 3 :");
	pr3 = scan.nextDouble();
	
	total = pr1*qte1 + pr2*qte2 + pr3*qte3*0.9 ;
	ttc = total*1.2;
	
	System.out.println("Total commandé \t" +total);
	System.out.println("Prix ttc \t" +ttc);
}

}
