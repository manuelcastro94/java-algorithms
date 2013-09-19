package anaydis.sort.tp4;

import anaydis.sort.*;
import anaydis.sort.tp2.IntegerDataSetGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 12/09/13
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
public class TestSorterTypes {

    public void testRandom(AbstractSorter abstractSorter,int lenght){

        IntegerDataSetGenerator integerDataSetGenerator = new IntegerDataSetGenerator();
        List list = integerDataSetGenerator.createRandom(lenght);
        IntegerListener listener = new IntegerListener();
        abstractSorter.addSorterListener(listener);
        System.out.println(list);
        long initialTime = System.currentTimeMillis();
        abstractSorter.sort(integerDataSetGenerator.getComparator(),list);
        long endTime = System.currentTimeMillis() - initialTime;
        System.out.println(list);
        System.out.println("Time: " +endTime + " Miliseconds");
        listener.getGreaterCounter();
        listener.getSwapCounter();


    }

    public void testQuickCut(Quicksort_Cutoff sorter,int lenght){
        IntegerDataSetGenerator integerDataSetGenerator = new IntegerDataSetGenerator();
        List list = integerDataSetGenerator.createRandom(lenght);
        IntegerListener listener = new IntegerListener();
        IntegerListener listener2 = new IntegerListener();
        sorter.addSorterListener(listener);
        sorter.getInsertionSort().addSorterListener(listener2);
        System.out.println(list);
        long initialTime = System.currentTimeMillis();
        sorter.sort(integerDataSetGenerator.getComparator(),list);
        long endTime = System.currentTimeMillis() - initialTime;
        System.out.println(list);
        System.out.println("Time: " +endTime + " Miliseconds");
        listener.getGreaterCounter();
        listener.getSwapCounter();
        System.out.println("..---------..");
        listener2.getGreaterCounter();
        listener2.getSwapCounter();


    }
}
