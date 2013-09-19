package anaydis.sort.gui;

import anaydis.animation.sort.gui.Main;

/**
 * Created with IntelliJ IDEA.
 * User: Federico F. Favale
 * Date: 10/09/13
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public class GUI {

    public static void main(String[] args) {
        Main.animate(new SorterProviderImpl());
    }
}
