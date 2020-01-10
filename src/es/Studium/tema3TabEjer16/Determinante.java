package es.Studium.tema3TabEjer16;
/**
 Determinante - Realizar un programa en JAVA que lea una matriz 3x3 y calcule su determinante.
 */
import java.util.Scanner;

public class Determinante 
{

	public static void main(String[] args) 
	{
		int tabla1[][]= new int [3][3];
		Scanner teclado = new Scanner(System.in);
		introducirMatriz(tabla1, teclado);
		teclado.close();
		calcularDeterminante(tabla1);
	}

	private static void calcularDeterminante(int[][] tabla1) {
		int determinante;
		determinante=tabla1[0][0]*tabla1[1][1]*tabla1[2][2]+tabla1[2][0]*tabla1[0][1]*tabla1[1][2]+tabla1[1][0]*tabla1[2][1]*tabla1[0][2];
		determinante=determinante-tabla1[2][0]*tabla1[1][1]*tabla1[0][2]-tabla1[0][0]*tabla1[2][1]*tabla1[1][2]-tabla1[1][0]*tabla1[0][1]*tabla1[2][2];
		System.out.print("El determinante vale " +determinante);
	}

	private static void introducirMatriz(int[][] tabla1, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir de la tabla 1 el valor " + i + " , " + e + " : ");
				tabla1 [i][e] = teclado.nextInt();
			}
		}
	}

}
