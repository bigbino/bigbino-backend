package com.hackaton.bigbino.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String placa;
    private String modelo;
    private String chassi;
    private String  marca;
    private int qtdEixos;
    private int comprimento;
    private int largura;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "caminhoneiro_id", nullable = false)
    private Caminhoneiro caminhoneiro;

    public Veiculo() {
    }

    public Caminhoneiro getCaminhoneiro() {
        return caminhoneiro;
    }

    public void setCaminhoneiro(Caminhoneiro caminhoneiro) {
        this.caminhoneiro = caminhoneiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return qtdEixos == veiculo.qtdEixos &&
                comprimento == veiculo.comprimento &&
                largura == veiculo.largura &&
                Objects.equals(id, veiculo.id) &&
                Objects.equals(placa, veiculo.placa) &&
                Objects.equals(modelo, veiculo.modelo) &&
                Objects.equals(chassi, veiculo.chassi) &&
                Objects.equals(marca, veiculo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placa, modelo, chassi, marca, qtdEixos, comprimento, largura);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chassi='" + chassi + '\'' +
                ", marca='" + marca + '\'' +
                ", qtdEixos=" + qtdEixos +
                ", comprimento=" + comprimento +
                ", largura=" + largura +
                '}';
    }
}
