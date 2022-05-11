import decorator.RedShapeDecorator;
import formas.Circle;
import formas.Star;
import interfaces.Shape;

public class UsaShape {

	public static void main(String[] args) {
		/*Circle circulo = new Circle();
		circulo.draw();*/
		
		/*RedShapeDecorator redShape  = 
				new RedShapeDecorator(new Circle());
		redShape.draw();*/
		
		RedShapeDecorator estrela  = 
				new RedShapeDecorator(new Star());
		estrela.draw();
		
		

	}

}
