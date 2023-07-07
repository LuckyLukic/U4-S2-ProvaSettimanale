package App;

public class DatiComuni {
	
	private int isbn;
	private String titolo;
	private int annoPublicazione;
	private int numeroPagine;
	
	public DatiComuni (int _isbn, String _titolo, int _annoPublicazione, int _numeroPagine) {
		
		this.setIsbn(_isbn);
		this.setTitolo(_titolo);
		this.setAnnoPublicazione(_annoPublicazione);
		this.setNumeroPagine(_numeroPagine);
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

}
