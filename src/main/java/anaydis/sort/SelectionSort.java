package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 24/08/13
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSort extends AbstractSorter {

    public SelectionSort() {
        super(SorterType.SELECTION);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        int n = list.size();
        for(int i = 0;i<n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(greater(comparator,list,min,j)){
                    min = j;
                }
            }
            swap(list,i,min);
        }
    }
}
