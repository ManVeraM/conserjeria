package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;


@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Departamento extends BaseModel {
    /**
     * The numero.
     */
    @NotNull
    @Getter
    @Setter
    private Integer numero;

    public Departamento(Integer numero, String piso, Edificio edificio) {
        this.numero = numero;
        this.piso = piso;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    /**
     * The Piso.
     */
    @Getter
    @Setter
    @NotNull
    private String piso;

    @Getter
    @Setter
    private Edificio edificio;
}
