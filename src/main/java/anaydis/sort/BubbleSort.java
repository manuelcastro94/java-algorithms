package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 24/08/13
 * Time: 17:27
 * public class Bubble {

 public static void sort(Comparable[] a)

 {

 int N = a.length;

 for (int i = l; i < N-1; i++){

 for (int j = N-1; j > i; j--){

 }

 }

 }
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort extends AbstractSorter implements Sorter {

    protected BubbleSort() {
        super(SorterType.BUBBLE);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {

        for(int i = 0;i<list.size();i++){
            for(int j = list.size()-1;j>i;j--){
                if(greater(comparator,list,j-1,j)){
                    swap(list,j-1,j);
                }
            }
        }
    }
}
