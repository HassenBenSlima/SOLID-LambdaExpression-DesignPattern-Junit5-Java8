package main.inter;

import main.implem.Address;

//Et pour la seconde qui les affiche :
public interface AddressFetcher {

	Address fetchAddress(String name);
}
