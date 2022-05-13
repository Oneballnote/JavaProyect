package mx.iteso.javaproyect;

public class Vector implements OperatorsVect{
        private Estados E1 =  Estados.CORRECTO;
        private int[] vect = new int[3];

   public Vector(int[] vect){
        setVect(vect);
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    public int[] getVect() {
        return vect;
    }

    public int[] suma(int[] x) {

        for(int i = 0; i < this.vect.length;i++){
            this.vect[i] +=  x[i];
        } 
        System.out.println(E1.toString());
        return this.vect;
    }

 
    public int[] resta(int[] x) {
        for(int i = 0; i < this.vect.length; i++){
            this.vect[i] -= x[i];
        }
        System.out.println(E1.toString());
        return this.vect;
    }

 
    public int[] productoxEscalar(int y) {
        for(int i = 0; i < this.vect.length;i++){
            this.vect[i] *= y;
        }
        System.out.println(E1.toString());
        return this.vect;
    }

    
    public int[] productoCruz(int[] segundaMatriz){
        try {
            int[] terceraMatriz = {0,0,0};
            if((segundaMatriz.length != 3) && (this.vect.length !=3)){
           
                throw new ManejoDeExcepciones(); 
            }else{
                terceraMatriz[0] = (this.vect[1]*segundaMatriz[2])-(this.vect[2]*segundaMatriz[1]); 
                terceraMatriz[1] = (this.vect[2]*segundaMatriz[0])-(this.vect[0]*segundaMatriz[2]);
                terceraMatriz[2] = (this.vect[0]*segundaMatriz[1])-(this.vect[1]*segundaMatriz[0]);
                this.vect = terceraMatriz;
                System.out.println(E1.toString());
                return this.vect;
            }
        } catch (ManejoDeExcepciones e) {
            System.out.println("Este metodo funciona solo con vectores en R3");
        }
        System.out.println(E1.toString());
        return this.vect;
    }

   @Override
    public boolean baseCanonica(int[] lolo){
        
        if(((lolo[0] == 1)&&(lolo[1] == 0)||(lolo[0] == 0) && (lolo[1] == 1))&&((this.vect[0] == 1)&&(this.vect[1] == 0)||(this.vect[0] == 0) && (this.vect[1] == 1))){
            
            System.out.println(E1.toString());
            return true;
        }
        System.out.println(E1.toString());
        return false;
    }

    @Override
    public String toString(){
        String msg = " ";

       for (int i = 0; i < vect.length; i++) {
           msg += this.vect[i] + " ";
       }
            return msg;
    }
    
    public boolean equals(Vector o){
        int[] lolo = o.getVect();

        for (int i = 0; i < 3; i++) {
            if(this.vect[i] != lolo[i]){
                return false;
            }
        }
        return true;
    }

    public Vector clone(){
        Vector vectorClone = new Vector(this.vect);
        return vectorClone;
    }

    
}
