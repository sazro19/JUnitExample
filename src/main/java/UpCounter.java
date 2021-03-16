public class UpCounter extends AbstractCounter {

    public static final long MAX_VALUE = 1000;

    public UpCounter() {
        counter = 0;
    }

    public UpCounter(long counter) {
        this.counter = counter;
    }

    public UpCounter(AbstractCounter counter) {
        this.counter = counter.counter;
    }

    @Override
    public void count() {
        if (isMax()) {
            counter = 0;
        } else {
            counter++;
        }
    }

    private boolean isMax() {
        return counter == MAX_VALUE;
    }
}

