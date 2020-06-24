package principe_de_segregation_des_interfaces_I_;

import java.util.logging.Logger;

public interface Service {
	// assumes the current class is called Circle
	final Logger LOGGER = Logger.getLogger(Service.class.getName());

	default void method1() {
		LOGGER.info("method1\n");
	}

	default void method2() {
		LOGGER.info("method2\n");
	}

	default void method3() {
		LOGGER.info("method3\n");
	}

	default void method4() {
		LOGGER.info("method4\n");
	}

	default void method5() {
		LOGGER.info("method5\n");
	}

	default void method6() {
		LOGGER.info("method6\n");
	}

}
