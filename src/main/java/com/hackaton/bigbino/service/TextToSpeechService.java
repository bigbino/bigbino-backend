package com.hackaton.bigbino.service;

import com.google.protobuf.ByteString;
import com.hackaton.bigbino.tts.TextToSpeech;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TextToSpeechService {

    public ByteString speak( String text) throws IOException {
        return TextToSpeech.speak(text);
    }
}
