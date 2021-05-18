package com.example.NewPassword;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateUniqueListFromListTest {

    @Test
    void sortTank() {
        List<Tanks> tanksList = new ArrayList<>();
        Tanks tank1 = new Tanks(1);//Manually creating each instance and adding it to the list to be tested is annoying, but nothing worth doing is easy
        Tanks tank2 = new Tanks(2);//That said, I'm very much on the lookout for a way to automate this
        Tanks tank3 = new Tanks(3);
        Tanks tank4 = new Tanks(4);
        Tanks tank5 = new Tanks(5);
        tanksList.add(tank1);
        tanksList.add(tank2);
        tanksList.add(tank3);
        tanksList.add(tank4);
        tanksList.add(tank5);
        Assert.isTrue(CreateUniqueListFromList.sortTank(tanksList).size() == 5);//It's easier to test the expected size of the unique list given the input than it is to test whether the unique list has the objects you expect it to have
    }

    @Test
    void sortTankSingleDuplicate() {
        List<Tanks> tanksList = new ArrayList<>();
        Tanks tank1 = new Tanks(1);
        Tanks tank2 = new Tanks(2);
        Tanks tank3 = new Tanks(3);
        Tanks tank4 = new Tanks(3);//Number serves as the object's ID and is the only attribute of these objects, so repeating one should flag it as a duplicate and not unique
        Tanks tank5 = new Tanks(5);
        tanksList.add(tank1);
        tanksList.add(tank2);
        tanksList.add(tank3);
        tanksList.add(tank4);
        tanksList.add(tank5);
        Assert.isTrue(CreateUniqueListFromList.sortTank(tanksList).size() == 4);//tank4 is expected to be discarded since it's the esame as tank3, and thus there will only be four unique instances
    }
}