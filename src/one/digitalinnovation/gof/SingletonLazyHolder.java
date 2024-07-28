package one.digitalinnovation.gof;

import static one.digitalinnovation.gof.SingletonLazy.instancia;

/**
 * Singleton "LazyHolder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author Pedro
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}

