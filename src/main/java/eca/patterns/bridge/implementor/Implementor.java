package eca.patterns.bridge.implementor;

/**
 * Implementor defines the interface for implementation classes. This interface does not need to correspond directly to abstraction interface and can be very different. Abstraction imp provides an implementation in terms of operations provided by Implementor interface.
 */
public interface Implementor {

    void newOperation();

}
