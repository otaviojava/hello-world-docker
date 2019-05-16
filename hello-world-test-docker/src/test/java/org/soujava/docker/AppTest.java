package org.soujava.docker;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        final GenericContainer mongodb =
                new GenericContainer("mongo:latest")
                        .withExposedPorts(27017)
                        .waitingFor(Wait.defaultWaitStrategy());

        mongodb.start();
        Assertions.assertNotNull(mongodb.getContainerIpAddress());
        Assertions.assertNotNull(mongodb.getFirstMappedPort());
        mongodb.stop();
    }
}
