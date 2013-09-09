package anaydis_main;

import anaydis.sort.*;
import anaydis.sort.data.StringDataSetGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 27/08/13
 * Time: 23:28
 * To change this template use File | Settings | File Templates.
 */
public class Main_String {
    public static void main(String[] args) {
        FullNameDataSetGenerator fullNameDataSetGenerator = new FullNameDataSetGenerator();
        List list = fullNameDataSetGenerator.createRandom(6);
        System.out.println("Lista desordenada: "+list);
        /*
         se eligio el insertion sort porque es un algoritmo estable
         */
        Shellsort_extending sorter = new Shellsort_extending();
        //InsertionSort sorter = new InsertionSort();
        //SelectionSort sorter = new SelectionSort();
        //BubbleSort sorter = new BubbleSort();
        //QuickSort sorter = new QuickSort();
        Comparator<FullName> comp2 = new Comparator<FullName>() {
            @Override
            public int compare(FullName o1, FullName o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        };
        final Comparator<FullName> comp = new Comparator<FullName>() {
            @Override
            public int compare(FullName s1, FullName s2) {
               return s1.getFirstName().compareTo(s2.getFirstName());  //To change body of implemented methods use File | Settings | File Templates.
            }
        };

        sorter.sort(comp2,list);
        System.out.println("Lista ordenada alfabeticamente por nombre: " + list);
        System.out.println(list);
        sorter.sort(comp, list);
        System.out.println("Lista odenada por apellido: "+list);
    }
}
