package com.abbyellie;

import com.birdbrain.Finch;

public class SquareFinch{
public static void main(String[] args){
    Finch bird = new Finch();

  
  // Square
    bird.setMove("F", 10, 20);
    bird.setTurn("R", 90, 75);
    bird.setMove("F", 10, 20);
    bird.setTurn("R", 90, 75);
    bird.setMove("F", 10, 20);
    bird.setTurn("R", 90, 75);
    bird.setMove("F", 10, 20);
    bird.setTurn("R", 90, 75);


// Diagonal

bird.setTurn("R", 45, 75);
bird.setMove("F", 20, 75);
bird.setMove("B", 20, 75);


// Wiggle

bird.setTurn("R", 10, 20);
bird.setTurn("L", 10, 20);
bird.setTurn("R", 10, 20);
bird.setTurn("L", 10, 20);
bird.setTurn("R", 10, 20);
bird.setTurn("L", 10, 20);
bird.setTurn("R", 10, 20);
bird.setTurn("L", 10, 20);
bird.setTurn("R", 10, 20);
bird.setTurn("L", 10, 20);
bird.setTurn("R", 10, 20);
bird.setTurn("L", 10, 20);


// Spin

bird.setMove("F", 20, 75);
bird.setTurn("R", 360, 75);

// Color
bird.setTail(1, 0, 100, 0);
bird.setTail(2, 100, 0, 0);
bird.setTail(3, 0, 0, 100);
bird.setTail(4, 25, 100,35);


// Beak Color
bird.setBeak(45,25,15);
    
    


    


    bird.stop();
    bird.disconnect();
}
}