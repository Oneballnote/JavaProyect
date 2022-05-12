package mx.iteso.javaproyect;

public class OperadoresM implements operatorsM{
    protected double MR[][]; 
	
	public OperadoresM(double[][] M1){
		setMR(M1);
	}

	public double[][] getMR() {return MR;}

	public void setMR(double[][] mR) {
		MR = mR;
	}
		
	@Override
	public double[][] suma(double[][] matrizASumar) {
		for(int i = 0; i < MR.length; i++)
		{
			for(int j = 0; j < MR.length; j++)
			{
				this.MR[i][j] +=  matrizASumar[i][j];
			}
		}		
		return this.MR;
	}

	@Override
	public double[][] resta(double[][] matrizARestar) {
		for(int i = 0; i < MR.length; i++)
		{
			for(int j = 0; j < MR.length; j++)
			{
				this.MR[i][j] -=  matrizARestar[i][j];
			}
		}				
		return MR;
	}

	@Override
	public double[][] productoxEscalar(int z) {
		for(int i = 0; i < MR.length; i++)
		{
			for(int j = 0; j < MR.length; j++)
			{
				this.MR[i][j] *= z;
			}
		}
		return this.MR;
	}

	@Override
	public boolean independenciaLineal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean baseCanonica(double[][] lolo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void obtenerCofactor(int[][] M, int[][] temp, int p, int q, int n) {
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
	
	public int determinante(int M[][], int n) {
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