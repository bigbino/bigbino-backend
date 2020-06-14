package com.hackaton.bigbino.service;

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

    public Caminhoneiro getCaminhoneiroID(Long id) throws Exception {
        if (id != null){
            return caminhoneiroRepository.getOne(id);
        } else {
            throw new Exception("Not found");
        }
    }
}
