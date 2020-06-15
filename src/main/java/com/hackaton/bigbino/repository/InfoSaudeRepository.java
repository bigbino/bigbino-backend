package com.hackaton.bigbino.repository;

import com.hackaton.bigbino.model.Infosaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoSaudeRepository extends JpaRepository<Infosaude, Long> {
}
