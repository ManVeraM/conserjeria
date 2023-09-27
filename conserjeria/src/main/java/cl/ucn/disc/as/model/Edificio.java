package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import javax.persistence.Entity;

@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Edificio extends BaseModel {

    /**
     * The Nombre.
     */
    @NotNull
    private String nombre;

    /**
     * The Dirección.
     */
    @NotNull
    private String dirección;
    /**
     * The Numero de pisos.
     */
    @NotNull
    private Integer numero_pisos;

}

