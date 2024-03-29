package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu    lista de h! la imp
 * Date: 03/09/13
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public class Shellsort extends AbstractSorter {

    private HSort hSort;

    public Shellsort() {
        super(SorterType.SHELL);
        hSort = new HSort();
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        int n = list.size();
        int hs[] = {9841,3280,1093,364,121,40,13,4,1};
        for(int k = 0;k<hs.length;k++){
            int h = hs[k];
            if(h>=1){
                hSort.sort(comparator, list,h);
            }

        }
    }

    public HSort gethSort(){
        return hSort;
    }

}
