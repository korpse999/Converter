/**
 * 
 */
package converter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author xdoyen
 *
 */
public class Converter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" **************************************");
		System.out.println("******* Conversion de temp�rature ******");
		System.out.println(" **************************************");
		Scanner sc = new Scanner(System.in);

		// variables
		double entreeTemp = 0.0;
		char saisie = ' ';

		// liste pour les choix de temperatures
		ArrayList<Character> choix = new ArrayList<Character>();
		choix.add('C'); // Celsius
		choix.add('F'); // Farenheit

		// formatage du r�sultat
		NumberFormat nf = new DecimalFormat("0.##");

		do { // Boucle pour le choix

			System.out.println("Indiquez votre choix :");
			System.out.println(" C pour une conversion en degr�s Celsius");
			System.out.println(" F pour une conversion en degr�s Farenheit");

			saisie = sc.nextLine().charAt(0);
			saisie = Character.toUpperCase(saisie);

			if (!choix.contains(saisie))

				System.out.println("Ce choix n'est pas correct");

		} while (!choix.contains(saisie));

		System.out.println("Saisissez la temp�rature � convertir : ");
		if (saisie == 'C') {
			System.out.println(" en �F :");
		} else if (saisie == 'F') {
			System.out.println(" en �C : ");
		}

		entreeTemp = sc.nextDouble();

		// pour vider la ligne
		sc.nextLine();

		// cr�ation nouveaux objets : temperature actuelle T1 et temperature
		// convertie TC
		// pas d'unit� de mesure pour la cr�ation, c'est ajout� en fonction du
		// choix de conversion
		Temperature T1 = new Temperature(entreeTemp);
		Temperature TC;

		if (saisie == 'C') {
			System.out.println("Conversion en degr� Celsius");

			T1.setUniteDeMesure('F');

			// conversion de la temp�rature
			TC = T1.conversionC();
			// TC.setUniteDeMesure('C');

		} else { /*if (saisie == 'F') */
			System.out.println("Conversion en degr� Farenheit");

			T1.setUniteDeMesure('C');

			// conversion de la temperature
			TC = T1.conversionF();
			// TC.setUniteDeMesure('F');

		}

		// construction chaine pour affichage
		StringBuffer sb = new StringBuffer(nf.format(T1.getTemperature()));
		sb.append(" �");
		sb.append(T1.getUniteDeMesure());
		sb.append(" est �gal � ");
		sb.append(nf.format(TC.getTemperature()));
		sb.append(" �");
		sb.append(TC.getUniteDeMesure());
		sb.append(".");

		// affichage chaine avec conversion
		System.out.println(sb);

		sc.close();
		System.out.println("FIN");

	}

}
