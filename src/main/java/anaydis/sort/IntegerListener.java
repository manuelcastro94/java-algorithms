package anaydis.sort;

import anaydis.sort.gui.SorterListener;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 27/08/13
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class IntegerListener implements SorterListener {

    private int greaterCounter;
    private int swapCounter;

    public IntegerListener(){
        greaterCounter = 0;
        swapCounter = 0;
    }

    @Override
    public void box(int from, int to) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copy(int from, int to, boolean copyToAux) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void equals(int i, int j) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void greater(int i, int j) {
        greaterCounter++;
    }

    @Override
    public void swap(int i, int j) {
        swapCounter++;
    }

    public int getGreaterCounter(){
        System.out.println("Greater: " + greaterCounter);
        return greaterCounter;
    }

    public int getSwapCounter(){
        System.out.println("Swaps: " + swapCounter);
        return swapCounter;
    }
}
