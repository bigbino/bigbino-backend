package com.hackaton.bigbino.exceptions;

public class CaminhoneiroNotFoundException extends RuntimeException{
    public CaminhoneiroNotFoundException(Long id) {
        super("Não foi possivel encontrar o caminhoneiro indicado " + id);
    }
}
