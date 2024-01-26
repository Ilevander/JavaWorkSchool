package Exercice6;
import java.util.Scanner;
import java.lang.Math;

public class Exercice6 {

    public static void main(String[] args) {
        double rayon, volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer la valeur du rayon :");
        while (!scan.hasNextDouble()) {
            System.out.println("Veuillez entrer la valeur du rayon :");
            scan.nextLine();
        }
        rayon = scan.nextDouble();
        volume = (4.0 / 3.0) * Math.PI * Math.pow(rayon, 3);
        System.out.println("Le volume : " + volume);
    }
}
