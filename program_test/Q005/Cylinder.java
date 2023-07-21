public class Cylinder extends Circle {
    int height;

    Cylinder(int hankei, int height) {
        super(hankei);
        this.height = height;
    }

    double getVolume() {
        return hankei * hankei * PI * height;
    }
}