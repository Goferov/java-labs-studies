record Color(int red, int green, int blue, int alpha) implements Comparable<Color> {

    public Color {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255 || alpha < 0 || alpha > 255) {
            throw new IllegalArgumentException("Wartości kolorów muszą być w zakresie 0 - 255");
        }
    }

    Color(int red, int green, int blue) {
        this(red, green, blue, 0);
    }

    @Override
    public int compareTo(Color other) {
        double thisLuminance = 0.2126 * this.red + 0.7152 * this.green + 0.0722 * this.blue;
        double otherLuminance = 0.2126 * other.red + 0.7152 * other.green + 0.0722 * other.blue;
        return Double.compare(thisLuminance, otherLuminance);
    }
}