package entidades;

public class Companhia extends PagamentoTaxa{
	
	private Integer NumeroEmpregados;

	public Companhia(String nome, Double rendimentoAnual, int numeroEmpregados) {
		super(nome, rendimentoAnual);
		NumeroEmpregados = numeroEmpregados;
	}

	public int getNumeroEmpregados() {
		return NumeroEmpregados;
	}

	public void setNumeroEmpregados(int numeroEmpregados) {
		NumeroEmpregados = numeroEmpregados;
	}

	@Override
	public Double taxa() {
	
		if(getNumeroEmpregados() > 10) {
			return getRendimentoAnual() * 0.14;
			
		}else {
			return getRendimentoAnual() * 0.16;
		}
		
	}
	
	

}
