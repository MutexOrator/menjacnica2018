package menjacnica.interfejs;

import java.util.LinkedList;

import menjacnica.Valuta;

public interface MenjacnicaInterfacePretrazivanje {
	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos);
	public LinkedList<Valuta> vratiKursnuListu();
	public void ucitajIzFajla(String putanja);
}
