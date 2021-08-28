package solid;

import java.util.Random;

public class MyService {

    Random random;

    MyService(Random random) {
        this.random = random;
    }

    public String generateUUID() {
        String data = "DEMO";
        int randomNumber = random.nextInt(10);
        return data + randomNumber;
    }
}
