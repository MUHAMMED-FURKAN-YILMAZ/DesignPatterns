package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        // shape fabrikasi olusturalim
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // circle objesi olusturuldu
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // circle objesi olusturuldu
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();


        // color fabrikasi olusturalim
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // red objesi olusturalim
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        // Blur objesi olusturalim
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
    }
}
