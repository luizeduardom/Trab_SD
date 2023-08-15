package meuservidorudp;

import java.util.ArrayList;

public class BaseDeDados {

    private ArrayList lista = null;

    public BaseDeDados() {
        lista = new ArrayList();
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
