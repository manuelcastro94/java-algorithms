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
        int h = 10;
        while (h<n/3) h = 3*h+1;
        while (h>=1){
            hSort.sort(comparator,list,h);
            h = h/3;
        }

    }
}
