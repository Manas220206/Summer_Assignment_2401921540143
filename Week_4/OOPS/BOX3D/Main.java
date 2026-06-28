public class Main {

    public static void main(String[] args) {

        Box b = new Box(10, 5);
        System.out.println("Area = " + b.area());

        Box3D b3 = new Box3D(10, 5, 8);
        System.out.println("Area = " + b3.area());
        System.out.println("Volume = " + b3.volume());

    }

}