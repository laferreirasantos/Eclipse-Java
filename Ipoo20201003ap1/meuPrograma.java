package Ipoo20201003ap1;

public class meuPrograma {

	public static void main(String[] args) {
		
		Contrato C = new Contrato();
		System.out.println("*-------- FORMUL�RIO DE CONTRATO ---------*");
		C.nome = "LARISSA FERREIRA";
		C.cpf = "02050280533";
		C.titula��o = "ALUNO";
		C.periodo = "NOITE";
		C.curso = "ANALISE E DESENVOLVIMENTO DE SISTEMA";
		C.id = 2020121507;
		
		System.out.println("NOME COMPLETO: " + C.nome);
		System.out.println("CAMPO CPF: " + C.cpf);
		System.out.println("TITULA��O: " + C.titula��o);
		System.out.println("PER�ODO DO CURSO: " + C.periodo);
		System.out.println("NOME DO CURSO: " + C.curso);
		System.out.println("C�DIGO DE IDENTIFICA��O: " + C.id);
		
		
		System.out.println("*------- FORMUL�RIO DO ALUNO ----------*");	
		System.out.println("NOME COMPLETO: " + C.nome);
		System.out.println("CAMPO CPF: " + C.cpf);
		System.out.println("TITULA��O: " + C.titula��o);
		System.out.println("PER�ODO DO CURSO: " + C.periodo);
		System.out.println("NOME DO CURSO: " + C.curso);
		System.out.println("C�DIGO DE IDENTIFICA��O: " + C.id);
	
		Aluno A = new Aluno();
		A.setMatricula("2020121314");
		System.out.println("MATRICULA:" + A.getMatricula());
		
		A.setResponsavelFinanceiro("maria(m�e)");
		System.out.println("NOME DO RESPONSAVEL FINANCEIRO:" + A.getResponsavelFinanceiro());
		
		A.setSituacaoDeMatricula("FORMADO");
		System.out.println("SITUA��O DE MATRICULA:" + A.getSituacaoDeMatricula());
		
		
		System.out.println("*---------- FORMULARIO PROFESSOR -----------*");
		System.out.println("NOME COMPLETO: " + C.nome);
		System.out.println("CAMPO CPF: " + C.cpf);
		System.out.println("TITULA��O: " + C.titula��o);
		System.out.println("PER�ODO DO CURSO: " + C.periodo);
		System.out.println("NOME DO CURSO: " + C.curso);
		System.out.println("C�DIGO DE IDENTIFICA��O: " + C.id);
		
		Professor P = new Professor();
		P.setAtividadeExtra("DISCIPLINA EAD");
		P.setTurma("ADS");
		P.setDiploma("DOUTORADO");
		System.out.println("ATIVIDADE EXTRA:" + P.getAtividadeExtra());
		System.out.println("TURMA:" + P.getTurma());
		System.out.println("CERTIFICA��O:" + P.getDiploma());
		
		
		System.out.println("*---------- FORMUL�RIO PROCESSO SELETIVO -----------*");
		System.out.println("NOME COMPLETO: " + C.nome);
		System.out.println("CAMPO CPF: " + C.cpf);
		System.out.println("TITULA��O: " + C.titula��o);
		System.out.println("PER�ODO DO CURSO: " + C.periodo);
		System.out.println("NOME DO CURSO: " + C.curso);
		System.out.println("C�DIGO DE IDENTIFICA��O: " + C.id);
		
		processoSeletivo PS = new processoSeletivo();
		PS.setDataVestibular(13.10);
		PS.setNota(10);
		PS.setResultado("APROVADO");
		System.out.println("DATA DO VESTIBULAR:" + PS.getDataVestibular());
		System.out.println("NOTA DA PROVA:" + PS.getNota());
		System.out.println("RESULTADO FINAL:" + PS.getResultado());
	
		
	}

}
