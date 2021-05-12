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
        Tanks tank1 = new Tanks(1);
        Tanks tank2 = new Tanks(2);
        Tanks tank3 = new Tanks(3);
        Tanks tank4 = new Tanks(4);
        Tanks tank5 = new Tanks(5);
        tanksList.add(tank1);
        tanksList.add(tank2);
        tanksList.add(tank3);
        tanksList.add(tank4);
        tanksList.add(tank5);
        Assert.isTrue(CreateUniqueListFromList.sortTank(tanksList).size() == 5);
    }

    @Test
    void sortTankSingleDuplicate() {
        List<Tanks> tanksList = new ArrayList<>();
        Tanks tank1 = new Tanks(1);
        Tanks tank2 = new Tanks(2);
        Tanks tank3 = new Tanks(3);
        Tanks tank4 = new Tanks(3);
        Tanks tank5 = new Tanks(5);
        tanksList.add(tank1);
        tanksList.add(tank2);
        tanksList.add(tank3);
        tanksList.add(tank4);
        tanksList.add(tank5);
        Assert.isTrue(CreateUniqueListFromList.sortTank(tanksList).size() == 4);
    }
}