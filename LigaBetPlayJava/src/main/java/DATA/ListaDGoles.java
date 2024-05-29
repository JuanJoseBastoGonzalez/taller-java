/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATA;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

/**
 *
 * @author camper
 */
public class ListaDGoles {
    //public List<String> lista;

    public List<List<String>> listas;

    public ListaDGoles() {
        //lista = new ArrayList<>();
        listas = new ArrayList<>();
    }

    public void agregarLGl() {
        List<String> nuevaSublista = new ArrayList<>(6);
        listas.add(nuevaSublista);

    }
    //agrega datos a la sublista para poder almacenar los datos de los partidos 

    public void agregarDataG(Integer a, Integer b, String c) {
        List<String> sublista = listas.get(a);
        sublista.add(b, c);
    }

    /* public void agregarDato(String dato) {
        lista.add(dato);
    }

    public List<String> getLista() {
        return lista;
    }*/
    public String obtenerDatoSublista(int indiceSublista, int indiceDato) {
        List<String> sublista = listas.get(indiceSublista);
        return sublista.get(indiceDato);
    }

    public List<String> getListaAll() {
        List<String> allValues = new ArrayList<>();

        for (List<String> sublista : listas) {
            allValues.addAll(sublista);
        }

        return allValues;
    }

}
/*- PJ
- PG
- PP
- PE
- GF
- GC
- TP
*/
