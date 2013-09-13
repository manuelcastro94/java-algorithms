package anaydis.sort.tp2;

import anaydis.sort.data.DataSetGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 27/08/13
 * Time: 11:13
 * To change this template use File | Settings | File Templates.
 */
public class IntegerDataSetGenerator implements DataSetGenerator {


    @NotNull
    @Override
    public List createAscending(int length) {
        List list = new ArrayList();
        for(int i = 0;i<length;i++){
            list.add(i);
        }
        return list;
    }

    @NotNull
    @Override
    public List createDescending(int length) {
        List list = new ArrayList();
        for(int i = length-1;i>=0;i--){
            list.add(i);
        }
        return list;
    }

    @NotNull
    @Override
    public List createRandom(int length) {
        List list = new ArrayList();
        for(int i = 0;i<length;i++){
            list.add(i,(int)(Math.random()*10));
        }
        return list;
    }

    @NotNull
    @Override
    public Comparator getComparator() {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i,Integer j) {
               return i-j;
            }
        };

        return comp;
    }
}
