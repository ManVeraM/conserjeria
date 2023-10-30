package cl.ucn.disc.as.services;

import java.time.Instant;
import java.util.List;

import cl.ucn.disc.as.exceptions.SistemaException;
import cl.ucn.disc.as.model.Contrato;
import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Pago;
import cl.ucn.disc.as.model.Persona;
import io.ebean.Database;
import io.ebean.PersistenceIOException;
import io.ebean.annotation.NotNull;
import lombok.extern.slf4j.Slf4j;
/**
 * Sistema implementation
 *
 * @autho arquitectrura de software
 */
@Slf4j
public class SistemaImpl implements Sistema {
    /**
     *  the database
     */
    private final Database database;

    public SistemaImpl(Database database){
        this.database = database;
    }
    /**
     * Agrega un edificio al sistema
     *
     * @param edificio a agregar
     */
    @Override
    public Edificio agregar(Edificio edificio) {
        try {
            this.database.save(edificio);
        }catch (PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("Error al agrega un edificio",ex);
        }

        //WARN:Need to retrieve the id?
        return edificio;

    }
    @Override
    public Persona agregar(Persona persona) {
        try{
            this.database.save(persona);
            return persona;
        }catch(PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("Error al agregar una persona",ex);
        }
    
    }
    @Override
    public Departamento agregarDepartamento(Departamento departamento, Edificio edificio) {
        try {
            departamento.setEdificio(edificio);
            this.database.save(departamento);
            return departamento;
        } catch (PersistenceIOException ex) {
            log.error("error", ex);
            throw new SistemaException("Error al agregar un departamento", ex);
        }
    }
    @Override
    public Departamento agregarDepartamento(Departamento departamento, Long idEdificio) {
        try {
            Edificio edificio = this.database.find(Edificio.class, idEdificio);
            departamento.setEdificio(edificio);
            this.database.save(departamento);
            return departamento;
        } catch (PersistenceIOException ex) {
            log.error("error", ex);
            throw new SistemaException("Error al agregar un departamento", ex);
        } 
    }
    @Override
    public Contrato realizarContrato(Persona persona, Departamento departamento, Instant fechaPago) {
        try{
            Contrato contrato = Contrato.builder()
                    .fechaPago(fechaPago)
                    .persona(persona)
                    .departamento(departamento)
                    .build();
            this.database.save(contrato);
            return contrato;
        }catch(PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("Error al agregar un contrato",ex);
        }
    }
    @Override
    public Contrato realizarContrato(Long IdDuenio, Long IdDepartamento, Instant fechaPago) {
        try{
            Persona persona = this.database.find(Persona.class, IdDuenio);
            Departamento departamento = this.database.find(Departamento.class, IdDepartamento);
            Contrato contrato = Contrato.builder()
                    .fechaPago(fechaPago)
                    .persona(persona)
                    .departamento(departamento)
                    .build();
            this.database.save(contrato);
            return contrato;
        }catch(PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("Error al agregar un contrato",ex);
        }
    }
    @Override
    public List<Edificio> getEdificios() {
        try{
            return this.database.find(Edificio.class).findList();
        }catch(PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("error al obtener edificios", ex);
       }
    }
    @Override
    public List<Persona> getPersonas() {
        try{
            return this.database.find(Persona.class).findList();
        }catch(PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("Error al obtener personas",ex);
        }
    }

    @Override
    public List<Pago> getPagos(String rut) {
        try{
            return this.database.find(Pago.class).where().eq("rut",rut).findList();
        }catch(PersistenceIOException ex){
            log.error("error",ex);
            throw new SistemaException("Error al obtener pagos",ex);
        }
    }
}
