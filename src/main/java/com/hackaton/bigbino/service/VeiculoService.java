package com.hackaton.bigbino.service;

import com.hackaton.bigbino.exceptions.VeiculoNotFoundException;
import com.hackaton.bigbino.model.Caminhoneiro;
import com.hackaton.bigbino.model.Veiculo;
import com.hackaton.bigbino.repository.Veiculorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private Veiculorepository veiculorepository;

    public Veiculo criarVeiculo(Veiculo veiculo){
        return veiculorepository.save(veiculo);
    }

    public List<Veiculo> criarVeiculosList(List<Veiculo> veiculos){
        return veiculorepository.saveAll(veiculos);
    }

    public List<Veiculo> getVeiculos(){
        return veiculorepository.findAll();
    }

    public Veiculo getVeiculo(Long id){
        return veiculorepository.findById(id)
                .orElseThrow(() -> new VeiculoNotFoundException(id)
        );
    }

    public Veiculo atualizarVeiculo(Veiculo newVeiculo, Long id) {
        return veiculorepository.findById(id)
            .map(veiculo -> {
                veiculo.setPlaca(newVeiculo.getPlaca());
                veiculo.setModelo(newVeiculo.getModelo());
                veiculo.setChassi(newVeiculo.getChassi());
                veiculo.setComprimento(newVeiculo.getComprimento());
                veiculo.setLargura(newVeiculo.getLargura());
                veiculo.setQtdEixos(newVeiculo.getQtdEixos());
                return veiculorepository.save(veiculo);
            })
            .orElseGet(() -> {
                newVeiculo.setId(id);
                return veiculorepository.save(newVeiculo);
            });

    }

    public void removerVeiculo(Long id){
        veiculorepository.deleteById(id);
    }

}
