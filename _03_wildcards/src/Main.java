public class Main {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(3);
        int x = box1.get();
        System.out.println(x);
        showInfo(box1);

        Box<String> box2 = new Box<>();
        box2.set("Mg Mg");
        String name = box2.get();
        System.out.println(name);

        showInfo(box2);
    }

    public static void showInfo(Box<? extends Person> box) {
        System.out.println("Box Data: " + box.get());
    }
}