package com.hackaton.bigbino.controller;

import com.hackaton.bigbino.model.Infosaude;
import com.hackaton.bigbino.service.InfoSaudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InfoSaudeController {

    @Autowired
    private InfoSaudeService infoSaudeService;

    @GetMapping("/allInfoSaude")
    public List<Infosaude> getAllInfoSaude(){
        return infoSaudeService.getAllInfoSaude();
    }


}
