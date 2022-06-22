/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics_prac1;

/**
 *
 * @author admin
 */
import ch.aplu.robotsim.*;
public class Assignment2 {
    Assignment2(){
        TurtleRobot t = new TurtleRobot();
        t.setTurtleSpeed(150);
        while(true){
        t.forward(3);
        t.left(4);
    }}
public static void main(String args[]){
Assignment2 m = new Assignment2();
}
}

