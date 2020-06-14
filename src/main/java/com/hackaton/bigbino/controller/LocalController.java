package com.hackaton.bigbino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.bigbino.model.Local;
import com.hackaton.bigbino.service.LocalService;

@RestController
@RequestMapping("/api/local")
public class LocalController {

	@Autowired
	private LocalService localService;

	@GetMapping
	public List<Local> getAll(){
        return localService.getAllLocais();
    }


}