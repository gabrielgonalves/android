package stilo.ggfreitas.com.stilo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriel on 20/05/17.
 */

public class Onibus implements Serializable {

    private int numero;
    private String origem;
    private String destino;
    private String cor;
    private double tarifa;
    private List<Horario> horarios;

    public Onibus(int numero, String origem, String destino, String cor, double tarifa) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.cor = cor;
        this.tarifa = tarifa;
        this.horarios = new ArrayList();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return numero + " " + origem + " - " + destino;
    }
}
