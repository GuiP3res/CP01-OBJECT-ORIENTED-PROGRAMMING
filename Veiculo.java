package br.com.fiapride.model;

public class Veiculo {
	
	private String individuo;
	private String pl;
	private double gas;
	
	public Veiculo(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	public void adicionargas(double valor) {
		if (valor > 0) {
			gas += valor;
			
		}
	}
	public void gastargas(double valor) {
		if (valor > 0 && valor <= gas) {
			gas -= valor;
		}
	}
	public String getIndividuo() {
		return individuo;
	}
	public void setindIviduo(String individuo) {
		this.individuo = individuo;
	}
	public String getPl() {
		return pl;
	}
	public void setPl(String pl) {
		this.pl = pl;
	}
	public double getGas() {
		return gas;
	}
	public void setGas(double gas) {
		if (gas >= 0) {
			this.gas = gas;
		}
	}
}
