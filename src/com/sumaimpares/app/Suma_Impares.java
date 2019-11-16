/*
 * Iván Gamaliel Sánchez Zepeda
 * Github: ivangsanchez
 */

package com.sumaimpares.app;

public class Suma_Impares {

	public static void main(String[] args) {
		int suma=0;
		
		for(int i=0;i<=100;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				//suma=suma+i;
				suma+=i;
			}
		}
		
		System.out.println("La suma de impares es: "+suma);
		

	}

}
