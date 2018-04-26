package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfacePretrazivanje;
import menjacnica.sistemskeoperacije.SOIzvrsiTransakciju;
import menjacnica.sistemskeoperacije.SOUcitajIzFajla;

public class MenjacnicaPretrazivanje implements MenjacnicaInterfacePretrazivanje{
	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	@Override
	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos) {
		return SOIzvrsiTransakciju.izvrsi(valuta, prodaja, iznos);
	}
	@Override
	public LinkedList<Valuta> vratiKursnuListu() {
		return kursnaLista;
	}

	@Override
	public void ucitajIzFajla(String putanja) {
		kursnaLista = SOUcitajIzFajla.izvrsi(putanja);
	}
}
