package br.com.impacta.javaweb.despesas.dao;


import static br.com.impacta.javaweb.despesas.model.CategoriaDespesa.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.javaweb.despesas.model.Despesa;


public class DAODespesa {
	
	public List<Despesa> getDespesas(){
		
		List<Despesa> despesas = new ArrayList<Despesa>();
		
		despesas.add(new Despesa("Restaurante", ALIMENTACAO, LocalDate.now(), 89.95 ));
		despesas.add(new Despesa("Corte de Cabelo", CUIDADOS_PESSOAIS, LocalDate.now(), 45));
		despesas.add(new Despesa("Combustivel", VEICULO, LocalDate.now(), 80));
		despesas.add(new Despesa("T�nis", VESTUARIO, LocalDate.now(), 237));
		despesas.add(new Despesa("Almo�o", ALIMENTACAO, LocalDate.now(), 30));
		despesas.add(new Despesa("Conta de Energia", MORADIA, LocalDate.now(), 170));
		despesas.add(new Despesa("Pagamento da P�s", EDUCACAO, LocalDate.now(), 850));
		despesas.add(new Despesa("Plano de Sa�de", SAUDE, LocalDate.now(), 360));
		
		return despesas;

	}

}
