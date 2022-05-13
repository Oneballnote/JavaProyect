package mx.iteso.javaproyect;

public class Test {
    public static void main(String[] args) {
        int[] primerVector = {2,3,4};
        int[] segundoVector = {9,4,5};

        Vector objetoVector = new Vector(primerVector);
        Vector objetoSegundoVector = new Vector(segundoVector);

        System.out.println(objetoVector.baseCanonica(segundoVector));

        System.out.println(objetoVector.toString());
        objetoVector.suma(segundoVector);   
        System.out.println(objetoVector.toString());
        objetoVector.resta(segundoVector);
        System.out.println(objetoVector.toString());
        objetoVector.productoxEscalar(2);
        System.out.println(objetoVector.toString());
        objetoVector.equals(objetoSegundoVector);
        objetoVector.equals(objetoVector);
        
        objetoSegundoVector = objetoVector.clone();   
        System.out.println(objetoSegundoVector.toString());   
        
        int[][] primerMatriz1 = {{2,5,6},{4,4,5},{1,1,1}};
        int[][] segundaMatriz = {{2,5,6},{4,4,5},{1,1,1}};
        
        Matriznxn lolo = new Matriznxn(primerMatriz1);
        System.out.println(lolo.determinante(primerMatriz1, primerMatriz1[0].length));

        System.out.println(lolo.toString());
        lolo.suma(segundaMatriz);
        System.out.println(lolo.toString());
        lolo.resta(segundaMatriz);
        System.out.println(lolo.toString());
        lolo.productoxEscalar(5);
        System.out.println(lolo.toString());
        lolo.MultipM(segundaMatriz);
        System.out.println(lolo.toString());


        Matriznxn matrizClonada = lolo.clone();
        System.out.println(matrizClonada.toString());

        System.out.println(lolo.equals(lolo));


    }
}
