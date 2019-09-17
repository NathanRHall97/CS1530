/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package abstractfactoryDriver;

import java.util.Random;

/**
 *
 * @author sohel
 */

public class Square implements Shape {

   @Override
   public void draw() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Square ID: %d\n\n", id);
   }
}