package mx.iteso.javaproyect;

public class Determinante {

	public static void obtenerCofactor(int[][] M, int[][] temp, int p, int q, int n) {
		int i = 0; int j = 0;
		for(int fila = 0; fila < n; fila++)
		{
			for(int columna = 0; columna < n; columna++)
			{
				if(fila != p && columna != q)
				{
					temp[i][j++] = M[fila][columna];
					if(j == n - 1)
					{
						j = 0;
						i++;
					}
				}
			}
		}
	}
	
	public static int determinante(int M[][], int n) {
		int det = 0;
		if(n == 1) 
		{
			return M[0][0];
		}
		int temp[][] = new int[n][n];
		int multp = 1;
		for(int f = 0; f < n; f++)
		{
			obtenerCofactor(M, temp, 0, f, n);
			det += multp * M[0][f] * determinante(temp, n-1);
			multp = -multp;
		}
		return det;
		
	}
}
