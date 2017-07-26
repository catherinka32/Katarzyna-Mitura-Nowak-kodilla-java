package com.kodilla.stream.forum;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iga on 26.07.2017.
 */
public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser("Kamil",1, 'M', 17, 1986, 05, 03));
        theUserList.add(new ForumUser("Iza",2, 'F', 20, 2000, 12, 04));
        theUserList.add(new ForumUser("Maryla",3, 'F', 61, 1917, 05, 03));
        theUserList.add(new ForumUser("Emil",4, 'M', 124, 2001, 05, 03));
        theUserList.add(new ForumUser("Klara",5, 'F', 27, 1995, 05, 03));
        theUserList.add(new ForumUser("Józek",6, 'M', 87, 1980, 05, 03));
        theUserList.add(new ForumUser("Greta",7, 'F', 27, 1994, 05, 03));
        theUserList.add(new ForumUser("Antek",8, 'M', 0, 1987, 05, 03));
        theUserList.add(new ForumUser("Emila",9, 'F', 5, 1972, 05, 03));
    }
    public List <ForumUser> getList(){
        return new ArrayList<>(theUserList);
    }
}
