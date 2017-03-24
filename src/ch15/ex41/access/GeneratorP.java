package ch.ex41.access;

import lib.pets.Pet;
import lib.pets.Pets;
import lib.utils.IGenerator;

/**
 * Created by V1 on 23.03.2017.
 */
public class GeneratorP implements IGenerator{

    @Override
    public Pet next() {
        return Pets.randomPet();
    }
}
