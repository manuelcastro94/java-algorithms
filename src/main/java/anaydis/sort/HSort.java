package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 03/09/13
 * Time: 10:21
 * To change this template use File | Settings | File Templates.
 */
public class HSort extends AbstractSorter {

    public HSort() {
        super(SorterType.H);
    }

    public HSort(SorterType type){
        super(type);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(comparator, list,1);
    }

    protected <T> void sort(Comparator<T> c , List<T> l,int h){

        for(int i = h;i<l.size();i++){
            for(int j = i;j>=h;j-=h){
                if(greater(c,l,j-h,j)){
                    swap(l,j,j-h);
                }else{
                    break;
                }
        }

    }
  }
}
