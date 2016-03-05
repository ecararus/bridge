package eca.patterns.bridge;

/**
 * Collaborates with objects conforming to the Abstraction interface.
 */
public class Client {

    private final Abstraction abstraction;

    public Client(Abstraction abstraction) {
        this.abstraction = abstraction;
    }

    public void operation() {
        abstraction.doOperation();
    }

}
