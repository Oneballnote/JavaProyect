package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        double[] vect1 = new double[3];
        double[] vect2 = new double[3];

        Vector lolo = new Vector(vect1);
        Vector lala = new Vector(vect2);
        vect1[0] = 0;
        vect1[1] = 1;
        vect2[0] = 1;
        vect2[1] = 0;
        System.out.println(lolo.baseCanonica(vect2));
    }
}
