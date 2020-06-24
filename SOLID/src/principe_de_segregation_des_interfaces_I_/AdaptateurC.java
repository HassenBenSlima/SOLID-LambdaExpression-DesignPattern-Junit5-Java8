package principe_de_segregation_des_interfaces_I_;

import java.util.logging.Logger;

public class AdaptateurC implements InterfaceC {

	// assumes the current class is called Circle
	private final Logger LOGGER = Logger.getLogger(AdaptateurC.class.getName());

	private Service service;

	public AdaptateurC() {
		LOGGER.info("AdaptateurC\n");
	}

	public AdaptateurC(Service service) {
		super();
		this.service = service;
		LOGGER.info("AdaptateurC\n");
	}

	@Override
	public void method5() {
		service.method5();
	}

	@Override
	public void method6() {
		service.method6();
	}

}
