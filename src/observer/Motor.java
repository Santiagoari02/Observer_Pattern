package observer;

public class Motor implements Observador {

    public Motor(){}
    
    @Override
    public void update() {
        //Acción que se debe realizar cuando el acelerador es oprimido
        System.out.println("Subir potencia, arrancar sistema, etc...");

    }
    
}
