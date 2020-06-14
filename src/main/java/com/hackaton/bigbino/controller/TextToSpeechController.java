package com.hackaton.bigbino.controller;

import com.google.protobuf.ByteString;
import com.hackaton.bigbino.model.Local;
import com.hackaton.bigbino.service.LocalService;
import com.hackaton.bigbino.service.TextToSpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/tts")
public class TextToSpeechController {

    @Autowired
    private TextToSpeechService textToSpeechService;

    @GetMapping("/speak")
    public ByteString speak(String text) throws IOException {
        return textToSpeechService.speak(text);
    }

}
