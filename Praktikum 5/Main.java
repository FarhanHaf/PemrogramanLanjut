/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;
//Farhan Hafidz_215150707111035
public class Main {
    public static void main(String[] args) {   
        CarRider ming = new CarRider("Lin Ming", 19, "08000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "08111111111");
        CarRider ling = new CarRider("Ling'er", 31, "08122222222");
        CarRider farhan = new CarRider("Farhan Hafidz", 19, "215150707111035"); 
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        data.addCar("SPORT", "N 4444 AB", "Ferrari");
        
        data.listOfCar();
        System.out.println();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(farhan, data.carList.get(3), 5);
        
        System.out.println();
        arsip.info();

    }

}