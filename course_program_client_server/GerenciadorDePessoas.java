package course_program_client_server;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GerenciadorDePessoas {  
  public static void main(String args[]) throws ParseException {  
    // Cria uma classe que formata datas.   
    // � capaz de formatar de String para uma   
    // Date e de um Date para um String.  
    SimpleDateFormat formatador =   
        new SimpleDateFormat("dd/MM/yyyy");  
    
    // Cria um Objeto de Pessoa.  
    Pessoa pVitor;  
    pVitor = new Pessoa("Vitor Fernando Pamplona",  
        formatador.parse("07/11/1983"));   
      
    // Vitor Recebeu 1000 reais  
    // Inclui R$ 1000 na carteira da   
    // pessoa p criada na linha anterior  
    pVitor.receber(1000.00);   
      
    // Cria um outro objeto de pessoa, o Jo�o  
    Pessoa pJo�o;
    pJo�o = new Pessoa("Jo�o da Silva",
		formatador.parse("18/02/1970"));   
      
    // Jo�o recebeu R$ 500 e gastou R$ 100  
    pJo�o.receber(500.00);  
    pJo�o.gastar(100.00);  
  }  
}  

