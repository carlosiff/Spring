package com.algaworks.gestaofesta.form;

public class TabuadaForm {
	
	private Float n1;
	private Float n2;
	
	public TabuadaForm(){
		this.n1=(float) 0;
		this.n2=(float) 0;
	}
	public Float getN1() {
		return n1;
	}
	public void setN1(Float n1) {
		this.n1 = n1;
	}
	public Float getN2() {
		return n2;
	}
	public void setN2(Float n2) {
		this.n2 = n2;
	}
	
	public Float soma(){
		return this.n1+this.n2;
	}

}
