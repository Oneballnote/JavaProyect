package mx.iteso.javaproyect;

public class Matriznxn extends MetodosMatriz{
	
	public Matriznxn(int[][] MR) {
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
    public String toString() {
		String msg = "";
		int j = 0;
		for(int i = 0; i < MR.length; i++){
						
			for(j = 0; j < MR[i].length; j++)
			{
				msg +=  this.MR[i][j] + " " ;
			}
			msg += "\n";
			
		}
		 return msg;
	}

	public Matriznxn clone(){
        Matriznxn matrizClone = new Matriznxn(this.MR);
        return matrizClone;
    }
}
