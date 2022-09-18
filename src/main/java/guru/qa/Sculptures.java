package guru.qa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sculptures {

    public Set<String> names = new HashSet<>();

    public void addSculpture(String sculpture){
        names.add(sculpture);
    }

    public void deleteSculpture(String name){
        for(String s : names){
            if(s.equals(name)) names.remove(s);
        }
    }

    public void printSculptures(){
        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }

}
