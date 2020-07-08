package br.com.exercicio_semana_11;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class Teste_Cria_Veiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Wolksvagen");
		veiculo.setModelo("Fox");
		veiculo.setAno("2007");
		
		manager.persist(veiculo);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
