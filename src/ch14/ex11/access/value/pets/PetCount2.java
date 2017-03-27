package ch14.ex11.access.value.pets;

import lib.utils.MapData;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by V1 on 09-Mar-17.
 */
public class PetCount2 extends LinkedHashMap<Class<? extends Pet>, Integer> { // полностью работает как HashMap<String,Integer>


    public PetCount2() {
        super(MapData.get(PetNameL.alltypes, 0));   // создать пустую карту с расширением до размера
    }

    private void count(Pet pet) {               // так класс наследует
        for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()) {
            if (entry.getKey().isInstance(pet)) {
                put(entry.getKey(), entry.getValue() + 1);
            }
        }
    }
        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()) {
                sb.append(entry.getKey().getSimpleName());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append("}");
            return sb.toString();
        }


    public void countPet(List<Pet> pets) {
        for (Pet pet : pets) {
            count(pet);
        }
    }

    public void countPet(PetMake pm) {
        for (Pet pet : pm.getArray(20)) {
            count(pet);
        }

    }


}
