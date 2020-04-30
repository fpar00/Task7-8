package com.company;

import java.util.ArrayList;

public class House {
    public String address;
    public static int numberOfRooms = 0;

    private House(String address) {
        this.address = address;
    }
    public static void CreateHouse(String address) {
        new House(address);
    }

    private ArrayList<Room> roomList = new ArrayList();
    private House(String address, ArrayList<Room> roomList) {
        this.roomList = roomList;
        this.address = address;
    }

    void addRoom(Room room) {
        this.roomList.add(room);
        ++numberOfRooms;
    }

    void addRome(ArrayList<Room> addons) {
        for(int i = 0; i < addons.size(); ++i) {
            this.roomList.add((Room)addons.get(i));
            numberOfRooms = numberOfRooms + 1;
        }
    }

    public double getRoomCount() {
        return (double)numberOfRooms;
    }

    public static int getNumberOfRooms() {
        return numberOfRooms;
    }
}
