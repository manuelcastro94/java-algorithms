package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 12/09/13
 * git pull --rebase
 * Time: 10:04
 * To change this template use File | Settings | File Templates.
 */
public class Quicksort_Cutoff extends QuickSort {

    private InsertionSort insertionSort;
    private SorterType type;

    public Quicksort_Cutoff() {
        this.type = SorterType.QUICK_CUT;
        insertionSort = new InsertionSort();
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(list,comparator,0,list.size()-1,0);
    }

    private <T> void sort(List<T> l,Comparator<T> comparator,int lo, int hi,int m){
        if(hi<=lo+m){
            insertionSort.sort(comparator,l);
            return;
        }
        super.sort(comparator,l);
    }

    public InsertionSort getInsertionSort(){
        return insertionSort;
    }
}
