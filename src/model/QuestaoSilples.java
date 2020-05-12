package model;

public class QuestaoSilples {
	protected String enunciado;
	protected String resposta;
	
	public QuestaoSilples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Q: "+enunciado;
	}
	
	public boolean corrigir(String respUser) {
		return this.resposta.equals(respUser);
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
