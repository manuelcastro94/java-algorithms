package anaydis.sort.tp4;

import anaydis.sort.*;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 12/09/13
 * Time: 11:10
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        TestSorterTypes testSorterTypes = new TestSorterTypes();
        testSorterTypes.testRandom(new MergeTopDown(),6);
    }
}
