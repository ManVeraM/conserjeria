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
