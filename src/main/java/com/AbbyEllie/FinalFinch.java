package com.abbyellie;

import com.birdbrain.Finch;

public class SquareFinch{
public static void main(String[] args){
    Finch bird = new Finch();

  
  // The robot moves in a square
    bird.setMove("F", 20,20);
    bird.setTurn("R", 90, 75);
    bird.setMove("F", 20,20);
    bird.setTurn("R", 90, 75);
    bird.setMove("F", 20, 20);
    bird.setTurn("R", 90, 75);
    bird.setMove("F", 20, 20);
    bird.setTurn("R", 90, 75);


// The robot turns diagonal, moves forward then backwards

bird.setTurn("R", 45, 75);
bird.setMove("F", 20, 75);
bird.setMove("B", 20, 75);


// The robot wiggles back and forth

bird.setTurn("R", 10, 55);
bird.setTurn("L", 10, 55);
bird.setTurn("R", 10, 55);
bird.setTurn("L", 10, 55);
bird.setTurn("R", 10, 55);
bird.setTurn("L", 10, 55);
bird.setTurn("R", 10, 55);
bird.setTurn("L", 10, 55);
bird.setTurn("R", 10, 55);
bird.setTurn("L", 10, 55);
bird.setTurn("R", 10, 55);
bird.setTurn("L", 10, 55);


// The robot moves forward and then spins in a circle

bird.setMove("F", 20, 75);
bird.setTurn("R", 360, 75);

// The tail of the robot turns multiple different colors
bird.setTail(1, 0, 100, 0);
bird.setTail(2, 100, 0, 0);
bird.setTail(3, 0, 0, 100);
bird.setTail(4, 25, 100,35);


// The beak of the robot turns a different color
bird.setBeak(65,25,17);


// The robot displays a word then pauses
bird.print("PETUNIA!");
bird.pause(5.5);

// The robot plays a musical note then pauses
bird.playNote(100, 0.5);

bird.pause(3);



    bird.stopAll();
    bird.disconnect();
}
}