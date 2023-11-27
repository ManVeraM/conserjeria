package cl.ucn.disc.as.gRPC;

import cl.ucn.disc.as.grpc.PersonaGrpcServiceGrpc;
import cl.ucn.disc.as.services.Sistema;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * The Persona gRPC Service class.
 * @author Juan
 */
@Slf4j
public final class PersonaGrpcServiceImpl extends PersonaGrpcServiceGrpc.PersonaGrpcServiceImplBase {
    /**
     * Retrieves a Persona from the system.
     * @param request
     * @param responseObserver
     */
    @Override
    public void retrieve(PersonaGrpcRequest request, StreamObserver<PersonaGrpcResponse> responseObserver) {
        log.debug("Retrieving Persona with RUT: {}", request.getRut());
        PersonaGrpc personaGrpc = PersonaGrpc.newBuilder()
                .setRut(request.getRut())
                .setNombre("Manuel")
                .setApellidos("Vera Martinez")
                .setEmail("ManVeraM@gmail.com")
                .setTelefono("978934390")
                .build();

        responseObserver.onNext(PersonaGrpcResponse.newBuilder()
                .setPersona(personaGrpc)
                .build());
        responseObserver.onCompleted();
    }
}