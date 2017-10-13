package dog;

import dog.dto.Dog;
import dog.dto.Master;
import dog.util.MastersDog;
import dog.util.MastersDogImpl;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("pudl", 1);
        Master master = new Master("Pepa", dog);


        MastersDogImpl MDUtil = new MastersDogImpl();
        MDUtil.nameOfDog(master);


    }


}
