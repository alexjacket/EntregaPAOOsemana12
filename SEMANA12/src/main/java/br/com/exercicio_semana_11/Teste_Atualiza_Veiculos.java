package br.com.exercicio_semana_11;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class Teste_Atualiza_Veiculos {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		veiculo.setMarca("Ford");
		veiculo.setModelo("Focus");
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
	}

}
