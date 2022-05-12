package mx.iteso.javaproyect;

public class Matriznxn extends OperadoresM{
	
	
	// determinante

	public Matriznxn(double[][] MR) {
		super(MR);
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
		
		for(int i = 0; i < MR.length; i++)
		{		
			for(int j = 0; j < MR.length; j++)
			{
				System.out.println("[ " + MR[i][j] + " ]");
			}
			if (i == 1)
			{
				System.out.println("  +   ");
			}else {
				System.out.println("      ");
			}
		}
	}
}
