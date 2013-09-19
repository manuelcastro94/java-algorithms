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

    public Quicksort_Cutoff() {
        super(SorterType.QUICK_CUT);
        insertionSort = new InsertionSort();
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(list,comparator,0,list.size()-1,14);
        insertionSort.sort(comparator,list);
    }

    private <T> void sort(List<T> l,Comparator<T> comparator,int lo, int hi,int m){
        if(hi-lo<=m){
            return;
        }
        int i = partition(l,comparator,lo,hi);
        sort(l,comparator,lo,i-1,m);
        sort(l,comparator,i+1,hi,m);

    }

    public InsertionSort getInsertionSort(){
        return insertionSort;
    }
}
