package anaydis.sort.tp2;

/**
 * Created with IntelliJ IDEA.
 * User: Manu
 * Date: 27/08/13
 * Time: 23:21
 * To change this template use File | Settings | File Templates.
 */
public class FullName {

    private String firstname;
    private String lastname;

    public FullName(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }

    @Override
    public String toString() {
        return  firstname +" "+ lastname;

    }
}
