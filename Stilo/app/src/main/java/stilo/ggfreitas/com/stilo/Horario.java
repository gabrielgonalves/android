package stilo.ggfreitas.com.stilo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by gabriel on 21/05/17.
 */

public class Horario implements Serializable{

    private Map<DiaSemana, List<String>> horario;
    private String partida;


    public Horario(Map<DiaSemana, List<String>> horario, String partida) {
        this.horario = horario;
        this.partida = partida;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public Map<DiaSemana, List<String>> getHorario() {
        return horario;
    }
}
