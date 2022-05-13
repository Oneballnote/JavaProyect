package mx.iteso.javaproyect;

public class MetodosMatriz extends Determinante implements OperatorsMatriz{
    protected int MR[][]; 
	
	public MetodosMatriz(int[][] MR){
		setMR(MR);
	}

	public int[][] getMR() {return MR;}

	public void setMR(int[][] mR) {
		MR = mR;
	}
		
	@Override
	public int[][] suma(int[][] matrizASumar) {
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
	public int[][] resta(int[][] matrizARestar) {
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
	public int[][] productoxEscalar(int z) {
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
	public int[][] MultipM(int[][] r) {
		int[][] c = new int[this.MR.length][r[0].length];
	    // se comprueba si las matrices se pueden multiplicar
	    if (this.MR[0].length == r.length) {
	        for (int i = 0; i < this.MR.length; i++) {
	            for (int j = 0; j < r[0].length; j++) {
	                for (int k = 0; k < this.MR[0].length; k++) {
	                    // aquí se multiplica la matriz
	                    c[i][j] += this.MR[i][k] * r[k][j];
	                }
	            }
	        }
	    }
	     //si no se cumple la condición se retorna una matriz vacía
	    return c;
	}
	public Object clone(){
        Matriznxn matrizClone = new Matriznxn(this.MR);
        return matrizClone;
    }

}
