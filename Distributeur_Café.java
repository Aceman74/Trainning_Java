package machine_cafe;

import java.util.Calendar;
import java.util.Scanner;

public class Distributeur_Café {

	public static void main(String[] args) {
		int nb5c = 0, nb10c = 0, nb20c = 0, pièce;
		int totalReçu = 0;
		String réponse = null;
		Scanner sc = new Scanner(System.in);    
	      Calendar now = Calendar.getInstance();
	      System.out.println("		" +now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));
	 
		System.out.println("	*** Machine a café ***");
		System.out.println("Pièces acceptés: 5, 10, 20 Cents ");
		System.out.println("Pour obtenir un café, entrez au moins 45 Cents.");
		System.out.println("(Cet appareil rends la monnaie!)");
		do
		{
			System.out.print("Valeur de la pièce insérée: ");
			pièce = sc.nextInt();
			switch (pièce)
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
					pièce = 0;
					System.out.println("Pièce non reconnue");
			}
			totalReçu = totalReçu + pièce;
			System.out.println("Vous avez inséré: ");
			System.out.println("	" +nb5c+ "Pièces de 5 Centimes.");
			System.out.println("	" +nb10c+ "Pièces de 10 Centimes.");
			System.out.println("	" +nb20c+ "Pièces de 20 Centimes.");
			System.out.println("Pour un total de " +totalReçu+ "Centimes." );
		}
		while (totalReçu <= 45);
		System.out.println("-- Café en cours --");
		if (totalReçu > 45)
			System.out.println("Monnaie rendu : " +(totalReçu - 45)+ " Centimes.");
		System.out.println("Voulez vous un autre café? (oui/non).");
		réponse = sc.next();
		switch(réponse)
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
			totalReçu = 0;
			main(null);
			break;
			default :
				System.out.println("Aurevoir!");
				sc.close();
		}
		}
}
