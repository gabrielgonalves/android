package stilo.ggfreitas.com.stilo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class TelaHorario extends AppCompatActivity {

    private ListView listaHorario;
    private TextView titulo;
    private TextView tarifa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_horario);

        Bundle extra = getIntent().getExtras();

        titulo = (TextView) findViewById(R.id.onibusId);
        listaHorario = (ListView) findViewById(R.id.listaHorario);
        tarifa = (TextView) findViewById(R.id.tarifa);


        if(extra != null){
            Onibus onibus = (Onibus) extra.getSerializable("onibus");

            AdapterHorario adapter = new AdapterHorario(onibus, this);

            listaHorario.setAdapter(adapter);
            titulo.setText(onibus.toString());
            tarifa.setText(String.format("Tarifa: R$%.2f", onibus.getTarifa()));
        }


    }


}
