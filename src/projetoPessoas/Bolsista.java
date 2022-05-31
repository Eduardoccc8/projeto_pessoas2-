package projetoPessoas;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void RenovarBolsa() {
		System.out.println("renovando bolsa de: " + this.nome);
		
	}
	  @Override
	public void pagarMensalidade() {
		  System.out.println(this.nome + "  É bolsista!!!pagamento facilitado");
		
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	  

}
