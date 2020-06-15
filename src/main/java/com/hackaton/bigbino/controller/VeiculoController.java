package com.hackaton.bigbino.controller;

import com.hackaton.bigbino.model.Veiculo;
import com.hackaton.bigbino.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/veiculos")
    public List<Veiculo> getAllVeiculos(){
        return veiculoService.getVeiculos();
    }

    @GetMapping("/veiculo/{id}")
    public Veiculo getVeiculo(@PathVariable("id") Long id){
        return veiculoService.getVeiculo(id);
    }

    @PostMapping("/criarVeiculo")
    public Veiculo saveVeiculo(@RequestBody Veiculo veiculo){
        return veiculoService.criarVeiculo(veiculo);
    }

    @PostMapping("/criarVariosVeiculos")
    public List<Veiculo> criarVariosVeiculos(@RequestBody List<Veiculo> veiculos){
        return veiculoService.criarVeiculosList(veiculos);
    }

    @PutMapping("/atualizarVeiculo/{id}")
    public Veiculo atualiarVeiculo(@RequestBody Veiculo veiculo, Long id){
        return veiculoService.atualizarVeiculo(veiculo, id);
    }

    @DeleteMapping("/removerVeiculo/{id}")
    public void removerVeiculo(@PathVariable Long id){
        veiculoService.removerVeiculo(id);
    }


}
