package anaydis.sort;

import com.sun.org.apache.xml.internal.utils.IntStack;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 13/09/13
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
public class QuicksortNR extends QuickSort implements Sorter {

    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {

    }

    private <T> void sort(Comparator<T> comparator,List<T> list,int l,int h){
        IntStack intStack = new IntStack(50);

    }



}
