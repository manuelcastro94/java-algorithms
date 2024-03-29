package anaydis.sort.tp3;

import anaydis.sort.IntegerListener;
import anaydis.sort.tp2.IntegerDataSetGenerator;
import anaydis.sort.Shellsort_extending;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 07/09/13
 * Time: 20:45
 * To change this template use File | Settings | File Templates.
 */
public class HCompare {

    public static void main(String[] args) {

        //Shellsort sorter = new Shellsort();
        Shellsort_extending sorter = new Shellsort_extending();
        IntegerDataSetGenerator integerDataSetGenerator = new IntegerDataSetGenerator();
        List list = integerDataSetGenerator.createRandom(10000);
        System.out.println(list);
        IntegerListener listener = new IntegerListener();
        //sorter.gethSort().addSorterListener(listener);
        sorter.addSorterListener(listener);
        long initialTime = System.currentTimeMillis();
        sorter.sort(integerDataSetGenerator.getComparator(),list);
        long sortingTime = System.currentTimeMillis()-initialTime;
        System.out.println(list);
        listener.getGreaterCounter();
        listener.getSwapCounter();
        System.out.println("Time: " + sortingTime + " Miliseconds");


    }


}
