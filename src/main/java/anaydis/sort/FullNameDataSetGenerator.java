package anaydis.sort;

import anaydis.sort.data.DataSetGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 28/08/13
 * Time: 00:33
 * To change this template use File | Settings | File Templates.
 */
public class FullNameDataSetGenerator implements DataSetGenerator<String> {

    private final List<String> fnameDictionary;
    private final List<String> lnameDictionary;

    public FullNameDataSetGenerator()
    {
        fnameDictionary = initFirstNameDictionary();
        lnameDictionary = initLastNameDictionary();
    }

    @NotNull
    @Override
    public List createAscending(int length) {

        if(length > fnameDictionary.size()) {
            throw new IllegalArgumentException("Ojo! StringDataSetGenerator " +
                    "puede generar valores HASTA un length de " + fnameDictionary.size());
        }

        final List<FullName> copy = new ArrayList<FullName>();
        for(int i = 0;i<length;i++){
            int random1 = (int)(Math.random()* lnameDictionary.size());
            int random2 = (int)(Math.random()* fnameDictionary.size());

            copy.add(i,new FullName(fnameDictionary.get(random2), lnameDictionary.get(random1)));
        }
        return copy;

    }

    @NotNull
    @Override
    public List createDescending(int length) {
        final List<FullName> copy = createAscending(length);
        Collections.reverse(copy);
        return copy;

    }

    @NotNull
    @Override
    public List createRandom(int length) {
        final List<FullName> copy = createAscending(length);

        Collections.shuffle(copy);

        return copy;
    }

    @NotNull

    public Comparator getComparator() {
         return STRING_COMPARATOR;
    }

    private List<String> initFirstNameDictionary()
    {
        return  Arrays.asList("PAULA","DIEGO","DIEGO");
    }

    private List<String> initLastNameDictionary(){

         return Arrays.asList("ALONSO","DIAZ","ALONSO");

    }

    private static final Comparator<String> STRING_COMPARATOR = new Comparator<String>(){

        public int compare(String a, String b)
        {
            return a.compareTo(b);
        }
    };

}





