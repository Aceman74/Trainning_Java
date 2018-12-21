package calcul;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		
int firstval = 0, secondval = 0, resultat = 0 ;
float firstvalD = 0, secondvalD = 0, resultatD = 0;
String operateur;

System.out.println("Bienvenue!");
System.out.println("----------");
System.out.println("Entrez une première valeur a calculer: ");
Scanner sc = new Scanner(System.in);
firstval = sc.nextInt();
System.out.println("Entrez le type d'opération voulu: (+ - / * ) ");
operateur = sc.next();
System.out.println("Entrez ensuite la seconde valeur a calculer: ");
secondval = sc.nextInt();

switch(operateur)
{
case "+" : 
	resultat = firstval + secondval;
System.out.print("Le résultat de l'opération " +firstval+ " "+operateur+" " +secondval+ " est " +resultat+ " !");
break;
case "-" : 
	resultat = firstval - secondval;
System.out.print("Le résultat de l'opération " +firstval+ " "+operateur+" " +secondval+ " est " +resultat+ " !");
break;
case "*" : 
	resultat = firstval * secondval;
System.out.print("Le résultat de l'opération " +firstval+ " "+operateur+" " +secondval+ " est " +resultat+ " !");
break;
case "/" : 
	firstvalD=firstval;
	secondvalD=secondval;
	resultatD = firstvalD / secondvalD;
System.out.print("Le résultat de l'opération " +firstval+ " "+operateur+" " +secondval+ " est " +resultatD+ " !");
break;

}
sc.close();
System.exit(0);
	}

}
