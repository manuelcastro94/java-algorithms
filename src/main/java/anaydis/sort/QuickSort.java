package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 03/09/13
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort extends AbstractSorter implements Sorter {

    public QuickSort() {
        super(SorterType.QUICK);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(list,comparator,1,list.size()-1);
    }

    private <T> int partition(List<T> l,Comparator<T> comparator,int lo, int hi){
        int i = lo-1;
        int j = hi;
        while(true){

            while(greater(comparator,l,lo,i++)) if(i==hi) break;
            while(greater(comparator,l,j,lo)) if(j==lo) break;
            if(i>=j) break;
            swap(l,i,j);
        }
        swap(l,lo,j);
        System.out.println(l);


        return j;


    }
    private <T> void sort(List<T> l,Comparator<T> comparator,int lo, int hi){
        if(hi<=lo) return;
        int i = partition(l,comparator,lo,hi);

        sort(l, comparator, lo, i - 1);
        sort(l,comparator,i+1,hi);
    }

}
