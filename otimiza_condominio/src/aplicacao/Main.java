package aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import entidade.Agendamento;
import entidade.Churrasqueira;
import entidade.Condomino;
import entidade.Salao_de_festas;

public class Main {

	public static void main(String[] args) {
		
		Connection conecta = null; 

		try { 

		conecta = DriverManager.getConnection("jdbc:mysql://localhost/otimiza_condominio?" +"user=root&password=060989"); 

		System.out.println("Conexão realizada com sucesso."); 
		
		} catch (SQLException ex) { 

		     System.out.println("SQLException: " + ex.getMessage()); 
		     
		    System.out.println("SQLState: " + ex.getSQLState()); 

		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	
		Condomino cond = new Condomino();
			Scanner ler = new Scanner(System.in);
		
		
	System.out.println("Digite seu cpf:");
	long cpf = ler.nextLong();
	System.out.println("\nDigite seu nome:");
	String nome = new Scanner(System.in).nextLine();
	System.out.println("\nDigite seu numero de telefone:");
	long telefone = ler.nextLong();
	System.out.println("\nDigite o numero do seu apartamento:");
	int num_ap = ler.nextInt();
	System.out.println("\nDigite o numero do seu bloco:");
	int num_bloco = ler.nextInt();
	
	int op;
	System.out.println("\nVoce deseja reservar churrasqueira opcao(1) ou salao de festas opcao (2)? Digite a opcao escolhida:");
	op = ler.nextInt();
	String data2; 
	int horario;
	switch(op) {
	
	case 1:
		System.out.println("\nDigite o codigo da churrasqueira desejada:");
		int chu = ler.nextInt();
		Churrasqueira chur = new Churrasqueira(chu);
		System.out.println("\nDigite a data desejada:");
		data2 = new Scanner(System.in).nextLine();
		System.out.println("\nDigite o horario desejado:");
		horario = ler.nextInt();
		Agendamento agendC = new Agendamento(data2, horario, chur);
		
		System.out.println("A churrasqueira " + agendC.ConsultaChurrasqueira() + " esta reservada no dia:"+ 
		agendC.getData() +" as:" + agendC.getHorario() +" horas, para o morador do apartamento numero: "+ num_ap);
		break;
	case 2: 
		System.out.println("\nDigite o codigo do salao de festas desejado:");
		int sala = ler.nextInt();
		Salao_de_festas salao = new Salao_de_festas(sala);
		System.out.println("\nDigite a data desejada:");
		data2 = new Scanner(System.in).nextLine();
		System.out.println("\nDigite o horario desejado:");
		horario = ler.nextInt();
		Agendamento agend = new Agendamento(data2, horario, salao);
	
		break;
	default:
		System.out.println("Informacao incorreta");
		
	}
	

 
	
	
	
	
	
	}

	
}
