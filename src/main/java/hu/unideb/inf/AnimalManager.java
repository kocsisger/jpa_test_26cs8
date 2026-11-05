package hu.unideb.inf;

public class AnimalManager {
    private static AnimalDAO animalDAO;

    public static void setAnimalDAO(AnimalDAO animalDAO) {
        AnimalManager.animalDAO = animalDAO;
    }

    public static void manageAnimals(){
        Animal animal = new Animal("Cápa", 400, Animal.GenderType.MALE);
        Animal animal2 = new Animal("Párduc", 5, Animal.GenderType.FEMALE);

        //animalDAO.saveAnimal(animal);
        //animalDAO.saveAnimal(animal2);

        Zoo zoo = new Zoo();
        zoo.setName("Debrecen Zoo");

        zoo.getAnimals().add(animal);
        zoo.getAnimals().add(animal2);

        animalDAO.saveZoo(zoo);
    }
}
