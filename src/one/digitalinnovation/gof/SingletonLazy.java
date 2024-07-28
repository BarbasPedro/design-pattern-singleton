package one.digitalinnovation.gof;

/**
 * Singleton "Preguiçoso"
 *
 * @author Pedro
 */
public class SingletonLazy {

    static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static synchronized SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
