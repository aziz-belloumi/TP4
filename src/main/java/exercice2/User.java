package exercice2;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String firstName ;
    private String lastName ;
    private String email ;
    private Long cin ;
    public User(String fname , String lname , String email , Long cin){
        this.cin = cin ;
        this.firstName = fname ;
        this.lastName = lname ;
        this.email = email ;
    }
    public void displayInfo(){
        System.out.println(this.firstName+","+this.lastName+","+this.email+","+this.cin);
    }
    public void updateProfile(String fname , String lname , String email){
        this.firstName = fname ;
        this.lastName = lname ;
        this.email = email ;
    }
    public boolean authenticate(){
        return true ;
    }
    
}
