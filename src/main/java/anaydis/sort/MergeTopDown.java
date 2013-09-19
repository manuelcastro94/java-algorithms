package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 12/09/13
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */
public class MergeTopDown extends AbstractMergeSorter implements Sorter {

    public <T> MergeTopDown() {
        super(SorterType.MERGE);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(comparator, list,0,list.size()-1);
    }

    private <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list,int lo, int hi){

        if(hi<=lo){
            return;
        }
        int med = lo+(hi-lo)/2;
        sort(comparator,list,lo,med);
        sort(comparator,list,med+1,hi);
        super.merge(comparator,list,lo,med,hi);

    }

}
