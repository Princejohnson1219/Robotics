/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics_prac1;


import ch.aplu.robotsim.*;
public class MoveWithGear {
    MoveWithGear(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(200);
            g.left(300);
            g.forward(200);
    }
    }
    public static void main(String args[]){
       MoveWithGear m = new MoveWithGear();
    }
    
}
