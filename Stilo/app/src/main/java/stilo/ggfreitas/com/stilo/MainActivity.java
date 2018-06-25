package stilo.ggfreitas.com.stilo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GerenciadorOnibus gerenciador;
    private ListView listaOnibus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gerenciador = new GerenciadorOnibus();

        listaOnibus = (ListView) findViewById(R.id.listaOnibus);

        AdapterOnibus adapter = new AdapterOnibus(gerenciador.getListaOnibus(), this);

        listaOnibus.setAdapter(adapter);

        listaOnibus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, TelaHorario.class);

                intent.putExtra("onibus", (Serializable) gerenciador.getListaOnibus().get(position));

                startActivity(intent);
            }
        });

    }


}
