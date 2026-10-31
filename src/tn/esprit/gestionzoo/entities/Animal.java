package tn.esprit.gestionzoo.entities;

public class Animal {


          private  String name;
          private String family;
          private int age;
          private boolean isMammal;

          public String getName()
          {
              return  name;
          }
          public String getFamily()
          {
              return family;
          }
          public int getAge()
          {
              return age;
          }
          public boolean getMammal()
          {
              return isMammal;
          }

    public void setAge(int age) {
              if(age <= 0)
              {
                  System.out.println("l age ne peut pas etre négative");
              }
              else
              {
                  this.age = age;

              }

    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
          public  String toString()
          {
              return "tn.esprit.gestionzoo.entities.Animal :"+name+"family :" + family + "age :" + age+ "is mamal :" +isMammal;
          }

          public Animal(String name,String family,int age,boolean isMammal)
          {
              this.name=name;
              this.family=family;
              this.age=age;
              this.isMammal=isMammal;
          }


    public static class Zoo {

            Animal[] animals= new Animal[25];
            private String name;
            private String city;
            private final int nbrCages=25;
             int animalCount=0;

            public String getname()
            {
                    return name;
            }
            public String getcity()
            {
                    return city;
            }
            public void setname(String name)
            {
                    if(name.equals(""))
                    this.name=name;
            }
            public int getnbrCges()
            {
                    return nbrCages;
            }


            public void setCity(String city) {
                    this.city = city;
            }

            public  Zoo(String name, String city)
            {
                    this.name=name;
                    this.city=city;
            }
            void displayZoo()
            {
                    System.out.println("le nom du zoo est "+name+"la ville est"+city+"le nombre de cages est"+nbrCages);
            }
            @Override
            public String toString()
            {
                    return "tn.esprit.gestionzoo.entities.Animal.Zoo " + name + " à " + city + " (" + nbrCages + " cages)";

            }
            boolean addAnimal(Animal animal) {
                    if (searchAnimal(animal) == -1 && animals.length > animalCount)
                    {
                            animals[animalCount] = animal;
                            animalCount++;
                            System.out.println("ajout avec succées");
                            return true;

                    }
                    System.out.println("ajout échouée");
                    return false;
            }
            void afficherAnimal()
            {
                    for (int i=0;i<animalCount;i++)
                    {
                            System.out.println( animals[i]);
                    }
            }
            int searchAnimal(Animal animal)
            {
                    for(int i=0 ;i<animalCount;i++)
                    {
                            if(animal.getName().equals(animals[i].getName()))
                            {
                                    System.out.println("animal trouvée ");
                                    return i;
                            }

                    }
                    System.out.println("animal non trouvée");
                    return -1;
            }
            boolean removeAnimal(Animal animal)
            {
                    if(searchAnimal(animal)==-1)
                    {
                            System.out.println("suppression échouée");
                            return  false;
                    }
                    if(searchAnimal(animal) !=-1) {
                            for (int i = 0; i < animalCount; i++) {
                                    animals[i] = animals[i + 1];

                            }
                            animals[animalCount - 1] = null;
                            animalCount--;
                    }


                    System.out.println("supprission avec succées");
                    return  true;
            }
            boolean iszooFull()
            {
                    if(animalCount==nbrCages)
                    {
                            System.out.println("le zoo est full");
                            return true;
                    }
                    System.out.println("le zoo n'est pas plein");
                    return false;
            }
            Zoo comparerZoo(Zoo z1, Zoo z2)
            {
                    if(iszooFull()==true)
                    {
                            if(z1.animalCount>=z2.animalCount)
                            {
                                    System.out.println("le z1 contient plus d 'animaux que le z2");
                                    return z1;
                            }

                    }

                        System.out.println("le z2 contient plus d'animaux que le z1");
                        return z2;

            }

    }
}
