package oopspractice;

public class House {
    class Room{
        void show( ){
            System.out.println("room show");
        }
    }
    Room room;// Composition
    House (){
        room = new Room();
    }


}

class Main5{
    public static void main(String[] args){
        House house = new House();
        house.room.show();
    }
}