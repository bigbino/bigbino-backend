package com.hackaton.bigbino.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "caminhoneiro")
public class Caminhoneiro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String sobrenome;
    private String usuario;
    private String password;

    @OneToMany(mappedBy = "caminhoneiro", fetch = FetchType.LAZY)
    private List<Veiculo> veiculos;

    @OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "id_caminhoneiro")
    private Infosaude infosaude;

    public Caminhoneiro() {
    }

    public Caminhoneiro(String nome, String sobrenome, String usuario, String password) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.password = password;
    }

    public Infosaude getInfosaude() {
        return infosaude;
    }

    public void setInfosaude(Infosaude infosaude) {
        this.infosaude = infosaude;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caminhoneiro that = (Caminhoneiro) o;
        return id == that.id &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(sobrenome, that.sobrenome) &&
                Objects.equals(usuario, that.usuario) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sobrenome, usuario, password);
    }

    @Override
    public String toString() {
        return "Caminhoneiro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
