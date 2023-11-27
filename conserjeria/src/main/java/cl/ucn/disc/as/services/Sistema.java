package cl.ucn.disc.as.services;

import java.time.Instant;
import java.util.List;

import cl.ucn.disc.as.model.Contrato;
import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.Pago;

/**
 * System operations
 *
 * @author Arquitectura de software
*/

public interface Sistema {
    /**
     * Agrega un edificio al sistema
     * @param edificio a agregar
     */
    Edificio agregar(Edificio edificio);
    
    /**
     * Agrega una persona al sistema
     * @param persona a agregar
     */
    Persona agregar(Persona persona);  


    /**
     * Agrega un departamento al sistema
     * @param departamento a agregar
     * @param edificio donde esta el departamento
     */
    Departamento agregarDepartamento(Departamento departamento, Edificio edificio);

    /**
     * Agrega un departamento al sistema
     * @param departamento a agregar
     * @param id del edificio donde esta el departamento
     */
    Departamento agregarDepartamento(Departamento departamento, Long idEdificio);


    /**
     * Agrega un contrato al sistema
     * @param Persona persona que firma contrato
     * @param departamento departamento arrendado
     * @param fechaPago fecha de pago
     */
    Contrato realizarContrato(Persona persona, Departamento departamento, Instant fechaPago);


    /**
     * Agrega un contrato al sistema
     * @param IdDuenio id de la persona que firma contrato
     * @param IdDepartamento id del departamento arrendado
     * @param fechaPago fecha de pago
     */

    Contrato realizarContrato(Long IdDuenio, Long IdDepartamento, Instant fechaPago);

    

    /**
     * Devuelve todos los edificios

     */
    List<Edificio> getEdificios();

    /**
     * Devuelve todas las personas
     */
    List<Persona> getPersonas();

    /**
     * Devuelve todos los pagos de un usuario
     * @param rut del usuario
     */
    List<Pago> getPagos(String rut);


    Optional<Persona> getPersona(String rut);


    void populate();






}
