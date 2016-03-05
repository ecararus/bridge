package eca.patterns.bridge;

import eca.patterns.bridge.implementor.Implementor;

/**
 * Implements the abstraction interface using a reference to an object of type Implementor.
 */
public class AbstractionImpl implements Abstraction{

    private final Implementor implementor;

    public AbstractionImpl(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doOperation() {
        implementor.newOperation();
    }
}
