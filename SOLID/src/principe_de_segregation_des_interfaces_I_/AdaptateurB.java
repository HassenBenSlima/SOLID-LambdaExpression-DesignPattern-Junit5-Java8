package principe_de_segregation_des_interfaces_I_;

import java.util.logging.Logger;

public class AdaptateurB implements InterfaceB {

	// assumes the current class is called Circle
	private final Logger LOGGER = Logger.getLogger(AdaptateurB.class.getName());

	private Service service;

	public AdaptateurB() {
		LOGGER.info("AdaptateurB\n");

	}

	public AdaptateurB(Service service) {
		super();
		this.service = service;
		LOGGER.info("AdaptateurB\n");
	}

	@Override
	public void method3() {
		service.method3();
	}

	@Override
	public void method4() {
		service.method4();
	}

}
