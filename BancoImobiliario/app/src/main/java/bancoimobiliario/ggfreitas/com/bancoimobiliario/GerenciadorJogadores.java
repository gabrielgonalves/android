package bancoimobiliario.ggfreitas.com.bancoimobiliario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriel on 30/07/17.
 */

public class GerenciadorJogadores {
    private static GerenciadorJogadores gerenciador;
    private List<Jogador> listaJogadores;

    public GerenciadorJogadores(){
        listaJogadores = new ArrayList();
    }
    
    public static GerenciadorJogadores getInstance(){
        if(gerenciador == null){
            gerenciador = new GerenciadorJogadores();
        }
        return gerenciador;
    }

    public int novoId(){
        if(listaJogadores.isEmpty()){
            return 1;
        }
        return listaJogadores.get(listaJogadores.size()).getId() + 1;
    }

    public Jogador buscaPorId(int id){
        for(Jogador jogador : listaJogadores){
            if(jogador.getId() == id){
                return jogador;
            }
        }
        return null;
    }

    public boolean adicionarJogador(String nome){
        Jogador jogador = new Jogador();
        jogador.setId(novoId());
        jogador.setNome(nome);
        jogador.setSaldo(1500);

        listaJogadores.add(jogador);
        return true;
    }
}
