package it.prova.hellohumanevolution.model;

public class Erectus implements Homo {

	private String cammina;

	@Override
	public String costruisce() {

		return "L'homo Erectus costruisce una fionda";
	}

	@Override
	public String caccia() {
		return "L'homo Erectus caccia un coniglio";
	}

	@Override
	public String cuoce() {
		return "L'homo Erectus cuoce il coniglio";
	}

	@Override
	public String sopravvive() {

		return "L'homo Erectus sopravvive alla giornata";
	}

	public Erectus() {

	}

	public Erectus(String cammina) {
		
		this.cammina = cammina; 
	}
	
	public String getCammina() {
		
		return cammina; 
	}
	
	public void setCammina(String cammina) {
		
		this.cammina = cammina; 
	}

}
