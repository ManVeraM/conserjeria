package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import io.ebean.annotation.DbMigration; 
import io.ebean.annotation.DbMigration.List;
import io.ebean.typequery.PString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Contrato extends BaseModel{

    /**
     * The fechaPago.
     */
    @NotNull
    @Getter
    @Setter
    private Instant fechaPago;

    public Contrato(Instant fechaPago, Persona persona, Departamento departamento) {
        this.fechaPago = fechaPago;
        this.persona = persona;
        this.departamento = departamento;
    }

    public Instant getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Instant fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * The persona.
     */
    @NotNull
    @Getter
    @Setter
    private Persona persona;

    /**
     * The departamento.
     */
    @NotNull
    @Getter
    @Setter
    private Departamento departamento;


}
