package anaydis.sort;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 27/08/13
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class Listener implements SorterListener {

    private int greaterCounter;
    private int swapCounter;

    public Listener(){
        greaterCounter = 0;
        swapCounter = 0;
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
        return greaterCounter;
    }

    public int getSwapCounter(){
        return swapCounter;
    }
}
