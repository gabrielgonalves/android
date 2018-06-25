package bancoimobiliario.ggfreitas.com.bancoimobiliario;

/**
 * Created by gabriel on 30/07/17.
 */

public class Jogador {
    private int id;
    private String nome;
    private float saldo;

    public boolean pagar(int id, float valor){
        if(valor > saldo){
            return false;
        }

        Jogador jogador = GerenciadorJogadores.getInstance().buscaPorId(id);
        if(jogador == null){
            return false;
        }
        jogador.getSaldo() += valor;
        saldo -= valor;
        return true;
    }

    public boolean receber(float valor){
        if(valor < 0){
            return false;
        }
        saldo += valor;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
