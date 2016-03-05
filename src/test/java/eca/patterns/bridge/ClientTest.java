package eca.patterns.bridge;

import eca.patterns.bridge.implementor.ConcreteImplementorA;
import org.testng.annotations.Test;

public class ClientTest {

    private Abstraction bridge = new AbstractionImpl(new ConcreteImplementorA());
    private Client client = new Client(bridge);

    @Test
    public void showAdaptedMessage() throws Exception {
        client.operation();
    }
}