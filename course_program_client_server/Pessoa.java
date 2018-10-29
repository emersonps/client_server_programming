package course_program_client_server;

import java.sql.Date;

public class Pessoa {
	String nome; //variáveis ou atributos de instância que serão criados a cada nova instância de Pessoa
	Date nascimento;
	double dinheiroNaCarteira;
	
	public Pessoa(String nome, java.util.Date date) { //Construtor = Método sem retorno invocado quando ocorre a criação de um objeto
		this.nome = nome;
		this.nascimento = (Date) date;
	}
	
	//Métodos (gastar e adicionar dinheiro na carteira)
	public void gastar(double valor) {
		dinheiroNaCarteira -= valor;
	}
	
	public void receber(double valor) {
		dinheiroNaCarteira =+ valor;
	}
}


