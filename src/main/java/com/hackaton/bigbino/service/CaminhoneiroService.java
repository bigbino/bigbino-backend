package com.hackaton.bigbino.service;

import com.hackaton.bigbino.exceptions.CaminhoneiroNotFoundException;
import com.hackaton.bigbino.model.Caminhoneiro;
import com.hackaton.bigbino.repository.CaminhoneiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaminhoneiroService {

    @Autowired
    private CaminhoneiroRepository caminhoneiroRepository;

    public List<Caminhoneiro> getAllCaminhoneiros(){
        return caminhoneiroRepository.findAll();
    }

    public Caminhoneiro getCaminhoneiroID(Long id) {
        return caminhoneiroRepository.findById(id)
                .orElseThrow(() -> new CaminhoneiroNotFoundException(id));
    }

    public Caminhoneiro criarCaminhoneiro(Caminhoneiro caminhoneiro){
        return caminhoneiroRepository.save(caminhoneiro);
    }

    public List<Caminhoneiro> criarCaminhoneirosList(List<Caminhoneiro> caminhoneiros){
        return caminhoneiroRepository.saveAll(caminhoneiros);
    }

    public Caminhoneiro atualizarCaminhoneiro(Caminhoneiro newCaminhoneiro, Long id) {
        return caminhoneiroRepository.findById(id)
                .map(caminhoneiro -> {
                    caminhoneiro.setNome(newCaminhoneiro.getNome());
                    caminhoneiro.setSobrenome(newCaminhoneiro.getSobrenome());
                    caminhoneiro.setUsuario(newCaminhoneiro.getUsuario());
                    caminhoneiro.setPassword(newCaminhoneiro.getPassword());
                    return caminhoneiroRepository.save(caminhoneiro);
                })
                .orElseGet(() -> {
                    newCaminhoneiro.setId(id);
                    return caminhoneiroRepository.save(newCaminhoneiro);
        });

    }

    public void removerCaminhoneiro(Long id) {
        caminhoneiroRepository.deleteById(id);
    }
}
