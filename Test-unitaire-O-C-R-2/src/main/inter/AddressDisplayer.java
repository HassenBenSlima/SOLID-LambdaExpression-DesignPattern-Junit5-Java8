package main.inter;

//La première pour la classe qui va retrouver les adresses :
public interface AddressDisplayer {

	String displayAddress(String name);

	void setAddressFetcher(AddressFetcher af);

}
