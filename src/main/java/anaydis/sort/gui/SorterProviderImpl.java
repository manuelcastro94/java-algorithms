package anaydis.sort.gui;

import anaydis.sort.*;

import anaydis.sort.provider.SorterProvider;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Federico F. Favale
 * Date: 10/09/13
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
public class SorterProviderImpl implements SorterProvider {

    private Map<SorterType, Sorter> sorters;

    public SorterProviderImpl() {
        sorters = new EnumMap<SorterType, Sorter>(SorterType.class);
        addSorter(new SelectionSort());
        addSorter(new InsertionSort());
        addSorter(new BubbleSort());
        addSorter(new HSort());
        addSorter(new Shellsort_extending());
        addSorter(new QuickSort());
        addSorter(new Quicksort_Cutoff());
        addSorter(new QuicksortNR());
        addSorter(new QuickMedianOfThree());
        addSorter(new QuickSort3Way());
        addSorter(new MergeTopDown());
        //addSorter(new MergeBottomUp());
    }

    private Sorter addSorter(Sorter sorter){
        return sorters.put(sorter.getType(),sorter);
    }

    @NotNull
    @Override
    public Sorter getSorterForType(@NotNull SorterType type) {
        return sorters.get(type);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public Iterable<Sorter> getAllSorters() {
        return sorters.values();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
