package basic.figure1;

class FigureSample {
    public static void main(String[] args) {
        //長方形
        Rectangle r1 = new Rectangle(10,20);
        System.out.println(r1);
        //三角形
        Triangle t1 = new Triangle(15,30);
        System.out.println(t1);
        //円
        Circle c1 = new Circle(5);
        System.out.println(c1);
    }
}
