public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.render();

        Circle circle = new Circle();
        circle.render();

        Polygon squarePoly = new Square();
        squarePoly.render();

        Polygon circlePoly = new Circle();
        circlePoly.render();

    }
}
