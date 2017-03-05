package Domain;

import java.util.ArrayList;

public class Station {
	
	private int capaciteit;
	private String naam, stad;
	private boolean isBusstaion, isTreinstation;
public static ArrayList<Station> stations = new ArrayList<Station>();

public Station(){
	
}

public int getCapaciteit() {
	return capaciteit;
}

public void setCapaciteit(int capaciteit) {
	this.capaciteit = capaciteit;
}

public String getStad() {
	return stad;
}

public void setStad(String stad) {
	this.stad = stad;
}

public String getNaam() {
	return naam;
}

public void setNaam(String naam) {
	this.naam = naam;
}

public boolean isBusstaion() {
	return isBusstaion;
}

public void setBusstaion(boolean isBusstaion) {
	this.isBusstaion = isBusstaion;
}

public boolean isTreinstation() {
	return isTreinstation;
}

public void setTreinstation(boolean isTreinstation) {
	this.isTreinstation = isTreinstation;
}

}
