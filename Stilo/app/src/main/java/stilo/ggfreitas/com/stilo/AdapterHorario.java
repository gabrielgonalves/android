package stilo.ggfreitas.com.stilo;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gabriel on 20/05/17.
 */

public class AdapterHorario extends BaseAdapter {

    private final Onibus onibus;
    private final Activity activity;

    public AdapterHorario(Onibus onibus, Activity activity) {
        this.onibus = onibus;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return onibus.getHorarios().size();
    }

    @Override
    public Horario getItem(int position) {
        return onibus.getHorarios().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_horario_layout, parent, false);

        TextView partida = (TextView) view.findViewById(R.id.partida);
        TextView diaUtil = (TextView) view.findViewById(R.id.diaUtil);
        TextView sabado = (TextView) view.findViewById(R.id.sabado);
        TextView domingo = (TextView) view.findViewById(R.id.domingoFeriado);

        partida.setText("Partida de " + onibus.getHorarios().get(position).getPartida());
        diaUtil.setText(percorreHorario(onibus.getHorarios().get(position).getHorario().get(DiaSemana.UTIL)));
        sabado.setText(percorreHorario(onibus.getHorarios().get(position).getHorario().get(DiaSemana.SABADO)));
        domingo.setText(percorreHorario(onibus.getHorarios().get(position).getHorario().get(DiaSemana.DOMINGO_FERIADO)));


        return view;
    }

    private String percorreHorario(List<String> horario) {
        String retorno = "";
        for (int i = 0; i < horario.size(); i++) {
            retorno += horario.get(i) + "\t\t";
        }
        return retorno;
    }
}
