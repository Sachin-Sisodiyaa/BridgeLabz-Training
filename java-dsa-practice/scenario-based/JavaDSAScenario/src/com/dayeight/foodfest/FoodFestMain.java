/*7. FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values*/




package com.dayeight.foodfest;

import java.util.ArrayList;

public class FoodFestMain {

    public static void main(String[] args) {

        ArrayList<Stall> zoneA = new ArrayList<>();
        zoneA.add(new Stall("BurgerHub", "Zone A", 120));
        zoneA.add(new Stall("PizzaPoint", "Zone A", 180));
        zoneA.add(new Stall("TacoTown", "Zone A", 250));

        ArrayList<Stall> zoneB = new ArrayList<>();
        zoneB.add(new Stall("NoodleBox", "Zone B", 110));
        zoneB.add(new Stall("RollCorner", "Zone B", 200));
        zoneB.add(new Stall("IceCreamLab", "Zone B", 260));

        ArrayList<Stall> zoneC = new ArrayList<>();
        zoneC.add(new Stall("ChaatExpress", "Zone C", 90));
        zoneC.add(new Stall("DosaPlaza", "Zone C", 170));
        zoneC.add(new Stall("CoffeeStop", "Zone C", 300));

        ArrayList<Stall> masterList = new ArrayList<>();
        masterList.addAll(zoneA);
        masterList.addAll(zoneB);
        masterList.addAll(zoneC);

        MergeSort.mergeSort(masterList, 0, masterList.size() - 1);

        System.out.println("Stall Name\tZone\tFootfall");
        System.out.println("---------------------------------");
        for (Stall s : masterList) {
        	System.out.printf("%-15s %-10s %d%n", s.stallName, s.zone, s.footfall);
        }
    }
}

