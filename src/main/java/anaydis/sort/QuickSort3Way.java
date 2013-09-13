package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 12/09/13
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort3Way extends AbstractSorter {

    public QuickSort3Way() {
        super(SorterType.QUICK_THREE_PARTITION);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(list,comparator,0,list.size()-1);
    }

    private <T> void sort(List<T> l,Comparator<T> comparator,int lo, int hi){
        if(hi<=lo){
            return;
        }
        int lt = lo;
        int i = lo+1;
        int gt = hi;
        T t = l.get(lo);
        while(i<=gt){
            int cmp =comparator.compare(l.get(i),t);
            if(cmp<0){
                swap(l,lt++,i++);
            }else if(cmp>0){
                swap(l,i,gt--);
            }else{
                i++;
            }
        }
        sort(l, comparator, lo, lt-1);
        sort(l,comparator,gt+1,hi);
    }

}
