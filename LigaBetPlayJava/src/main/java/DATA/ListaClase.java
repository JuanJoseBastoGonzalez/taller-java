/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATA;

import java.util.ArrayList;
import java.util.List;

public class ListaClase {
    private List<String> lista;

    public ListaClase() {
        lista = new ArrayList<>();
    }

    public void agregarDato(String dato) {
        lista.add(dato);
    }

    public List<String> getLista() {
        return lista;
    }

   
}
