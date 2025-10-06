package COM.RAJAT.day52.Medium;

class ParkingSystem {
    private int[] slots;
    public ParkingSystem(int big, int medium, int small) {
        slots = new int[3];
        slots[0] = big;
        slots[1] = medium;
        slots[2] = small;
    }

    public boolean addCar(int carType) {
        int index = carType - 1;
        if(slots[index] > 0){
            slots[index]--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem p = new ParkingSystem(3,1,1);
        System.out.println(p.addCar(1));
        System.out.println(p.addCar(2));
        System.out.println(p.addCar(3));
        System.out.println(p.addCar(1));
        System.out.println(p.addCar(1));
    }
}