package Repaso;

import java.util.Random;

public class BidimensionalHelper {

		public int aleatorio(int min, int max){
			Random rand = new Random();
			int randomNum= rand.nextInt((max-min)+1)+min;
			
			return randomNum;
		}
		public int [][] llenarArreglo(int numeroFilas,int numeroColumnas){
			int[][] arreglo = new int [ numeroFilas][numeroColumnas];
			for (int i = 0; i < numeroFilas; i++) {
				for (int j = 0; j < numeroColumnas; j++) {
					arreglo[i][j]= aleatorio (1,20);
				}
			}
			return arreglo;
		}

		public void mostrarNotaAlumnos(String[] nombreAlumnos, int[][] notas, int nAlumnos, int ntEvaluaciones){
			for (int i = 0; i < nAlumnos; i++) {
				for (int j = 0; j < ntEvaluaciones; j++) {
					System.out.println(nombreAlumnos[i] + "evaluacion # ["+ j + "] : " +notas[i][j]);
			}	
		}
	}
}