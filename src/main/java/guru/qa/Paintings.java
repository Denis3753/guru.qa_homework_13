package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class Paintings {

    Map<String, String> pictures = new HashMap<>();

    public void addPicture(String author,String namePicture){
        pictures.put(author,namePicture);
    }

    public void removePicture(String author){
        pictures.remove(author);
    }

    public void printAllPictures(){
        for(Map.Entry<String,String> entry : pictures.entrySet()){
            System.out.println("Художник: " + entry.getKey() + ", произведение: " + entry.getValue());
        }
    }

    public boolean hasPicture(String author, String namePicture){
        for(Map.Entry<String,String> entry : pictures.entrySet()) {
            if(entry.getKey().equals(author) && entry.getValue().equals(namePicture)){
                return true;
            }
        }
        return false;
    }
}
