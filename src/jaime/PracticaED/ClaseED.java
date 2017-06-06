package jaime.PracticaED;

import java.io.*;

public class ClaseED
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, suma;
		
		System.out.println("Ingrese número: ");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Deme otro número: ");
		num2 = Integer.parseInt(lectura.readLine());
		
		suma = num1 + num2;
		System.out.println("La suma es "+suma);
	}
}
