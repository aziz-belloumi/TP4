/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercice2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class StaffMember extends User {
    private String qualification ;
    private Integer experience ;
    private List<String> tasks ;
    public StaffMember(String fname , String lname , String email , Long cin, String qualification , Integer experience , List tasks ){
        super(fname ,lname ,email,cin);
        this.qualification = qualification ; 
        this.experience =experience ;
        this.tasks = tasks ;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.qualification+","+this.experience+","+this.tasks);
    }
    public void updateProfile(String fname , String lname , String email , String qualification , Integer experience , List tasks){
        super.updateProfile(fname, lname, email);
        this.qualification = qualification ;
        this.experience = experience ;
        this.tasks = tasks ; 
        
    }
    @Override
    public boolean authenticate(){
        return true ;
    }
    public void finishTask(String task){
        for(String t : this.tasks){
            if(t.equalsIgnoreCase(task)){
                this.tasks.remove(t);
                break ;
            }
        }
    }
    
}
