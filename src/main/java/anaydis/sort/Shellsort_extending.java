package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 07/09/13
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
public class Shellsort_extending extends HSort implements Sorter{

    private SorterType sorterType;

    public Shellsort_extending() {
        super(SorterType.SHELL);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {

        int hs[] = {16577,4193,1073,281,77,23,8,1};
        //int hs[] = {1,4,13,40,121,364,1093,3280,9841}
        for(int k = 0;k<hs.length;k++){
            int h = hs[k];
            if(h>=1){
                sort(comparator, list,h);

            }
        }
    }

}
