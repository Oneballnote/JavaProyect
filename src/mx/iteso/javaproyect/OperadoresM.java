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
	public boolean baseCanonica(double[][] lolo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double[][] MultipM(double[][] r) {
		double[][] c = new double[this.MR.length][r[0].length];
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

}
