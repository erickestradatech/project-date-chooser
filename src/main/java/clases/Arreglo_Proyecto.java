package clases;

import java.util.*;

public class Arreglo_Proyecto {

    private ArrayList<Proyecto> lista;

    public Arreglo_Proyecto() {

        lista = new ArrayList();
        lista.add(new Arboles(9, "Los Jardinez", 1, "2015-05-08", "2015-05-16"));
        lista.add(new Carretera(1, "Edificios", 1, "2018-05-14", "2018-05-21"));
        lista.add(new Arboles(10, "Los pastos", 3, "2020-03-02", "2020-03-20"));
        lista.add(new Carretera(12, "Colegio", 2, "2019-05-11", "2019-05-21"));
        lista.add(new Arboles(13, "Manzanilla", 3, "2020-04-10", "2020-04-25"));
        lista.add(new Carretera(15, "Universidad", 2, "2017-03-10", "2017-03-15"));
    }

    public void adi_Carreteras(Carretera c) {

        lista.add(c);
    }

    public void adi_Arboles(Arboles a) {

        lista.add(a);
    }

    public ArrayList<Proyecto> listado() {

        return lista;
    }

    public void borra(Proyecto per) {

        lista.remove(per);
    }

    public Proyecto busca(String nro) {

        for (Proyecto x : lista) {

            if (x.getCodigo().equals(nro)) {

                return x;
            }
        }

        return null;
    }

    // ORDENAR POR NOMBRE
    public void ordenNombre() {

        Collections.sort(lista, new orden1());
    }

    //  ORDENAR DE COSTO DE FORMA DESCENDENTE
    public void ordenCosto() {

        Collections.sort(lista, new orden2());
    }

    // CLASE PARA ORDENAR NOMBRES
    class orden1 implements Comparator<Proyecto> {

        @Override
        public int compare(Proyecto p1, Proyecto p2) {

            return p1.getNombreProyecto().compareTo(p2.getNombreProyecto());
        }
    }

    // CLASE PARA ODERNAR LOS COSTOS
    class orden2 implements Comparator<Proyecto> {

        @Override
        public int compare(Proyecto p1, Proyecto p2) {

            int sw;

            if (p1.costo() > p2.costo()) {

                sw = 1;
            } else if (p1.costo() < p2.costo()) {

                sw = -1;
            } else {

                sw = 0;
            }

            return sw;

        }
    }
}
