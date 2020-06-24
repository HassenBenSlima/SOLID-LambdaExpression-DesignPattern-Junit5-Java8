package main.implem;

import main.inter.AddressDisplayer;
import main.inter.AddressFetcher;

// L'afficheur d'adresse, un code très simple 
public class AddressDisplayerImpl implements AddressDisplayer {

	private AddressFetcher addressFetcher;

	@Override
	public String displayAddress(String name) {
		Address a = addressFetcher.fetchAddress(name);
		String address = a.getName() + "\n";
		address += a.getNb() + " " + a.getStreet() + "\n";
		address += a.getZip() + " " + a.getTown();
		return address;
	}

	@Override
	public void setAddressFetcher(AddressFetcher af) {
		this.addressFetcher = af;
	}

}
