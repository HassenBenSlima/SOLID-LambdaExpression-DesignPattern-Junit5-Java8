package principe_d_ouverture_fermeture_O_C_;

import java.util.logging.Logger;

public class Circle implements Shape {

	// assumes the current class is called Circle
	private final static Logger LOGGER = Logger.getLogger(Circle.class.getName());

	public Circle() {
		LOGGER.info("Circle\n");
	}

	@Override
	public void area() {

	}

	@Override
	public void perimeter() {

	}

}
