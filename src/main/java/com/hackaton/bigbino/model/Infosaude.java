package com.hackaton.bigbino.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "infosaude")
public class Infosaude {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tipoSanguineo;
    private boolean isDiabetico;
    private boolean isHipertenso;

    public Infosaude() {
    }


    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public boolean isDiabetico() {
        return isDiabetico;
    }

    public void setDiabetico(boolean diabetico) {
        isDiabetico = diabetico;
    }

    public boolean isHipertenso() {
        return isHipertenso;
    }

    public void setHipertenso(boolean hipertenso) {
        isHipertenso = hipertenso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Infosaude infosaude = (Infosaude) o;
        return isDiabetico == infosaude.isDiabetico &&
                isHipertenso == infosaude.isHipertenso &&
                Objects.equals(id, infosaude.id) &&
                Objects.equals(tipoSanguineo, infosaude.tipoSanguineo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoSanguineo, isDiabetico, isHipertenso);
    }

    @Override
    public String toString() {
        return "Infosaude{" +
                "id=" + id +
                ", tipoSanguineo='" + tipoSanguineo + '\'' +
                ", isDiabetico=" + isDiabetico +
                ", isHipertenso=" + isHipertenso +
                '}';
    }
}
