package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * public static void sort(Comparable[] a)
 {
 int N = a.length;
 for (int i = 0; i < N; i++)
 {
 for (int j = i; j > 0; j--)
 {
 if (less(a[j], a[j-1]))
 { exch(a, j, j-1);}
 else
 {break;}
 }
 }

 }
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort extends AbstractSorter {

    protected InsertionSort() {
        super(SorterType.INSERTION);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {

        int n = list.size();
        for(int i = 0;i<n;i++){
            for(int j = i;j>0;j--){
                if(greater(comparator,list,j-1,j)){
                    swap(list,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
}
