package meuservidorudp;

import java.util.ArrayList;
import java.util.List;
import meuclienteudp.Cliente;
import meuclienteudp.Filme;

public class BaseDeDados {

    private ArrayList lista = null;

    public BaseDeDados() {
        lista = new ArrayList();
    }
   

    public void criarMatriz(){
        List<Cliente> listaCliente = new ArrayList();
        List<Filme> listaFilmes = new ArrayList();
        Filme filme0 = new Filme("Cronicas de Narnia");
        Filme filme1 = new Filme("Bambi");
        Filme filme2 = new Filme("Ursinho Pool");
        Filme filme3 = new Filme("Barbie");
        Filme filme4 = new Filme("Stuart Liro");
        Filme filme5 = new Filme("Liro stiti");
        Filme filme6 = new Filme("Mickey mousse");
        Filme filme7 = new Filme("Pequeno sereio");
        Filme filme8 = new Filme("Nata goiaba");
        Filme filme9 = new Filme("Floquis");
        Filme filme10 = new Filme("Pluto");
        Filme filme11 = new Filme("Pateta");
        Filme filme12 = new Filme("Scooby doo");
        Filme filme13 = new Filme("Monstros SA");
        Filme filme14 = new Filme("Kick buttowisk");
        Filme filme15 = new Filme("Atirador");
        Filme filme16 = new Filme("Justiceiro");
        Filme filme17 = new Filme("Flash");
        Filme filme18 = new Filme("Homem de ferro");
        Filme filme19 = new Filme("Planeta dos macacos");
        
        listaFilmes.add(filme0);
        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);
        listaFilmes.add(filme4);
        listaFilmes.add(filme5);
        listaFilmes.add(filme6);
        listaFilmes.add(filme7);
        listaFilmes.add(filme8);
        listaFilmes.add(filme9);
        listaFilmes.add(filme10);
        listaFilmes.add(filme11);
        listaFilmes.add(filme12);
        listaFilmes.add(filme13);
        listaFilmes.add(filme14);
        listaFilmes.add(filme15);
        listaFilmes.add(filme16);
        listaFilmes.add(filme17);
        listaFilmes.add(filme18);
        listaFilmes.add(filme19);
        
        Cliente a = new Cliente();
        Cliente b = new Cliente();
        Cliente c = new Cliente();
        Cliente d = new Cliente();
        Cliente e = new Cliente();
        Cliente f = new Cliente();
        Cliente g = new Cliente();
        Cliente h = new Cliente();
        Cliente i = new Cliente();
        Cliente j = new Cliente();
        
        listaCliente.add(a);
        listaCliente.get(0).setNome("Asdrubal");
        listaCliente.get(0).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(b);
        listaCliente.get(1).setNome("Bruno");
        listaCliente.get(1).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(c);
        listaCliente.get(2).setNome("Cadu");
        listaCliente.get(2).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(d);
        listaCliente.get(3).setNome("Breno");
        listaCliente.get(3).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(e);
        listaCliente.get(4).setNome("Filipe");
        listaCliente.get(4).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(f);
        listaCliente.get(5).setNome("Fernanda");
        listaCliente.get(5).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(g);
        listaCliente.get(6).setNome("Julio");
        listaCliente.get(6).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(h);
        listaCliente.get(7).setNome("Pedro");
        listaCliente.get(7).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(i);
        listaCliente.get(8).setNome("Geovana");
        listaCliente.get(8).setFilmesAvaliados(listaFilmes);
        
        listaCliente.add(j);
        listaCliente.get(9).setNome("Filomena");
        listaCliente.get(9).setFilmesAvaliados(listaFilmes);
        
             
        System.out.println(listaCliente);
    }
    public void insere(String message) {
        lista.add(message.trim());
    }

    public String le() {
        String s = "\n";
        int fim = lista.size();

        for (int pos = 0; pos < fim; pos++) {
            s = s + "[" + (pos + 1) + "]" + (String) lista.get(pos) + "\n";
        }

        return s;
    }

}
