package meuclienteudp;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Filme> filmesAvaliados;

    public Cliente(String nome) {
        this.nome = nome;
        this.filmesAvaliados = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme> getFilmesAvaliados() {
        return filmesAvaliados;
    }

    public void setFilmesAvaliados(List<Filme> filmesAvaliados) {
        this.filmesAvaliados = filmesAvaliados;
    }
    

}
