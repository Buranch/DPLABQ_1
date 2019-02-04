/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intro;

/**
 *
 * @author Biruk
 */
public class Swimmer {

     String name;
     int age;
     String club;
     float time;
     boolean female;
     public Swimmer(String name, int age, String club, float time, boolean female) {
         this.name = name;
         this.age = age;
         this.club = club;
         this.time = time;
         this.female = female;
     }
     
     public String getName() {
         return this.name;
     }
     
     public float getTime() {
         return this.time;
     }
     
     public boolean isFemale() {
         return this.female;
     }
     
     public int getAge(){
         return this.age;
     }
}
