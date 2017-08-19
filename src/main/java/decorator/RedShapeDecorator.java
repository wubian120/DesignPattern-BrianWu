package decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape originShape){
        super(originShape);
    }

    @Override
    public void draw() {

        decoratedShape.draw();
        setRedBorder(decoratedShape);
//        System.out.println("this is the Red Shape");

    }

    private void setRedBorder(Shape shape){
        System.out.println("set red border..");
    }
}
