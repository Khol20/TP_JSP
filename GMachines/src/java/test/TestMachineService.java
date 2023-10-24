/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import beans.Machine;
import dao.IDao;
import services.MachineService;
import services.SalleService;
import beans.Salle;
import util.HibernateUtil;

/**
 *
 * @author kholo
 */
public class TestMachineService {

    public static void main(String[] args) {
        // HibernateUtil.getSessionFactory().openSession();

        IDao<Machine> dao = new MachineService();
        IDao<Salle> dao1 = new SalleService();
            //tester la methode create----------------------------------
            dao.create(new Machine("ROUT1234","Cisco", 999.99,dao1.findById(1)));
            dao.create(new Machine( "SWITCH5678","Netgear", 349.99,dao1.findById(1)));
            dao.create(new Machine("TPLINK4321","TP-Link", 79.99,dao1.findById(2)));
            dao.create(new Machine( "DLSWITCH7890","D-Link", 149.95,dao1.findById(2)));
//            System.out.println("------------------------------");

            //tester la methode delete et findById----------------------
//            dao.delete(dao.findById(4));
//            System.out.println("------------------------------");
//            for (Machine machine : dao.findAll()) {
//                System.out.println(machine.toString());
//            }
            //tester la methode update----------------------
//            // Retrieve the machine you want to update
//          Machine machineToUpdate = dao.findById(3);
//           machineToUpdate.setPrix(89.0);
//            dao.update(machineToUpdate);
//            System.out.println("------------------------------");

        }

    }

