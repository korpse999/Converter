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
		System.out.println("******* Conversion de température ******");
		System.out.println(" **************************************");
		Scanner sc = new Scanner(System.in);

		// variables
		double entreeTemp = 0.0;
		char saisie = ' ';

		// liste pour les choix de temperatures
		ArrayList<Character> choix = new ArrayList<Character>();
		choix.add('C'); // Celsius
		choix.add('F'); // Farenheit

		// formatage du résultat
		NumberFormat nf = new DecimalFormat("0.##");

		do { // Boucle pour le choix

			System.out.println("Indiquez votre choix :");
			System.out.println(" C pour une conversion en degrés Celsius");
			System.out.println(" F pour une conversion en degrés Farenheit");

			saisie = sc.nextLine().charAt(0);
			saisie = Character.toUpperCase(saisie);

			if (!choix.contains(saisie))

				System.out.println("Ce choix n'est pas correct");

		} while (!choix.contains(saisie));

		System.out.println("Saisissez la température à convertir : ");
		if (saisie == 'C') {
			System.out.println(" en °F :");
		} else if (saisie == 'F') {
			System.out.println(" en °C : ");
		}

		entreeTemp = sc.nextDouble();

		// pour vider la ligne
		sc.nextLine();

		// création nouveaux objets : temperature actuelle T1 et temperature
		// convertie TC
		// pas d'unité de mesure pour la création, c'est ajouté en fonction du
		// choix de conversion
		Temperature T1 = new Temperature(entreeTemp);
		Temperature TC;

		if (saisie == 'C') {
			System.out.println("Conversion en degré Celsius");

			T1.setUniteDeMesure('F');

			// conversion de la température
			TC = T1.conversionC();
			// TC.setUniteDeMesure('C');

		} else { /*if (saisie == 'F') */
			System.out.println("Conversion en degré Farenheit");

			T1.setUniteDeMesure('C');

			// conversion de la temperature
			TC = T1.conversionF();
			// TC.setUniteDeMesure('F');

		}

		// construction chaine pour affichage
		StringBuffer sb = new StringBuffer(nf.format(T1.getTemperature()));
		sb.append(" °");
		sb.append(T1.getUniteDeMesure());
		sb.append(" est égal à ");
		sb.append(nf.format(TC.getTemperature()));
		sb.append(" °");
		sb.append(TC.getUniteDeMesure());
		sb.append(".");

		// affichage chaine avec conversion
		System.out.println(sb);

		sc.close();
		System.out.println("FIN");

	}

}
