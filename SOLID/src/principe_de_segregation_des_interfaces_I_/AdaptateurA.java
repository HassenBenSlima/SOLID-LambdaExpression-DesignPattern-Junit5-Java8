package principe_de_segregation_des_interfaces_I_;

import java.util.logging.Logger;

public class AdaptateurA implements InterfaceA {

	// assumes the current class is called Circle
	private final Logger LOGGER = Logger.getLogger(AdaptateurA.class.getName());

	private Service service;

	public AdaptateurA() {

		LOGGER.info("AdaptateurA\n");

	}

	public AdaptateurA(Service service) {
		super();
		this.service = service;
		LOGGER.info("AdaptateurA\n");
	}

	@Override
	public void method1() {
		service.method1();
	}

	@Override
	public void method2() {
		service.method2();
	}

}
