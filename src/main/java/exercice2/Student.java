
package exercice2;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

class Student extends User{
    private Double average ;
    private Classe classe ;
    private Status status ;
    public Student(String fname , String lname , String email , Long cin, Double average , Classe classe , Status status){
        super(fname ,lname ,email,cin);
        this.average = average ;
        this.classe = classe ;
        this.status = status ;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.average+","+this.classe+","+this.status);
    }
    public void updateProfile(String fname , String lname , String email , Double average , Classe classe , Status status){
        super.updateProfile(fname, lname, email);
        this.average = average ;
        this.classe = classe ;
        this.status = status ; 
        
    }
    @Override
    public boolean authenticate(){
        return true ;
    }
    
}
