package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.CheckedOutputStream;
public class Main {

    public static void main(String[] args) {
        public static void main(String[] args) {

            Furniture.setVATpercentage(14);

            Furniture Desk = new Furniture("Desk", 10);
            Furniture Chair = new Furniture("Chair", 6);
            Furniture Board = new Furniture("Blackboard", 12);
            Furniture Carpet = new Furniture("Blue Carpets", 14);

            ArrayList<Furniture> teachersRoom = new ArrayList(Arrays.asList(Chair));
            ArrayList<Furniture> classroomFurniture = new ArrayList(Arrays.asList(Desk, Chair));
            ArrayList<Furniture> auditorium = new ArrayList(Arrays.asList(Desk, Chair, Board));
            ArrayList<Furniture> detention = new ArrayList(Arrays.asList(Desk, Chair, Board, Carpet));

            new Room(classroomFurniture, 20);
            new Room(teachersRoom, 15);
            new Room(detention, 10);

            House.CreateHouse("117 Parker Rd. Maplewood, NJ");


        }
    }
}
