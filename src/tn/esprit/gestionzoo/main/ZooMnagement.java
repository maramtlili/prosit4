package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;
public class ZooMnagement {
    public static  void main(String[] args)
    {
        /*int nbrC=20;
        String zooName="my zoo";

        System.out.println("le nombre des cages est "+nbrC+"le nom du zoo est "+zooName);*/
        int nbrC;
        String zooName;
        Scanner sc=new Scanner(System.in);
       do {
            System.out.println("donner le nombre des cages");
            nbrC = sc.nextInt();
            System.out.println("donner le nom du zoo");
            zooName = sc.next();
        }while (nbrC <= 0 || zooName.isEmpty());
       System.out.println(zooName+ "comporte" +nbrC+ "cages");

      /* tn.esprit.gestionzoo.entities.Animal lion=new tn.esprit.gestionzoo.entities.Animal();
       lion.name="simba";
       lion.age=10;
       lion.family="hhh";
       lion.isMammal=true;
       System.out.println("le nom de la nimale est"+lion.name+"l'age est"+lion.age+"la famille est"+lion.family+"il est mamifaire ou non "+lion.isMammal);

        tn.esprit.gestionzoo.entities.Animal.Zoo myZoo = new tn.esprit.gestionzoo.entities.Animal.Zoo();
        myZoo.name="my zoo";
        myZoo.nbrCages=12;
        myZoo.city="tunisie";
        myZoo.animals[0]=lion;*/
        Animal lion =new Animal("simba","felins",10,true);
        Animal panda  =new Animal("sousou","felins",12,true);
        Zoo myZoo = new Zoo("my zoo","tunisie");
        Zoo zooo = new Zoo("zooo","tunisie");
        myZoo.addAnimal(lion);
        Zoo zotopia = new Zoo("zotoo","tunisie");
        zotopia.addAnimal(panda);
        System.out.println("le nom du zoo est "+myZoo.getName()+"les nombres de cages sont"+myZoo.getNbrCages()+"la cité est "+myZoo.getCity()+"les animales sont"+myZoo.getName());
        System.out.println("le nom du zoo est "+zotopia.getName()+"les nombres de cages sont"+zotopia.getNbrCages()+"la cité est "+zotopia.getCity()+"les animales sont"+zotopia.getName());
        myZoo.displayZoo();
        System.out.println(myZoo) ;
        System.out.println(myZoo.toString()) ;
        myZoo.addAnimal(panda);
        myZoo.addAnimal(panda);
        myZoo.addAnimal(panda);
        myZoo.addAnimal(panda);
        myZoo.addAnimal(panda);
        myZoo.addAnimal(lion);
        myZoo.afficherAnimal();
        myZoo.searchAnimal(panda);
        myZoo.searchAnimal(panda);
        myZoo.searchAnimal(panda);
        myZoo.removeAnimal(lion);
        myZoo.removeAnimal(lion);
        myZoo.iszooFull();
        myZoo.comparerZoo(myZoo,zooo);


    }
    }



