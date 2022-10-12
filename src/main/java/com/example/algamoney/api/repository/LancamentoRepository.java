package com.example.algamoney.api.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

	public void save(Optional<Lancamento> lancamentoSalva);


	
}
