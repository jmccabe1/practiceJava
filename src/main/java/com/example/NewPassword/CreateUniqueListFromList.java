package com.example.NewPassword;

import java.util.ArrayList;
import java.util.List;

public class CreateUniqueListFromList {
    public static List<Tanks> sortTank(List<Tanks> tanks) { //Primary method for creating a unique list used here
        List<Tanks> tank2 = new ArrayList<Tanks>(); //This list will be the list of unique instances we return at the end
        for (Tanks tanks1 : tanks) {
            Boolean isDuplicate = false;//This will help determine whether an instance in tanks1 needs to go into tanks2. It's false for now because it needs to catch the first instance in tanks1
            for (Tanks testingTanks : tank2){//The first time this iterates there won't be anything to compare tanks1 against which will automatically mean the first one is put into tank2
                if (tanks1.id == testingTanks.id){
                    isDuplicate = true;//If this instance of Tank is found again in tank2, it's marked as a duplicate
                }//We never give the option to switch isDuplicate to false because if any of the comparisons are true we discard the tanks1 instance outright
            }
            if (isDuplicate){
                continue; //If that instance was the same as any of the ones in tank2 we've already determined are unique, we ignore that instance and keep moving
            }
            else tank2.add(tanks1); //If we couldn't find that instance already, it's unique and we add it to the list of instances that are known to be unique
        }
        return tank2; //By the time we get to here, tank2 should be filled with only unique instances. We can safely return this.
    }

    public static List<Tanks> sortTankStream(List<Tanks> tanks) {//This does the same thing as sortTank but uses a stream filter for it instead of the Hard Way
        List<Tanks> tank2 = new ArrayList<Tanks>();//We will return this at the end as the list of unique objects
        for (Tanks tanks1 : tanks) {
            Boolean isDuplicate = false;//This will help us determine whether the object from tanks is unique
            if (tank2.stream().filter(oneTank -> oneTank.id == tanks1.id).count() != 0) { //With stream, we don't have to do that nonsense with a second foreach loop to test each one of the confirmed unique instances
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
