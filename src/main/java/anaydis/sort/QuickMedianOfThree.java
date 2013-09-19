package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 15/09/13
 * Time: 01:13
 * To change this template use File | Settings | File Templates.
 */
public class QuickMedianOfThree extends QuickSort {

    public QuickMedianOfThree() {
        super(SorterType.QUICK_MED_OF_THREE);

    }
    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(list,comparator,0,list.size()-1);
    }

    protected <T> void sort(List<T> list,Comparator<T> comparator,int lo, int hi){
        if(hi<=lo){
            return;
        }
        if(greater(comparator,list,(lo+hi)/2,hi-1)){
            swap(list,(lo+hi)/2,hi-1);
        }
        if(greater(comparator,list,lo,hi-1)){
            swap(list,lo,hi-1);
        }
        if(greater(comparator,list,lo,hi)){
            swap(list,lo,hi);
        }
        if(greater(comparator,list,hi-1,hi)){
            swap(list,hi-1,hi);
        }

        int i = super.partition(list,comparator,lo+1,hi-1);
        sort(list,comparator,lo,i-1);
        sort(list,comparator,i+1,hi);

    }
}
