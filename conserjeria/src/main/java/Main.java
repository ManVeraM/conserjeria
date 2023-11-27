import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.services.SistemaImpl;
import cl.ucn.disc.as.services.Sistema;
import io.ebean.DB;
import io.ebean.Database;
import lombok.extern.slf4j.Slf4j;
import io.javalin.Javalin;

@Slf4j
public class Main {

    public static void main(String[] args){
        log.debug("starting Main with library path: {}", system.getProperty("java.library.path"));
        log debug("starting ApiRest server ..");
        javalin app = apiRestServer.start(7070, new webController());

        log.debug("starting the gRPC server...");
        Server server = ServerBuilder
                .forPort(50123)
                .addService(newPersonaGrpcServiceImpl())
                .build();
        server.start();

        Runtime.getRuntime().addShutDownHook(new Thread(server::shutdown));

        server.awaitTermination();

        log.debug("Done. :)");

    }
}
