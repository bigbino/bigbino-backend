package com.hackaton.bigbino.controller;

import com.hackaton.bigbino.model.Caminhoneiro;
import com.hackaton.bigbino.repository.CaminhoneiroRepository;
import com.hackaton.bigbino.service.CaminhoneiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CaminhoneiroController {

    @Autowired
    private CaminhoneiroService caminhoneiroService;

    @GetMapping(value = "/caminhoneiros")
    public List<Caminhoneiro> getAll(){
        return caminhoneiroService.getAllCaminhoneiros();
    }

    @GetMapping(value = "/caminhoneiro/{id}")
    public Caminhoneiro getCaminhoneiroById(@PathVariable(value = "id") long id) throws Exception {
        return caminhoneiroService.getCaminhoneiroID(id);
    }

    @PostMapping("/criarCaminhoneiro")
    public Caminhoneiro saveCaminhoneiro(@RequestBody Caminhoneiro caminhoneiro){
        return caminhoneiroService.criarCaminhoneiro(caminhoneiro);
    }

    @PostMapping("/salvarVariosCaminhoneiros")
    public List<Caminhoneiro> saveVariosCaminhoneiros(@RequestBody List<Caminhoneiro> caminhoneiros){
        return caminhoneiroService.criarCaminhoneirosList(caminhoneiros);
    }

    @PutMapping("/atualizarCaminhoneiro/{id}")
    public Caminhoneiro atualizarCaminhoneiro(@RequestBody Caminhoneiro caminhoneiro, @PathVariable(value = "id") Long id){
        return caminhoneiroService.atualizarCaminhoneiro(caminhoneiro, id);
    }

    @DeleteMapping("/removerCaminhoneiro/{id}")
    public void removerCaminhoneiro(@PathVariable Long id){
        caminhoneiroService.removerCaminhoneiro(id);
    }


}
