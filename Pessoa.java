package exerciciofinal;

public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float expeciencia;
	
	
		
	public Pessoa(String nome, int idade, String sexo, float expeciencia) {
		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.expeciencia = 0;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public float getExpeciencia() {
		return expeciencia;
	}






	public void setExpeciencia(float expeciencia) {
		this.expeciencia = expeciencia;
	}






	protected void ganharExp(float xp) {
		
		this.expeciencia += xp;
		
	}



	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade +
				", sexo=" + sexo + ", expeciencia=" + expeciencia + "]";
	}
	
	
	

}
