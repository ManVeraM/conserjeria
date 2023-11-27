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
        log.debug("Iniciando el sistema...");

        log.debug("Library path : {}", System.getProperty("java.library.path"));

        //Start the API Rest Server
        Javalin app = ApiRestServer.start(7070,new WebController());

        log.debug("Sistema deteniendose...");

        app.stop();

        log.debug("Sistema finalizado...");


    }
}
