package cl.ucn.disc.as.ui;
import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.services.Sistema;
import cl.ucn.disc.as.services.SistemaImpl;
import io.ebean.DB;
import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;

import java.util.Optional;

public final class WebController  implements RoutesConfigurator {

    private final Sistema sistema;

    public WebController(){
        this.sistema = new SistemaImpl(DB.getDefault());
    }

    @Override
    public void configure(final Javalin app) {

        /*
        Default route or home
         */
        app.get("/", ctx -> {
            ctx.result("Welcome to conserjeria API REST");
        });
        /*
        Route Personas, get all personas
         */
        app.get("personas",ctx -> {
            ctx.json(this.sistema.getPersonas());
        });
        /*
        Route persona plus rut, get persona by rut
         */
        app.get("/personas/rut/{rut}",ctx -> {
            String rut = ctx.pathParam("rut");
            Optional<Persona> oPersona = this.sistema.getPersona(rut);
            ctx.json(oPersona.orElseThrow(() -> new NotFoundResponse("Cant find persona with rut: " + rut)));

        });

        app.get("/grpc/personas/rut/{rut}", ctx) -> {
            String rut = ctx.pathParam("rut");

            //channel
            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress("127.0.0.1", 50123)
                    .usePlaintext()
                    .build();
            //stub
            PersonaGrpcServiceGrpc.PersonaGrpcServiceBlockingStub stub =
                    PersonaGrpcServiceGrpc.newBlockingStub(channel);

            //call the grpc
            PersonaGrpcResponse response = stub.retrieve(PersonaGrpcRequest
                    .newBuilder()
                    .setRut("130144918")
                    .build());

            //get the response
            PersonaGrpc personaGrpc = response.getPersona();

            //return the persona
            Optional <Persona> oPersona = optional.of(Persona.builder()
                    .rut(personaGrpc.getRut())
                    .nombre(personaGrpc.getNombre())
                    .apellidos(personaGrpc.getApellidos())
                    .email(personaGrpc.getEmail())
                    .build());
            ctx.json(oPersona.orElseThrow(()-> new NotFoundResponse("cant find Persona with rut: " +rut )))

        });


    }
}
