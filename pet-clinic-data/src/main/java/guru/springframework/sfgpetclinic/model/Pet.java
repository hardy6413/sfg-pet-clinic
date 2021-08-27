package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private PetType petType;
    private Owner owner;
    private LocalDate birthtime;
    private String name;


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(LocalDate birthtime) {
        this.birthtime = birthtime;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
