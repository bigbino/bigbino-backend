package com.hackaton.bigbino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackaton.bigbino.model.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {

}
