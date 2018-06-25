package stilo.ggfreitas.com.stilo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gabriel on 21/05/17.
 */

public class GerenciadorOnibus {

    private List<Onibus> listaOnibus;

    public GerenciadorOnibus() {
        this.listaOnibus = carregaHorario();
    }

    public List<Onibus> carregaHorario() {
        List<Onibus> onibus = new ArrayList();

        //onibus.add(onibus3950());
        onibus.add(onibus3953());
        onibus.add(onibus3954());
        //onibus.add(onibus3956());
        //onibus.add(onibus3957());
        //onibus.add(onibus3967());

        return onibus;
    }

    public Onibus onibus3950() {
        Onibus onibus = new Onibus(3950, "Juatuba", "Azurita", "azul", 0);

        Map<DiaSemana, List<String>> horarios;

        ArrayList<String> util;
        ArrayList<String> sabado;
        ArrayList<String> domingo;
        Horario horario;

        horarios = new HashMap();

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Juatuba");
        onibus.getHorarios().add(horario);

        horarios = new HashMap();

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Azurita");
        onibus.getHorarios().add(horario);

        return onibus;
    }

    public Onibus onibus3957() {
        Onibus onibus = new Onibus(3957, "Mateus Leme", "Est. Eldorado", "laranja", 0);

        Map<DiaSemana, List<String>> horarios = new HashMap();

        ArrayList<String> util;
        ArrayList<String> sabado;
        ArrayList<String> domingo;
        Horario horario;

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Mateus Leme");
        onibus.getHorarios().add(horario);

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Est. Eldorado");
        onibus.getHorarios().add(horario);

        return onibus;
    }

    public Onibus onibus3967() {
        Onibus onibus = new Onibus(3967, "Mateus Leme", "Betim", "azul", 0);

        Map<DiaSemana, List<String>> horarios = new HashMap();

        ArrayList<String> util;
        ArrayList<String> sabado;
        ArrayList<String> domingo;
        Horario horario;

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Mateus Leme");
        onibus.getHorarios().add(horario);

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Betim");
        onibus.getHorarios().add(horario);

        return onibus;
    }

