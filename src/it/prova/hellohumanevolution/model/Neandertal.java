package it.prova.hellohumanevolution.model;

public class Neandertal implements Homo{

	private String estingue;
	
	@Override
	public String costruisce() {

		return "L'homo di Neandertal costruisce una lancia";
	}

	@Override
	public String caccia() {

		return "L'homo di Neandertal caccia un cervo";
	}

	@Override
	public String cuoce() {

		return "L'homo di Neandertal cuoce il cervo";
	}

	@Override
	public String sopravvive() {

		return "L'homo di Neandertal si estingue";
	}


	public Neandertal() {

	}

	public Neandertal(String estingue) {
		
		this.estingue = estingue; 
	}
	
	public String getEstingue() {
		
		return estingue; 
	}
	
	public void setEstingue(String estingue) {
		
		this.estingue = estingue; 
	}
}
