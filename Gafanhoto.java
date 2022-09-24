package exerciciofinal;

public class Gafanhoto extends Pessoa{
	

	private String login;
	private int totAssistindo;
	
	public void viuMaisUm(int assistiu) {
		
		this.totAssistindo += assistiu;
		
		}
	
	//Construtor
	public Gafanhoto(String nome, int idade, String sexo, String login, float expeciencia) {
		super(nome, idade, sexo, expeciencia);
		
		this.login = login;
		this.totAssistindo = 0;
		
	}
	
	

	//Métodos Especiais

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistindo() {
		return totAssistindo;
	}

	public void setTotAssistindo(int totAssistindo) {
		this.totAssistindo = totAssistindo;
	}
	

	@Override
	public String toString() {
		return "Gafanhoto {" + super.toString()+"login=" 
	+ login + ", totAssistindo=" + totAssistindo + "}";
	}
	
	
	
	

}
