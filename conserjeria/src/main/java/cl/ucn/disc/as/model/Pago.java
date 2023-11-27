package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
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

@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Pago extends BaseModel{

    /**
     * The Monto.
     */
    @NotNull
    @Getter
    @Setter
    private Integer Monto;
    
    /**
     * The fechaPago.
     */
    @NotNull   
    @Getter
    @Setter
    private Instant fechaPago;

    public Pago(Integer monto, Instant fechaPago) {
        Monto = monto;
        this.fechaPago = fechaPago;
    }

    public Integer getMonto() {
        return Monto;
    }

    public void setMonto(Integer monto) {
        Monto = monto;
    }

    public Instant getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Instant fechaPago) {
        this.fechaPago = fechaPago;
    }
}
