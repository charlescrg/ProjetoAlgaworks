package com.example.algamoney.api.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.algamoney.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	public void save(Optional<Lancamento> lancamentoSalva);


	
}
