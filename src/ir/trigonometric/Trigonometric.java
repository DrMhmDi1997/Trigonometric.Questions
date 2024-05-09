package ir.trigonometric;

public class Trigonometric {

    public static void main(String[] args) {

        double angleDegrees = 270;

        double angleRadians = Math.toRadians(angleDegrees);

        System.out.println(Math.sin(angleRadians));
        System.out.println(Math.cos(angleRadians));
        System.out.println(Math.tan(angleRadians));


        double Radian = 76;

        double AngleRadian = Math.toDegrees(Radian);

        System.out.println(Math.sin(AngleRadian));
        System.out.println(Math.cos(AngleRadian));
    }
}
