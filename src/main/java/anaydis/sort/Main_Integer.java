package anaydis.sort;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 27/08/13
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class Main_Integer {

    public static void main(String[] args) {
        IntegerDataSetGenerator integerDataSetGenerator = new IntegerDataSetGenerator();
        List list = integerDataSetGenerator.createRandom(100);
        System.out.println(list);
        Listener p = new Listener();
        InsertionSort sorter = new InsertionSort();
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
