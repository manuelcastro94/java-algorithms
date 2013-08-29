package anaydis.sort;

import javax.swing.event.RowSorterListener;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 22/08/13
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
public interface ObservableSorter {

    void addSorterListener(SorterListener listener);
    void removeSorterListener(SorterListener listener);

}
