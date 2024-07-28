package one.digitalinnovation.gof;

import static one.digitalinnovation.gof.SingletonLazy.instancia;

/**
 * Singleton "Apressado"
 *
 * @author Pedro
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
