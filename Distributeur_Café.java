package machine_cafe;

import java.util.Calendar;
import java.util.Scanner;

public class Distributeur_Caf� {

	public static void main(String[] args) {
		int nb5c = 0, nb10c = 0, nb20c = 0, pi�ce;
		int totalRe�u = 0;
		String r�ponse = null;
		Scanner sc = new Scanner(System.in);    
	      Calendar now = Calendar.getInstance();
	      System.out.println("		" +now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
	 
		System.out.println("	*** Machine a caf� ***");
		System.out.println("Pi�ces accept�s: 5, 10, 20 Cents ");
		System.out.println("Pour obtenir un caf�, entrez au moins 45 Cents.");
		System.out.println("(Cet appareil rends la monnaie!)");
		do
		{
			System.out.print("Valeur de la pi�ce ins�r�e: ");
			pi�ce = sc.nextInt();
			switch (pi�ce)
			{
			case 5 :
				nb5c = nb5c + 1 ;
				break;
			case 10 : 
				nb10c = nb10c + 1 ;
				break;
			case 20 :
				nb20c = nb20c + 1 ;
				break;
				default :
					pi�ce = 0;
					System.out.println("Pi�ce non reconnue");
			}
			totalRe�u = totalRe�u + pi�ce;
			System.out.println("Vous avez ins�r�: ");
			System.out.println("	" +nb5c+ "Pi�ces de 5 Centimes.");
			System.out.println("	" +nb10c+ "Pi�ces de 10 Centimes.");
			System.out.println("	" +nb20c+ "Pi�ces de 20 Centimes.");
			System.out.println("Pour un total de " +totalRe�u+ "Centimes." );
		}
		while (totalRe�u <= 45);
		System.out.println("-- Caf� en cours --");
		if (totalRe�u > 45)
			System.out.println("Monnaie rendu : " +(totalRe�u - 45)+ " Centimes.");
		System.out.println("Voulez vous un autre caf�? (oui/non).");
		r�ponse = sc.next();
		switch(r�ponse)
		{
		case "oui" :
		case "OUI" :
		case "Oui" :
		case "yes" :
		case "YES" :
		case "Yes" :
			nb5c = 0;
			nb10c = 0;
			nb20c = 0;
			totalRe�u = 0;
			main(null);
			break;
			default :
				System.out.println("Aurevoir!");
				sc.close();
		}
		}
}
