package mx.iteso.javaproyect;

public class Matriznxn implements operatorsM{
	
	protected double M1[][] = new double [3][3];
	protected double M2[][] = new double [3][3];
	
	protected double MR[][] = new double [3][3]; 
	
	public Matriznxn(double[][] M1, double[][] M2){
		setM1(M1);
		setM2(M2);
	}

	public double[][] getM1() {return M1;}

	public void setM1(double[][] m1) {
		M1 = m1;
	}

	public double[][] getM2() {return M2;}

	public void setM2(double[][] m2) {
		M2 = m2;
	}

	public double[][] getMR() {return MR;}

	public void setMR(double[][] mR) {
		MR = mR;
	}
	
	public void llenarM1() {
		
		for(int i = 0; i < M1.length; i++)
		{
			for(int j = 0; i < M1.length; i++)
			{
				M1[i][j] = (double)(Math.random() * 5);
			}
		}

	}
	
	public void llenarM2() {
		
		for(int i = 0; i < M2.length; i++)
		{
			for(int j = 0; i < M2.length; i++)
			{
				M1[i][j] = (double)(Math.random() * 5);
			}
		}

	}
	
	
	@Override
	public double[][] suma() {
		for(int i = 0; i < M1.length; i++)
		{
			for(int j = 0; i < M2.length; i++)
			{
				this.MR[i][j] = M1[i][j] + M2[i][j];
			}
		}		
		return this.MR;
	}

	@Override
	public double[][] resta() {
		for(int i = 0; i < M1.length; i++)
		{
			for(int j = 0; i < M2.length; i++)
			{
				MR[i][j] = M1[i][j] - M2[i][j];
			}
		}				
		return MR;
	}
}
