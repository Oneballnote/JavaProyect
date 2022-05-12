package mx.iteso.javaproyect;

public class Vector implements OperatorsVect{
        private Estados E1 =  Estados.CORRECTO;
        private double[] vect = new double[3];

   public Vector(double[] vect){
        setVect(vect);
    }

    public void setVect(double[] vect) {
        this.vect = vect;
    }

    public double[] getVect() {
        return vect;
    }

    public double[] suma(double[] x) {

        for(int i = 0; i < 3;i++){
            this.vect[i] +=  x[i];
        } 
        System.out.println(E1.toString());
        return this.vect;
    }

 
    public double[] resta(double[] x) {
        for(int i = 0; i < 3;i++){
            this.vect[i] -= x[i];
        }
        return null;
    }

 
    public double[] productoxEscalar(int y) {
        for(int i = 0; i < 3;i++){
            this.vect[i] *= y;
        }
        return this.vect;
    }

    @Override
    public String toString(){

        String msg = " ";
        if(this.vect[2] == 0 ){
            msg = String.format("Vector: [%.2f], [%.2f]", this.vect[0],this.vect[1]);

        }else{
            msg = String.format("Vector: [%.2f], [%.2f], [%.2f]", this.vect[0],this.vect[1],this.vect[2]);

        }
        return msg;
    }

    @Override
    public boolean independenciaLineal() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean baseCanonica(double[] lolo){
        
        if(((lolo[0] == 1)&&(lolo[1] == 0)||(lolo[0] == 0) && (lolo[1] == 1))&&((this.vect[0] == 1)&&(this.vect[1] == 0)||(this.vect[0] == 0) && (this.vect[1] == 1))){
            return true;
        }
        return false;
    }
    
    public boolean equals(Vector o){
        double[] lolo = o.getVect();

        for (int i = 0; i < 3; i++) {
            if(this.vect[i] != lolo[i]){
                return false;
            }
        }
        return true;
        
    }

    
}
