package com.hackaton.bigbino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackaton.bigbino.model.Local;
import com.hackaton.bigbino.repository.LocalRepository;

@Service
public class LocalService {

	@Autowired
	private LocalRepository localRepository;

	public List<Local> getAllLocais(){
        return localRepository.findAll();
    }

}