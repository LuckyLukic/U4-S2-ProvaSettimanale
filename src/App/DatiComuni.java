package App;

import java.util.Random;

public class DatiComuni {
	
	Random random = new Random();
	
	
	private long randomisbn = 1_000_000_000l + new Random().nextLong(9_000_000_000l);
	private String titolo;
	private int annoPublicazione;
	private int numeroPagine;
	
	public DatiComuni (String _titolo, int _annoPublicazione, int _numeroPagine) {
		
		
		this.titolo = _titolo;
		this.annoPublicazione = _annoPublicazione;
		this.numeroPagine = _numeroPagine;
		
	}


	public int getAnnoPublicazione() {
		return annoPublicazione;
	}

	public void setAnnoPublicazione(int annoPublicazione) {
		this.annoPublicazione = annoPublicazione;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public long getRandomisbn() {
		return randomisbn;
	}

	public void setRandomisbn(long randomisbn) {
		this.randomisbn = randomisbn;
	}


	@Override
	public String toString() {
		return "DatiComuni [randomisbn=" + randomisbn + ", titolo=" + titolo + ", annoPublicazione=" + annoPublicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
	

}
