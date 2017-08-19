package decorator;

public class DecoratorDemo {

    public static void main(String[] args){

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRetangle = new RedShapeDecorator(new Retangle());

        System.out.println("....");
        circle.draw();

        System.out.println("...decorator...");

        redCircle.draw();
        redRetangle.draw();

        System.out.println(" end ");


    }

}
