package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals = new Animal[25];
    private String name;
    private String city;
    private final int nbrCages = 25;
    int animalCount = 0;

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = name;
        }

    }

    public int getNbrCages() {
        return 25;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("le nom du zoo est " + this.name + "la ville est" + this.city + "le nombre de cages est25");
    }

    public String toString() {
        return "Zoo " + this.name + " à " + this.city + " (25 cages)";
    }

     public boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal) == -1 && this.animals.length > this.animalCount) {
            this.animals[this.animalCount] = animal;
            ++this.animalCount;
            System.out.println("ajout avec succées");
            return true;
        } else {
            System.out.println("ajout échouée");
            return false;
        }
    }

    public void afficherAnimal() {
        for(int i = 0; i < this.animalCount; ++i) {
            System.out.println(this.animals[i]);
        }

    }

    public int searchAnimal(Animal animal) {
        for(int i = 0; i < this.animalCount; ++i) {
            if (animal.getName().equals(this.animals[i].getName())) {
                System.out.println("animal trouvée ");
                return i;
            }
        }

        System.out.println("animal non trouvée");
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        if (this.searchAnimal(animal) == -1) {
            System.out.println("suppression échouée");
            return false;
        } else {
            if (this.searchAnimal(animal) != -1) {
                for(int i = 0; i < this.animalCount; ++i) {
                    this.animals[i] = this.animals[i + 1];
                }

                this.animals[this.animalCount - 1] = null;
                --this.animalCount;
            }

            System.out.println("supprission avec succées");
            return true;
        }
    }

    public boolean iszooFull() {
        if (this.animalCount == 25) {
            System.out.println("le zoo est full");
            return true;
        } else {
            System.out.println("le zoo n'est pas plein");
            return false;
        }
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (this.iszooFull() && z1.animalCount >= z2.animalCount) {
            System.out.println("le z1 contient plus d 'animaux que le z2");
            return z1;
        } else {
            System.out.println("le z2 contient plus d'animaux que le z1");
            return z2;
        }
    }
}
