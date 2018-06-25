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

public class AdapterOnibus extends BaseAdapter {

    private final List<Onibus> onibus;
    private final Activity activity;

    public AdapterOnibus(List<Onibus> onibus, Activity activity) {
        this.onibus = onibus;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return onibus.size();
    }

    @Override
    public Onibus getItem(int position) {
        return onibus.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().inflate(R.layout.lista_onibus_layout, parent, false);

        Onibus oni = onibus.get(position);

        TextView origem = (TextView) view.findViewById(R.id.origem);
        TextView destino= (TextView) view.findViewById(R.id.destino);
        TextView numero = (TextView) view.findViewById(R.id.numero);
        ImageView img = (ImageView) view.findViewById(R.id.img);

        origem.setText(oni.getOrigem());
        destino.setText(oni.getDestino());
        numero.setText(Integer.toString(oni.getNumero()));

        if(oni.getCor().equals("azul")){
            img.setImageResource(R.drawable.azul);
        } else if(oni.getCor().equals("laranja")){
            img.setImageResource(R.drawable.laranja);
        } else {
            img.setImageResource(R.drawable.verde);
        }

        return view;
    }
}