    public Onibus onibus3956() {
        Onibus onibus = new Onibus(3956, "Mateus Leme", "Bhte", "verde", 0);

        Map<DiaSemana, List<String>> horarios = new HashMap();

        ArrayList<String> util;
        ArrayList<String> sabado;
        ArrayList<String> domingo;
        Horario horario;

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Mateus Leme");
        onibus.getHorarios().add(horario);

        /*UTIL*/
        util = new ArrayList();
        util.add("00:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("00:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("00:00");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Bhte");
        onibus.getHorarios().add(horario);

        return onibus;
    }

    public Onibus onibus3954() {
        Onibus onibus = new Onibus(3954, "Florestal", "Juatuba", "azul", 0);

        Map<DiaSemana, List<String>> horarios = new HashMap();

        ArrayList<String> util;
        ArrayList<String> sabado;
        ArrayList<String> domingo;
        Horario horario;

        /*UTIL*/
        util = new ArrayList();
        util.add("04:50");
        util.add("05:25");
        util.add("06:00");
        util.add("06:30");
        util.add("07:05");
        util.add("07:45");
        util.add("08:15");
        util.add("08:50");
        util.add("09:35");
        util.add("10:05");
        util.add("10:40");
        util.add("11:20");
        util.add("11:55");
        util.add("12:30");
        util.add("13:10");
        util.add("13:45");
        util.add("14:20");
        util.add("15:00");
        util.add("15:35");
        util.add("16:05");
        util.add("16:40");
        util.add("17:20");
        util.add("18:05");
        util.add("18:40");
        util.add("19:15");
        util.add("20:05");
        util.add("21:00");
        util.add("22:05");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("05:00");
        sabado.add("05:45");
        sabado.add("06:35");
        sabado.add("07:20");
        sabado.add("08:20");
        sabado.add("09:05");
        sabado.add("10:05");
        sabado.add("10:55");
        sabado.add("11:55");
        sabado.add("12:45");
        sabado.add("13:45");
        sabado.add("15:30");
        sabado.add("17:20");
        sabado.add("19:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("05:35");
        domingo.add("07:25");
        domingo.add("09:15");
        domingo.add("11:05");
        domingo.add("12:55");
        domingo.add("14:45");
        domingo.add("16:35");
        domingo.add("18:25");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Florestal via Boa Vista");
        onibus.getHorarios().add(horario);

        horarios = new HashMap();

        /*UTIL*/
        util = new ArrayList();
        util.add("06:45");
        util.add("09:10");
        util.add("11:10");
        util.add("13:25");
        util.add("15:45");
        util.add("18:20");

        /*SABADO*/
        sabado = new ArrayList();
        sabado.add("Nenhum horário aos sábados!");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("Nenhum horário aos domingos e feriados!");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Florestal via Jd. Leme");
        onibus.getHorarios().add(horario);

        horarios = new HashMap();

       /*UTIL*/
        util = new ArrayList();
        util.add("05:40");
        util.add("06:10");
        util.add("06:50");
        util.add("07:25");
        util.add("07:55");
        util.add("08:40");
        util.add("09:10");
        util.add("09:50");
        util.add("10:30");
        util.add("11:00");
        util.add("11:35");
        util.add("12:10");
        util.add("12:50");
        util.add("13:25");
        util.add("14:05");
        util.add("14:55");
        util.add("15:15");
        util.add("15:55");
        util.add("16:30");
        util.add("17:05");
        util.add("17:35");
        util.add("18:20");
        util.add("19:05");
        util.add("19:50");
        util.add("20:10");
        util.add("21:10");
        util.add("21:50");
        util.add("23:00");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("05:45");
        sabado.add("06:30");
        sabado.add("07:25");
        sabado.add("08:10");
        sabado.add("09:10");
        sabado.add("10:00");
        sabado.add("11:00");
        sabado.add("11:50");
        sabado.add("12:50");
        sabado.add("13:40");
        sabado.add("14:40");
        sabado.add("16:20");
        sabado.add("18:15");
        sabado.add("19:45");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("06:25");
        domingo.add("08:15");
        domingo.add("10:05");
        domingo.add("11:55");
        domingo.add("13:45");
        domingo.add("15:35");
        domingo.add("17:25");
        domingo.add("19:25");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Juatuba via Boa Vista");
        onibus.getHorarios().add(horario);

        horarios = new HashMap();

        /*UTIL*/
        util = new ArrayList();
        util.add("06:00");
        util.add("07:45");
        util.add("10:10");
        util.add("12:20");
        util.add("14:30");
        util.add("16:55");

        /*SABADO*/
        sabado = new ArrayList();
        sabado.add("Nenhum horário aos sábados!");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("Nenhum horário aos domingos e feriados!");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Juatuba via Jd. Leme");
        onibus.getHorarios().add(horario);

        return onibus;
    }

    public Onibus onibus3953() {
        Onibus onibus = new Onibus(3953, "Florestal", "Est. Eldorado", "laranja", 9.00);

        Map<DiaSemana, List<String>> horarios = new HashMap();

        ArrayList<String> util;
        ArrayList<String> sabado;
        ArrayList<String> domingo;
        Horario horario;

        /*UTIL*/
        util = new ArrayList();
        util.add("04:30");
        util.add("05:30");
        util.add("06:30");
        util.add("07:40");
        util.add("08:50");
        util.add("09:40");
        util.add("11:40");
        util.add("13:20");
        util.add("15:00");
        util.add("15:50");
        util.add("16:40");
        util.add("18:00");
        util.add("18:50");
        util.add("19:50");
        util.add("22:20");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("04:50");
        sabado.add("05:55");
        sabado.add("07:20");
        sabado.add("09:00");
        sabado.add("10:20");
        sabado.add("11:40");
        sabado.add("13:00");
        sabado.add("14:30");
        sabado.add("16:00");
        sabado.add("17:30");
        sabado.add("19:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("06:00");
        domingo.add("08:50");
        domingo.add("11:35");
        domingo.add("14:10");
        domingo.add("15:20");
        domingo.add("16:40");
        domingo.add("17:55");
        domingo.add("19:10");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Florestal");
        onibus.getHorarios().add(horario);

        horarios = new HashMap();

        /*UTIL*/
        util = new ArrayList();
        util.add("06:00");
        util.add("07:00");
        util.add("08:10");
        util.add("09:10");
        util.add("10:20");
        util.add("11:05");
        util.add("13:10");
        util.add("14:50");
        util.add("16:20");
        util.add("17:10");
        util.add("18:20");
        util.add("19:30");
        util.add("20:20");
        util.add("21:05");
        util.add("23:40");

        /*SÁBADO*/
        sabado = new ArrayList();
        sabado.add("06:05");
        sabado.add("07:20");
        sabado.add("08:40");
        sabado.add("10:20");
        sabado.add("11:40");
        sabado.add("13:00");
        sabado.add("14:20");
        sabado.add("15:50");
        sabado.add("17:20");
        sabado.add("19:00");
        sabado.add("21:00");

        /*DOMINGO E FERIADO*/
        domingo = new ArrayList();
        domingo.add("07:15");
        domingo.add("10:05");
        domingo.add("12:50");
        domingo.add("15:25");
        domingo.add("16:35");
        domingo.add("17:55");
        domingo.add("19:10");
        domingo.add("20:15");

        horarios.put(DiaSemana.UTIL, util);
        horarios.put(DiaSemana.SABADO, sabado);
        horarios.put(DiaSemana.DOMINGO_FERIADO, domingo);

        horario = new Horario(horarios, "Est. Eldorado");
        onibus.getHorarios().add(horario);

        return onibus;
    }

    public List<Onibus> getListaOnibus() {
        return listaOnibus;
    }
}
