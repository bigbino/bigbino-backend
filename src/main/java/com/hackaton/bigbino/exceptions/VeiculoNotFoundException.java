package com.hackaton.bigbino.exceptions;

public class VeiculoNotFoundException extends RuntimeException {
    public VeiculoNotFoundException(Long id){
        super("Não foi possivel encontrar esse veiculo");
    }
}
