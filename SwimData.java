/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intro;

import java.util.Vector;

/**
 *
 * @author Biruk
 */
public class SwimData implements Cloneable {
    
    Vector swimmers;
    public SwimData()
        {
        swimmers = new Vector();
        
        //Assuming this is the Database
        swimmers.addElement(new Swimmer("Biruk Misganaw",16, "Arsenal", (float) 32.0 , false));
        swimmers.addElement(new Swimmer("Tigabu Mitiku",10, "Arsenal", (float) 30.0 , false));
        swimmers.addElement(new Swimmer("Dawit Mesfin",13, "Arsenal", (float) 31.0 , false));
        swimmers.addElement(new Swimmer("Mihreteab Demeke",19, "Arsenal", (float) 32.0 , false));
        swimmers.addElement(new Swimmer("Mezgebu Zework",24, "Arsenal", (float) 29.0 , false));
        swimmers.addElement(new Swimmer("Jerry Zewde",9, "Arsenal", (float) 31.0 , true));
        swimmers.addElement(new Swimmer("Mercy Abate",23, "Arsenal", (float) 32.0 , true));
        swimmers.addElement(new Swimmer("Hiyab Argaw",20, "Arsenal", (float) 33.0 , true));

      }
    public SwimData cloneMe()
        {
            try
            {
                return (SwimData)super.clone();
            }
            catch(CloneNotSupportedException e)
                {
                    System.out.println(e.getMessage());
            return null;
            }
        }
    
    
    public Vector getSwimmers() {
        return this.swimmers;
    }
    
    public Swimmer getSwimmer(int index) {
        return (Swimmer) this.swimmers.get(index);
    }
    
    public void sortByTime() {
        for( int i=0; i< swimmers.size() ; i++) {
            for (int j = i; j< swimmers.size() ; j++) {
                if(((Swimmer) swimmers.get(i)).getTime() > ((Swimmer) swimmers.get(j)).getTime()){
                      Swimmer s = (Swimmer) swimmers.get(i);
                      swimmers.set(i, swimmers.get(j));
                      swimmers.set(j, s);
                }
            }
       }   
    }
    
    public Vector getUnderEighteenSwimmers(){
        Vector v = new Vector();
        for( int i=0; i< swimmers.size() ; i++) {
            if(((Swimmer) swimmers.get(i)).getAge() < 18){
                v.add(swimmers.get(i));
            }
        }
        return v;
    }
    
    
    
    public Vector getAboveEighteenSwimmers(){
        Vector v = new Vector();
        for( int i=0; i< swimmers.size() ; i++) {
            if(((Swimmer) swimmers.get(i)).getAge() > 18){
                v.add(swimmers.get(i));
            }
        }
        return v;
    }
    
    
    
    public void sortByAge() {
        for( int i=0; i< swimmers.size() ; i++) {
            for (int j = i; j< swimmers.size() ; j++) {
                if(((Swimmer) swimmers.get(i)).getAge() > ((Swimmer) swimmers.get(j)).getAge()){
                      Swimmer s = (Swimmer) swimmers.get(i);
                      swimmers.set(i, swimmers.get(j));
                      swimmers.set(j, s);
                }
            }
       }   
    }
    
    
}
