package principe_d_ouverture_fermeture_O_C_;

import java.util.logging.Logger;

public class Geometry {

	private Shape shape;
	// assumes the current class is called Circle
	private final static Logger LOGGER = Logger.getLogger(Geometry.class.getName());

	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape
	 *            the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Geometry() {
	}

	void area() {
		shape.area();
		LOGGER.info("area\n");
	}

	void perimeter() {
		shape.perimeter();
		LOGGER.info("perimeter\n");
	}
}