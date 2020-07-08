package br.com.exercicio_semana_11;

import javax.persistence.Persistence;

public class Teste_Cria_Tabelas {
	
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("exercicioJPA");
		
	}

}
