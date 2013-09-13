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
public class MergeTopDown extends AbstractSorter implements Sorter {

    public <T> MergeTopDown() {
        super(SorterType.MERGE);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
    }
}
