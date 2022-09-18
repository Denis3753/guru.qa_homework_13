package guru.qa;

public class ArtGallery {
    public static void main(String[] args) {

        Vases vase = new Vases();
        vase.addVase("Динос");
        vase.addVase("Килик");

        Paintings paintings = new Paintings();
        paintings.addPicture("Леонардо да Винчи", "Мона Лиза");
        paintings.addPicture("Сальвадор Дали", "Постоянство памяти");


        Sculptures sculptures = new Sculptures();
        sculptures.addSculpture("Шагающий человек");
        sculptures.addSculpture("Давид");

        sculptures.deleteSculpture("Давид");
        sculptures.printSculptures();

        boolean res = paintings.hasPicture("Сальвадор Дали", "Постоянство памяти");
        System.out.println(res);

        vase.printAllVases();



    }

}
