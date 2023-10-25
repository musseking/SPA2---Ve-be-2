package Vezbe1;

import java.util.Arrays;
import org.svetovid.Svetovid;

public class Program {
	
	public static void main(String[] args) {
		
		String imeFajla = Svetovid.in.readLine("Unesite ime fajla za citanje:");
		
		Film[] filmovi;
		
		if (Svetovid.testIn(imeFajla)) {
			int brFilmova = Svetovid.in(imeFajla).readInt();
			filmovi = new Film[brFilmova];
			
			for (int i = 0; i < filmovi.length; ++i) {
				int IDFilma = Svetovid.in(imeFajla).readInt();
				String naziv = Svetovid.in(imeFajla).readLine();
				String reditelj = Svetovid.in(imeFajla).readLine();
				
				Film noviFilm = new Film(IDFilma, naziv, reditelj);
				
				filmovi[i] = noviFilm;
			}
		} else {
			Svetovid.out.println("Fajl nije dostupan za citanje");
			return;
		}
		
		Svetovid.out(imeFajla).close();
		
		for(Film f : filmovi) {
			Svetovid.out.println(f);
		}
		
		Arrays.sort(filmovi);
		
		Svetovid.out.println();
		Svetovid.out.println("Sortirani filmovi: ");
		
		for(Film f : filmovi) {
			Svetovid.out.println(f);
		}
		
		Svetovid.out.println();
		
		String noviFajl = Svetovid.in.readLine("Unesite ime fajla u koji upisujete filmove:");
		
		if (Svetovid.testOut(noviFajl)) {
			Svetovid.out(noviFajl).println(filmovi.length);
			
			for(Film f : filmovi) {
				Svetovid.out(noviFajl).println(f);
			}
			
			Svetovid.out.println("Fajl je ispisan");
		} else {
			Svetovid.out.println("U fajl nije moguce pisati");
		}
		
		Svetovid.out(noviFajl).close();
	}
}