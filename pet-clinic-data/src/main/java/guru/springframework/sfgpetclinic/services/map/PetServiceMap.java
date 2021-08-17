package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet,Long>  {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

}
