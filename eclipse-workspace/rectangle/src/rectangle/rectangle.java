package rectangle;

import java.util.Scanner;
public class rectangle {
	public static void main(String [] arg) {

	double surface, largeur, longueur  ;
	Scanner lectureClavier = new Scanner(System.in);
	System.out.print("Largeur  : ")  ;
	largeur = lectureClavier.nextDouble();
	System.out.print("Longueur  : ")  ;
	longueur = lectureClavier.nextDouble();
	System.out.print("Largeur: " + largeur + " Longueur:" + longueur);
	surface = largeur * longueur;
	System.out.print(" Surface = " + surface);


}}

