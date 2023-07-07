package App;

public class Libro extends DatiComuni {
	
	private String autore;
	private String genere;
	
	public Libro ( String _titolo, int _annoPublicazione, int _numeroPagine, String _autore, String _genere) {
		
		super ( _titolo,  _annoPublicazione, _numeroPagine);
		
		this.autore =_autore;
		this.genere =_genere;
		
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", " + super.toString() + "]";
	}



	
	
   
}
