package Vezbe1;

public class Film implements Comparable<Film>{
	
	private int IDFilma;
	private String naziv;
	private String reditelj;
	
	public Film(int noviIDFilma, String noviNaziv, String noviReditelj) {
		this.IDFilma = noviIDFilma;
		this.naziv = noviNaziv;
		this.reditelj = noviReditelj;
	}
	
	public int getIDFilma() {
		return IDFilma;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public String getReditelj() {
		return reditelj;
	}
	
	public void setIDFilma(int noviIDFilma) {
		this.IDFilma = noviIDFilma;
	}
	
	public void setNaziv(String noviNaziv) {
		this.naziv = noviNaziv;
	}
	
	public void setReditelj(String noviReditelj) {
		this.reditelj = noviReditelj;
	}
	
	@Override
	public String toString() {
		return IDFilma + "\n" + naziv + "\n" + reditelj;
	}
	
	public int compareTo(Film filmZaPoredjenje) {
		return this.getIDFilma() - filmZaPoredjenje.getIDFilma();
	}
}

