package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import io.ebean.typequery.PString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;

@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Departamento extends BaseModel {
    /**
     * The numero.
     */
    @NotNull
    private Integer numero;

    /**
     * The Piso.
     */
    @NotNull
    private String piso;


    private Edificio edificio;
}
