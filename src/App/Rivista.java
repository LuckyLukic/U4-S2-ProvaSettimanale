package App;

public class Rivista extends DatiComuni{
	
	private Enum<Periodicita> periodicita;
	
	public Rivista (int _isbn, String _titolo, int _annoPublicazione, int _numeroPagine, Enum<Periodicita> _periodicita) {
		
		super(_isbn, _titolo, _annoPublicazione, _numeroPagine);
		
		this.periodicita = _periodicita;
		
	}

	public Enum<Periodicita> getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Enum<Periodicita> periodicita) {
		this.periodicita = periodicita;
	} 

}
