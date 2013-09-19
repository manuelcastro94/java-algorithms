package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 19/09/13
 * Time: 00:05
 * To change this template use File | Settings | File Templates.
 */
public class AbstractMergeSorter extends AbstractSorter  {

    public AbstractMergeSorter(SorterType type) {
        super(type);
    }

    protected <T> void merge(@NotNull Comparator<T> comparator, @NotNull List<T> list,int lo,int med, int hi){
        if(lo<hi){
            List<T> aux = new ArrayList<T>();
            for(int i = lo;i<=med;i++){
                aux.add(list.get(i));
            }
            for(int j = med+1;j<=hi;j++){
                aux.add(list.get(hi-j+med+1));
            }
            int i = 0;
            int j = hi - lo;
            for(int k = lo;k<=hi;k++){
                if(!greater(comparator,aux,i,j)){
                    list.set(k,aux.get(i));
                    i++;
                }else{
                    list.set(k,aux.get(j));
                    j--;
                }
            }

        }
    }


    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
