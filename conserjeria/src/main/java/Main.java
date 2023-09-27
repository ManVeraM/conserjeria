import cl.ucn.disc.as.model.Edificio;
import cl.ucn.disc.as.model.Persona;
import cl.ucn.disc.as.services.SisteamaImpl;
import cl.ucn.disc.as.services.Sistema;
import io.ebean.DB;
import io.ebean.Database;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class Main {

    public static void main(String[] args){
        Database db = DB.getDefault();

        Sistema sistema = new SisteamaImpl((db));

        Edificio edificio = Edificio.builder()
                .nombre("y1")
                .dirección("ssss 145")
                .numero_pisos(12)
                .build();
        log.debug("edificio before db: {}", edificio);

        edificio = sistema.agregar(edificio);
        log.debug("edificio after db: {}", edificio);




    }
}
