package main.inter;

//La premi�re pour la classe qui va retrouver les adresses :
public interface AddressDisplayer {

	String displayAddress(String name);

	void setAddressFetcher(AddressFetcher af);

}
