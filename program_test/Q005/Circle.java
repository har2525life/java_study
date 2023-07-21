public class Circle{
    final double PI = 3.14;
    int hankei;

    Circle(int hankei) {
        this.hankei = hankei;
    }

    double getArea() {
        return hankei * hankei * this.PI;
    }
}