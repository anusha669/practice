/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
abstract class Batsman{
   abstract void bat();
}
abstract class Bowler{
   abstract void bowl();
}
class Allrounder interface Batsman,Bowler{
   void bat(){
      System.out.println("I am Batsman");
   }
    void bowl(){
      System.out.println("I am Bowler");
   }
   void both()
   {
      bat();
      bowl();
      System.out.println("I am Batsman and Bowler");
   }
}
public class CandidateCode{
   public static void main(String[] args)
   {
      Allrounder obj=new Allrounder();
      obj.both();
   }
}