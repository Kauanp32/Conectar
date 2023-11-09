package Conectar;

import java.util.Scanner;

public class ControleEstoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a base do rentangulo x: " );
		double  xBase= sc.nextInt();
		
		System.out.print("Digite a altura do rentangulo x: " );
		double xAltura= sc.nextInt();
		
		double xArea= xBase * xAltura;
	
		System.out.print("Digite a base do rentangulo y: " );
		double  yBase= sc.nextInt();
		
		System.out.print("Digite a altura do rentangulo y: " );
		double yAltura= sc.nextInt();
		
		double yArea= xBase * xAltura;
		
		if( xArea > yArea) {
			System.out.print("A area do retangulo X e maior" );
		}else{
			System.out.print("Da area do retangulo Y e maior" );	
		}
			
	}
	
}