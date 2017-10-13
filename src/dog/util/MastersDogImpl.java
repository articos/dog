package dog.util;

import dog.dto.Master;

public class MastersDogImpl implements MastersDog {
    @Override
    public void older(Master master) {

    }

    @Override
    public void nameOfDog(Master master) {

        System.out.println(master.getDog().getName());

    }
}
