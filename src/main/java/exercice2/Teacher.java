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
class Teacher extends User {
    private Long hIndex ;
    private List<Course> courses;
    public Teacher(String fname , String lname , String email , Long cin,Long hIndex , List courses){
        super(fname ,lname ,email,cin);
        this.hIndex = hIndex  ;
        this.courses = courses ;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.hIndex+","+this.courses);
    }
    public void updateProfile(String fname , String lname , String email , Long hIndex , List courses){
        super.updateProfile(fname, lname, email);
        this.hIndex = hIndex ;
        this.courses = courses ; 
        
    }
    @Override
    public boolean authenticate(){
        return true ;
    }
    public void displayCoursesContent(){
        for(int i = 0; i < this.courses.size() ; i++){
            System.out.println(this.courses.get(i));
        }
    }
}
