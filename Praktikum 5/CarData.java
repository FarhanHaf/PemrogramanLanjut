/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

//Farhan Hafidz_215150707111035
import java.util.ArrayList;

public class CarData {
    ArrayList<Car> carList;

    public CarData() {
        carList = new ArrayList<Car>();
    }

    public void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk));
    }

    public void listOfCar() {
        System.out.println("===========================");
        System.out.println(" DAFTAR MOBIL");
        System.out.println("===========================");
        for (Car i : carList) {
            System.out.println("TIPE MOBIL : " + i.getCarType());           
            System.out.println("No. POLISI : " + i.getPolNum());
            System.out.println("MERK MOBIL : " + i.getMerk());
            System.out.println("----------------------------");
        }
    }
}