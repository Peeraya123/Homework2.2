/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {

    public void startBooting() {
        System.out.println("Starts booting..." );
        System.out.println("Reading system config files...");
        System.out.println("Initializing...");
        System.out.println("Initializing context...");
        System.out.println("Initializing listeners...");
        System.out.println("Creating system objects...");
        System.out.println("Start working....");
        System.out.println("After work done....");
        System.out.println("Releasing processes...");
    }
    //หยุดการทำงาน
    public void destory() {
        System.out.println("Destorying..." );
        System.out.println("Destroying system objects...");
        System.out.println("Destroying listeners...");
        System.out.println("Destroying context...");
        System.out.println("Shutting down...");
    }
}
