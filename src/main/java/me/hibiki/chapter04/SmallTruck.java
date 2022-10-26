package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 10:57
 */
public class SmallTruck extends Truck {
    protected void smallTruckRun() {
        System.out.println("微型卡车在行使！");
    }

    public static void main(String[] args) {
        SmallTruck smallTruck = new SmallTruck();
        smallTruck.vehicleRun();
        smallTruck.truckRun();
        smallTruck.smallTruckRun();
    }
}
