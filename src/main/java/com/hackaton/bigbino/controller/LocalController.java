package com.hackaton.bigbino.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.bigbino.model.Local;
import com.hackaton.bigbino.model.dto.LocalDTO;
import com.hackaton.bigbino.service.LocalService;

@RestController
@RequestMapping("/api/local")
public class LocalController {

	@Autowired
	private LocalService localService;

	@GetMapping
	public ResponseEntity<List<LocalDTO>> getAll(){
        List<Local> locais = localService.getAllLocais();
        List<LocalDTO> locaisDTO = locais.stream().map(LocalDTO::new).collect(Collectors.toList());
        return new ResponseEntity<>(locaisDTO, HttpStatus.OK);
    }


}