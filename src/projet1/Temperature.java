package projet1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// importation scanner
		Scanner sc = new Scanner(System.in);

		// initialisation de 'O' pour oui
		char reponse = 'O';

		// variable vide
		int convertion = 0;
		int temperature = 0;

		// presentation du code
		System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
		System.out.println("-------------------------------------------------");

		// début de la boucle
		while (reponse == 'O') {

			// choix du type de convertion
			System.out.println("Choisissez le mode de conversion :");
			// celcius - farhrenheit
			System.out.println("1 - Convertisseur celcius - farhrenheit");
			// farhrenheit - celcius
			System.out.println("2 - Convetisseur farhrenheit - celcius");
			try {
				// entrer de la valeur
				convertion = sc.nextInt();

				if (convertion == 1 || convertion == 2) {
					boolean isNumber = false;
					while (isNumber == false) {
						try {
							// choix de la température a convertir
							System.out.println("Temprérature à convertir :");
							// entrer de la valeur
							temperature = sc.nextInt();
							isNumber = true;

						} catch (InputMismatchException e) {
							System.out.println("!! MAUVAIS CARACTERE !!");
							sc.nextLine();

						}
					}

					// resultats
					// si la temperature est en Celsius...
					if (convertion == 1) {
						// calcul
						float F = (float) (1.8) * (float) (temperature) + 32;
						// affichage valeur
						System.out.printf("%d °C correstpond à : %.2f °F \n", temperature, F);
					}
					// si la temperature est en Farhenheit...
					if (convertion == 2) {
						// calcul
						float C = (float) (temperature - 32) / (float) (1.8);
						// affichage valeur
						System.out.printf("%d °F correstpond à : %.2f °C \n", temperature, C);
					}
				}

				else
					// error
					System.out.println("! Converion non reconnu !");
				sc.nextLine();
				// demander si vous voulez recommencer
				System.out.println("\nsouhaitez vous convertir une nouvelle température ? (O/N)");
				// recuperation response
				reponse = sc.nextLine().charAt(0);
			} catch (InputMismatchException e) {
				System.out.println("!! MAUVAIS CARACTERE !!");
			}
			sc.nextLine();

		}

		// fin du programme
		System.out.println("Au revoir");

	}

}
