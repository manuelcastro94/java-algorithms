package anaydis.sort.tp2;

import anaydis.sort.IntegerListener;
import anaydis.sort.QuickSort;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 03/09/13
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class Main_Integer {

    public static void main(String[] args) {
        IntegerDataSetGenerator integerDataSetGenerator = new IntegerDataSetGenerator();
        List list = integerDataSetGenerator.createRandom(10);
        System.out.println(list);
        IntegerListener p = new IntegerListener();
        //Shellsort_extending sorter = new Shellsort_extending();

        QuickSort sorter = new QuickSort();
        //HSort sorter = new HSort();
        //InsertionSort sorter = new InsertionSort();
        //BubbleSort sorter = new BubbleSort();
        //SelectionSort sorter = new SelectionSort();
        sorter.addSorterListener(p);
        long tiempoInicio = System.currentTimeMillis();
        sorter.sort(integerDataSetGenerator.getComparator(), list);

        long tiempoFinal = (System.currentTimeMillis() - tiempoInicio);
        System.out.println(list);
        System.out.println("Greater: "+p.getGreaterCounter()+" / ");
        System.out.println("swap: "+p.getSwapCounter()+" / ");
        System.out.println("tiempo: "+tiempoFinal + " MiliSegundos");

    }

}


