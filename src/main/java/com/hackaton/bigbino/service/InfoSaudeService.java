package com.hackaton.bigbino.service;

import com.hackaton.bigbino.model.Infosaude;
import com.hackaton.bigbino.repository.InfoSaudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoSaudeService {

    @Autowired
    private InfoSaudeRepository infoSaudeRepository;

    public List<Infosaude> getAllInfoSaude() {
        return infoSaudeRepository.findAll();
    }
}
