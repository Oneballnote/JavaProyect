package mx.iteso.javaproyect;

public class Gauss extends OperadoresM {

	public Gauss(int[][] MR) {
		super(MR);
	}

	static void pivote(int m[][], int piv, int var) {
        float temp = 0;
        temp = m[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            m[piv][y] = (int)(m[piv][y] / temp);
        }
    }
	
	static void hacerCeros(float m[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = m[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    m[x][z] = ((-1 * c) * m[piv][z]) + m[x][z];
                }
            }
        }
    }
	
}
