package eca.patterns.bridge.implementor;

/**
 * Implements the Implementor interface.
 */
public class ConcreteImplementorA implements Implementor {

    public void newOperation() {
        System.out.print("Implementor A");
    }
}
