public abstract class AbstractCounter {

    protected long counter;

    public abstract void count();

    public long getCounter() {
        return counter;
    }
}
