package Ipoo20201003ap1;

//subClasse
public class Aluno extends Contrato {
	private String matricula;
	private String responsavelFinanceiro;
	private String situacaoDeMatricula;

	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getResponsavelFinanceiro() {
		return responsavelFinanceiro;
	}
	public void setResponsavelFinanceiro(String responsavelFinanceiro) {
		this.responsavelFinanceiro = responsavelFinanceiro;
	}
	
	public String getSituacaoDeMatricula() {
		return situacaoDeMatricula;
	}
	public void setSituacaoDeMatricula(String situacaoDeMatricula) {
		this.situacaoDeMatricula = situacaoDeMatricula;
	}
	
}
