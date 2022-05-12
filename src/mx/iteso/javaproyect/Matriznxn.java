package mx.iteso.javaproyect;

public class Matriznxn implements Operators{
	
	private double M1[][] = new double [3][3];
	private double M2[][] = new double [3][3];
	
	private double MR[][] = new double [3][3]; 
	
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


	public double[][] suma(double[][] x) {
		for(int i = 0; i < M1.length; i++)
		{
			for(int j = 0; i < M2.length; i++)
			{
				this.MR[i][j] = M1[i][j] + M2[i][j];
			}
		}		
		return this.MR;
	}


	public double[][] resta(double[][] x) {
		for(int i = 0; i < M1.length; i++)
		{
			for(int j = 0; i < M2.length; i++)
			{
				MR[i][j] = M1[i][j] - M2[i][j];
			}
		}				
		return MR;
	}


	public double[][] producto(double[][] x) {
		// TODO Auto-generated method stub
		return null;
	}


	public double[][] productoxEscalar(int y) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void imprimirMatriz() {
		
		for(int i = 0; i < M1.length; i++)
		{
			for(int j = 0; j < M1.length; j++)
			{
				System.out.println("[ " + M1[i][j] + " ]");
			}
			
			if (i == 1)
			{
				System.out.println("  +   ");
			}else {
				System.out.println("      ");
			}
			
			for (int j = 0; j < M2.length; j++)
			{
				System.out.println("[ " + M2[i][j] + " ]");
			}
			
			if(i == 1) 
			{
				System.out.println("  -   ");
			}else {
				System.out.println("      ");
			}
			
			for(int j = 0; j < MR.length; j++)
			{
				System.out.println("[ " + MR[i][j] + " ]");
			}
			System.out.println(" ");
		}
	}

	@Override
	public boolean independenciaLineal() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean baseCanonica(double[] lolo, double[] lala){
	
		
		
		return false;
	}

	
}
