package test;

import entities.Machine;
import entities.Salle;
import services.MachineService;
import services.SalleService;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        SalleService salleService = new SalleService();
        MachineService machineService = new MachineService();


        Salle salle1 = new Salle("A11");
        Salle salle2 = new Salle("B22");
        salleService.create(salle1);
        salleService.create(salle2);


//        copyright mr1.zh
//        copyright mr1.zh
//        copyright mr1.zh
//        copyright mr1.zh
//        copyright mr1.zh

        Machine machine1 = new Machine("M1623", new Date(), salleService.findById(1));
        Machine machine2 = new Machine("M6124", new Date(), salleService.findById(2));
        machineService.create(machine1);
        machineService.create(machine2);
//        copyright mr1.zh
//        copyright mr1.zh
//        copyright mr1.zh
//        copyright mr1.zh


        for(Salle salle : salleService.findAll()) {
            System.out.println("Saaalle: " + salle.getCode());
            for(Machine machine : salle.getMachines()) {
                System.out.println("  Machine: " + machine.getRef());
            }
        }
//        copyright mr1.zh
//        copyright mr1.zh
//        copyright mr1.zh
//        copyright mr1.zh


        Date d1 = new Date(110, 0, 1); // 1er janvier 2010
        Date d2 = new Date();
        System.out.println("Maaaaachines aaaachetées entre " + d1 + " et " + d2 + ":");
        for(Machine m : machineService.findBetweenDate(d1, d2)) {
            System.out.println(m.getRef() + " Acchetée le " + m.getDateAchat());
        }
    }
}