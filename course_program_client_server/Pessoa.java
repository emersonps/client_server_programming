package course_program_client_server;

import java.sql.Date;

public class Pessoa {
	String nome; //vari�veis ou atributos de inst�ncia que ser�o criados a cada nova inst�ncia de Pessoa
	Date nascimento;
	double dinheiroNaCarteira;
	
	public Pessoa(String nome, java.util.Date date) { //Construtor = M�todo sem retorno invocado quando ocorre a cria��o de um objeto
		this.nome = nome;
		this.nascimento = (Date) date;
	}
	
	//M�todos (gastar e adicionar dinheiro na carteira)
	public void gastar(double valor) {
		dinheiroNaCarteira -= valor;
	}
	
	public void receber(double valor) {
		dinheiroNaCarteira =+ valor;
	}
}


