package it.beTalent.main;

import java.util.Scanner;

import it.beTalent.entities.Calcolatrice;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Inserisci 2 numeri: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String safe = scan.nextLine();
		System.out.println("Che operazione(somma, sottrazione, divisione o moltiplicazione) vuoi eseguire? ");
		String operazione = scan.nextLine();
		switch(operazione) {
		case "somma":
			Calcolatrice.somma(num1, num2);
		break;
		case "sottrazione":
			Calcolatrice.sottrazione(num1, num2);
		break;
		case "divisione":
			Calcolatrice.divisione(num1, num2);
		break;
		case "moltiplicazione":
			Calcolatrice.moltiplicazione(num1, num2);
		break;
		}

	}

}
