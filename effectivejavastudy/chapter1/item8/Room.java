package effectivejavastudy.chapter1.item8;

import java.lang.ref.Cleaner;
import java.lang.ref.Cleaner.Cleanable;

public class Room implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    private static class State implements Runnable {
        int count;

        public State(int count) {
            this.count = count;
        }


        @Override
        public void run() {
            System.out.println("delete data");
            count = 0;
        }
    }

    private final State state;

    private final Cleaner.Cleanable cleanable;

    public Room(int count) {
        state = new State(count);
        this.cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
