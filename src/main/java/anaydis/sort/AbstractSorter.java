package anaydis.sort;

import anaydis.sort.gui.ObservableSorter;
import anaydis.sort.gui.SorterListener;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class AbstractSorter implements Sorter, ObservableSorter {

    private final SorterType type;
    private final List<SorterListener> listeners;

    protected AbstractSorter(SorterType type) {
        this.type = type;
        this.listeners = new ArrayList<SorterListener>();
    }

    @NotNull
    @Override
    public SorterType getType() {
        return type;
    }

    @Override
    public void addSorterListener(SorterListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeSorterListener(SorterListener listener) {
         listeners.remove(listener);
    }

    protected <T> void swap(List<T> list, int i, int j){
        for(SorterListener listener:listeners){
            listener.swap(i,j);
        }
        T t = list.get(i);
        list.set(i,list.get(j));
        list.set(j,t);
    }

    protected <T> boolean greater(Comparator<T> c,List<T> list, int i, int j){
        for(SorterListener listener:listeners){
            listener.greater(i,j);
        }
        return c.compare(list.get(i),list.get(j))>0;
    }




}
