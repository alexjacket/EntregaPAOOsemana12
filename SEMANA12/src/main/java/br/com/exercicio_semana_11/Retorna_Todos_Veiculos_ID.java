package br.com.exercicio_semana_11;

import javax.persistence.EntityManager;

import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class Retorna_Todos_Veiculos_ID {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		Veiculo veiculo = manager.find(Veiculo.class, 2L);
		
		System.out.println(veiculo);
		
		manager.close();
		JPAUtil.close();
		
	}

}
