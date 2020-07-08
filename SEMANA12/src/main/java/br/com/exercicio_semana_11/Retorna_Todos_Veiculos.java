package br.com.exercicio_semana_11;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class Retorna_Todos_Veiculos {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		Query query = manager.createQuery("from Veiculo");
		
		List<Veiculo> veiculos = query.getResultList();
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo);
		}
		
		manager.close();
		JPAUtil.close();

	}

}
