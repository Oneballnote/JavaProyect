package mx.iteso.javaproyect;

public enum Estados {
        CORRECTO("Ejecucion correcta"), ERRONEO("Erroneo");

        private String lolo;
        

        private Estados(String aceptado){
                this.lolo = aceptado;
        }
        public String toString(){
                return lolo;
        }
}
