package com.hackaton.bigbino.controller;

import com.hackaton.bigbino.model.Caminhoneiro;
import com.hackaton.bigbino.repository.CaminhoneiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CaminhoneiroController {

    @Autowired
    private CaminhoneiroRepository caminhoneiroRepository;

    @GetMapping(value = "/caminhoneiros")
    public List<Caminhoneiro> getAll(){
        return caminhoneiroRepository.findAll();
    }

}
