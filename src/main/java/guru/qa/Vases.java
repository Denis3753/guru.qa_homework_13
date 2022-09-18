package guru.qa;

import java.util.ArrayList;

public class Vases {

    ArrayList<String> vases = new ArrayList<>();

    public void addVase(String vase){
        if(!vases.contains(vase)) {
            vases.add(vase);
        }
    }

    public void removeVase(String name){
        vases.remove(name);
    }

    public void removeAllVase(){
        while(!vases.isEmpty()){
            vases.removeAll(vases);
        }
    }

    public void printAllVases(){
        for(String vase : vases){
            System.out.println("Ваза: " + vase);
        }
    }
}
