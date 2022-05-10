package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        double[] vect1 = new double[3];

        Vector lolo = new Vector(vect1);
        vect1[0] = 10;
        vect1[1] = 1;
            
        System.out.println(lolo.toString());
    }
}
