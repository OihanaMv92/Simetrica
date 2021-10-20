package es.studium.simetrica;

import java.util.Scanner;

public class simetrica
{

	public static void main(String[] args)
	{
	    final int filas = 3;
        final int columnas = 3;
        int tabla [][] = new int [filas][columnas];
        int i, j;
        boolean simetrica = true;
        Scanner teclado = new Scanner (System.in);
        for (i= 0; i< filas; i++) //rellenar tabla
        {
                for (j= 0; j< columnas; j++) 
                {
                        System.out.println("Dame el número entero ["+i+"]["+j+"]:");
                        tabla[i][j] = teclado.nextInt();
                }
        }
        for (i= 0; i< filas; i++) 
        {
                for (j= 0; j< columnas; j++) 
                {
                        if(tabla[i][j] != tabla[j][i]) 
                        {
                                simetrica = false;
                        }
                }
        }
        if(simetrica == true) 
        {
                System.out.println("la matriz es simétrica");
        }
        else
        {
                System.out.println("la matriz no es simétrica");
        }
}
}

