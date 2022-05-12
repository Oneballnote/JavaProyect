package mx.iteso.javaproyect;

public class OperadoresM implements OperatorsM{
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

    public double[][] productoxEscalar(int y){
        for (int i = 0; i < MR.length; i++) {
            for (int j = 0; j < MR.length; j++) {
                this.MR[i][j] *= y;
            }
        }
        return this.MR;
    }
}
