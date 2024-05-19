package effectivejavastudy.chapter2.item11;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(123, 123, 123), "a");

        System.out.println(m.get(new PhoneNumber(123, 123, 123)));
    }
}
