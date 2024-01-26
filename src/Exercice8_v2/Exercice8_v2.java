package Exercice8_v2;
import java.util.Scanner;

public class Exercice8_v2 {
         
	   public static void main(String[] args)
	   {
		   int [][] tab = new int [3][2];
		   double ttc , total =0;
		   Scanner scan = new Scanner(System.in);
		   
			   for(int i=0;i<tab.length;i++)
				   {
					   System.out.println("Taper la quantité commandé du produit"+(i+1)+": ");
					   tab[i][0]= scan.nextInt();
					   System.out.println("Taper le prix unitaire du produit"+(i+1)+": ");
					   tab[i][1]= scan.nextInt();
					   
						   if(i==2)
							   total = total+tab[i][0]*tab[i][1]*0.9;
						   else
							   total = total+tab[i][0]*tab[i][1];
				   }
			   System.out.println("Le total : "+total);
			   ttc=total*1.2;
			   System.out.println("Le ttc: "+ttc);
	   }
}
