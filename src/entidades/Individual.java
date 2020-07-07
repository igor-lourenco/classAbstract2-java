package entidades;

public class Individual extends PagamentoTaxa {

	private Double gastoSaude;
	
	

	public Individual(String nome, Double rendimentoAnual, Double gastoSaude) {
		super(nome, rendimentoAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double taxa() {
		
		if(getRendimentoAnual() < 20000.0) {
			return getRendimentoAnual() * 0.15 - gastoSaude * 0.5;
			
		}else {
			return getRendimentoAnual() * 0.25 - gastoSaude * 0.5;
		}
		
	}
	
	

}
