package com.example.NewPassword;

import java.util.ArrayList;
import java.util.List;

public class CreateUniqueListFromList {
    public static List<Tanks> sortTank(List<Tanks> tanks) {
        List<Tanks> tank2 = new ArrayList<Tanks>();
        for (Tanks tanks1 : tanks) {
            Boolean isDuplicate = false;
            for (Tanks tanks2 : tank2){
                if (tanks1.id == tanks2.id){
                    isDuplicate = true;
                }
            }
            if (isDuplicate){
                continue;
            }
            else tank2.add(tanks1);
        }
        return tank2;
    }

    public static List<Tanks> sortTankStream(List<Tanks> tanks) {
        List<Tanks> tank2 = new ArrayList<Tanks>();
        for (Tanks tanks1 : tanks) {
            Boolean isDuplicate = false;
           /* for (Tanks tanks2 : tank2){
                if (tanks1.id == tanks2.id){
                    isDuplicate = true;
                }
            }*/
            if (tank2.stream().filter(oneTank -> oneTank.id == tanks1.id).count() != 0) {
                isDuplicate = true;
            }
            if (isDuplicate){
                continue;
            }
            else tank2.add(tanks1);
        }
        return tank2;
    }
}
