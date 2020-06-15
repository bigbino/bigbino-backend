package com.hackaton.bigbino.repository;

import com.hackaton.bigbino.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Veiculorepository extends JpaRepository<Veiculo, Long> {
}
