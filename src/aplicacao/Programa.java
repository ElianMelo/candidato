package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escol, xp; 
		char viajar, motorista;
		int ptEscol, ptXp;
		ptEscol = 0;
		ptXp = 0;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		
		escol = sc.nextInt();
		
		System.out.println("");
		System.out.print("Você tem quantos anos de experiência profissional? ");
		xp = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		viajar = sc.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		motorista = sc.next().charAt(0);
		
		if(escol == 1) {
			ptEscol = 10;
		} else if(escol == 2) {
			ptEscol = 20;
		} else if(escol == 3) {
			ptEscol = 30;
		} else if(escol == 4) {
			ptEscol = 40;
		}
		
		if(xp <= 0) {
			ptXp = 0;
		} else if(xp <= 2) {
			ptXp = 10;
		} else if(xp <= 5) {
			ptXp = 20;
		} else {
			ptXp = 40;
		}
		
		System.out.println("");
		System.out.println("Pontos por escolaridade: " + ptEscol);
		System.out.println("Pontos por experiência: " + ptXp);
		
		sc.close();

	}

}
