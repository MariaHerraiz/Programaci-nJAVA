package edu.ucjc.javagrado.ejercicios;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		// SELECCIONAR ESTADOS DEL AÑO A PARTIR DE UN MES INTRODUCIDO
		
		String mes = "Enero";
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nombre del mes: ");
		mes = scan.nextLine();
		
		 // 1 -> With IF

		if (mes.equalsIgnoreCase("ENERO") || mes.equalsIgnoreCase("FEBRERO") || mes.equalsIgnoreCase("MARZO")) {
			System.out.println("(IF) Es invierno");
			
		}else if (mes.equalsIgnoreCase("ABRIL") || mes.equalsIgnoreCase("MAYO") || mes.equalsIgnoreCase("JUNIO")) {
			System.out.println("(IF) Es primavera");
			
		}else if (mes.equalsIgnoreCase("JULIO") || mes.equalsIgnoreCase("AGOSTO") || mes.equalsIgnoreCase("SEPTIEMPRE")) {
			System.out.println("(IF) Es verano");
			
		}else if (mes.equalsIgnoreCase("OCTUBRE") || mes.equalsIgnoreCase("NOVIEMBRE") || mes.equalsIgnoreCase("DICIEMBRE")) {
			System.out.println("(IF) Es otoño");
			
		}else {
			System.out.println("(IF) TE HAS EQUIVOCADO");
		}
		
		// 2 -> With SWITCH
		switch (mes.toUpperCase()){
		case "ENERO":
		case "FEBRERO":
		case "MARZO": System.out.println("(SWITCH) Es invierno");break;
		
		case "ABRIL":
		case "MAYO":
		case "JUNIO": System.out.println("(SWITCH) Es primavera");break;
		
		case "JULIO":
		case "AGOSTO":
		case "SEPTIEMBRE": System.out.println("(SWITCH) Es verano");break;
		
		case "OCTUBRE":
		case "NOVIEMBRE":
		case "DICIEMBRE": System.out.println("(SWITCH) Es otoño");break;
		
		default: System.out.println("(SWITCH) TE HAS EQUIVOCADO");
		}

	}

}
