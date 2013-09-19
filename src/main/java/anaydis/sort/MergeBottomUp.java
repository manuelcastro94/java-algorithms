package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 19/09/13
 * Time: 00:41
 * To change this template use File | Settings | File Templates.
 */
public class MergeBottomUp extends AbstractMergeSorter {

    public MergeBottomUp() {
        super(SorterType.MERGE_BOTTOM_UP);
    }

    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list){
        int n = list.size();
        for(int sz = 1;sz<n;sz = sz+sz){
            for(int lo = 0;lo<n-sz;lo+= sz+sz ){
                super.merge(comparator,list,lo,lo+sz-1,Math.min(lo+sz+sz-1,n-1));
            }
        }
    }


}
