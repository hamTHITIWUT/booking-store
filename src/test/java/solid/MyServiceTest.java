package solid;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MockRandom extends Random {
    @Override
    public int nextInt(int bound) {
        return 7;
    }
}

class MyServiceTest {
    @Test
    void testGenerateUUID() {
        MyService myService = new MyService(new MockRandom());
        assertEquals("DEMO7", myService.generateUUID());
    }

}