package it.prova.hellohumanevolution.model;

public class Sapiens implements Homo{

	private String evolve;
	
	@Override
	public String costruisce() {

		return "L'homo Sapiens costruisce arco e frecce";
	}

	@Override
	public String caccia() {

		return "L'homo Sapiens caccia un mammut";
	}

	@Override
	public String cuoce() {

		return "L'homo Sapiens cuoce il mammut";
	}

	@Override
	public String sopravvive() {

		return "L'homo Sapiens sopravvive fino ai giorni nostri";
	}


	public Sapiens() {

	}

	public Sapiens(String evolve) {
		
		this.evolve = evolve; 
	}
	
	public String getEvolve() {
		
		return evolve; 
	}
	
	public void setEvolve(String evolve) {
		
		this.evolve = evolve; 
	}
}
