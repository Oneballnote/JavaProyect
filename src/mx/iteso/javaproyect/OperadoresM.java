package mx.iteso.javaproyect;

public class OperadoresM extends Matriznxn {

	public OperadoresM(double[][] M1, double[][] M2) {
		super(M1, M2);
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (this != o)
		{
			return false;
		}
		return this.MR == o;
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
}
