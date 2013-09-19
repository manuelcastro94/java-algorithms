package anaydis.sort;

import com.sun.org.apache.xml.internal.utils.IntStack;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 13/09/13
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
public class QuicksortNR extends QuickSort implements Sorter {

    public QuicksortNR(){
        super(SorterType.QUICK_NON_RECURSIVE);
    }

    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(list,comparator,0,list.size()-1);
    }

    private <T> void sort(Comparator<T> comparator,List<T> list,int l,int h){
        IntStack intStack = new IntStack(50);
        intStack.push(l);
        intStack.push(h);
        while(!intStack.empty()){
            h=intStack.pop();
            l=intStack.pop();
            if(h<=1){
                continue;
            }
            int i = partition(list,comparator,l,h);
            if(i-1>h-1){
                intStack.push(l);
                intStack.push(i-1);
            }
            intStack.push(i+1);
            intStack.push(h);
            if(h-i>=i-1){
                intStack.push(l);
                intStack.push(i-1);
            }
        }

    }



}
