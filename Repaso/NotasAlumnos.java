package Repaso;

public class NotasAlumnos {
	public static void main(String[] args) {
		int nAlumnos= 4,ntEvaluaciones=4;
		
		int[][]notas;
		
		
		String[] nombreAlumnos = {"Pedro","Maria","Juana","Carlos"};
		
		BidimensionalHelper helper = new BidimensionalHelper();
	
		notas = helper.llenarArreglo(nAlumnos, ntEvaluaciones);
		
		helper.mostrarNotaAlumnos(nombreAlumnos, notas, nAlumnos, ntEvaluaciones);
		
		
	}
}
