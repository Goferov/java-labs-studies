import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Color color1 = new Color(255, 33, 6);
        Color color2 = new Color(0, 0, 7);
        Color color3 = new Color(55, 60, 255, 128);

        System.out.println(color1);
        System.out.println("Red: " + color1.red());
        System.out.println("Green: " + color1.green());
        System.out.println("Blue: " + color1.blue());

        Color[] colors = {color1, color2, color3};
        Arrays.sort(colors);

        for (Color color : colors) {
            System.out.println(color);
        }
    }
}
