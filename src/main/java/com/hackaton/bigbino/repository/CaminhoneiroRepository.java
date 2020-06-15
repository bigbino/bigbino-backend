package com.hackaton.bigbino.repository;

import com.hackaton.bigbino.model.Caminhoneiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaminhoneiroRepository extends JpaRepository<Caminhoneiro, Long> {
}
