public class Box <T> extends Person{
    private T v;

    public void set(T v) {
        this.v = v;
    }

    public T get() {
        return this.v;
    }
}
