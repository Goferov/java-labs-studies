public class Shape {
    public void print() {
        System.out.println(getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Shape myShape = new Shape();
        myShape.print();
    }
}
