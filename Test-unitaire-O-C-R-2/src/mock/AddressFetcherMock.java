package mock;

import main.implem.Address;
import main.inter.AddressFetcher;
// Voici donc enfin notre mock :
public class AddressFetcherMock implements AddressFetcher {

	@Override
	public Address fetchAddress(String name) {
		return new Address("Avenue champs-Elysés", "Mathias Dupond", 5, 75005, "Paris");
	}

}
