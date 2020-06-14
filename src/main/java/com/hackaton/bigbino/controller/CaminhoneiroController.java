package com.hackaton.bigbino.controller;

import com.hackaton.bigbino.model.Caminhoneiro;
import com.hackaton.bigbino.repository.CaminhoneiroRepository;
import com.hackaton.bigbino.service.CaminhoneiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaminhoneiroController {

    @Autowired
    private CaminhoneiroService caminhoneiroService;

    @Autowired
    private CaminhoneiroRepository caminhoneiroRepository;

    @GetMapping(value = "/caminhoneiros")
    public List<Caminhoneiro> getAll(){
        return caminhoneiroService.getAllCaminhoneiros();
    }

    @GetMapping(value = "/caminhoneiro/{id}")
    public ResponseEntity<Caminhoneiro> getCaminhoneiroById(@PathVariable(value = "id") long id) throws Exception {
        return ResponseEntity.ok().body(caminhoneiroService.getCaminhoneiroID(id));
    }

    @PostMapping("/criarCaminhoneiro")
    public Caminhoneiro saveCaminhoneiro(@RequestBody Caminhoneiro caminhoneiro){
        return caminhoneiroService.criarCaminhoneiro(caminhoneiro);
    }

}
