package observer;

public class Main {

    public static void main(String[] args) {

        //A Acelerador -> B (Motor)
        //Motor "Observador" observa al objeto observable "Acelerador"
        
        //Se crean los "Observadores"
        Motor v6 = new Motor();
        Motor v8 = new Motor();
        Motor v10 = new Motor();
        
        //Se crea el "SujetoOservable"
        Acelerador y = new Acelerador();
        
        y.enlazarObservador(v6);
        y.enlazarObservador(v8);
        
        y.pisarAcelerador();
    }
    
}
