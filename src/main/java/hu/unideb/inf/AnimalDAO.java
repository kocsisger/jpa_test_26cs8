package hu.unideb.inf;

import java.util.List;

public interface AnimalDAO {
    //C
    public void saveAnimal(Animal a);

    //R
    public List<Animal> getAllAnimals();

    //U
    public void updateAnimal();

    //D
    public void deleteAnimal();
}
