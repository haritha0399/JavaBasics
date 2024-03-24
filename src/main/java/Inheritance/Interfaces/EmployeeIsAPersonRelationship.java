package Inheritance.Interfaces;

class Person{
    String name;
    int ID;

    void setPersonDetails(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    void DisplayStudentDetails(){
        System.out.println("Name -- "+name+ " ID -- "+ID);
    }
}

class Teacher extends Person{
    String subject_Handled;
    String className;

    void setTeacherDetails(String name, int ID, String subject_Handled, String className){
        setPersonDetails(name,ID);
        this.subject_Handled = subject_Handled;
        this.className = className;
    }

    void DisplayTeacherDetails(){
        System.out.println("Subject -- "+subject_Handled+ " className -- "+className);
    }
}
public class EmployeeIsAPersonRelationship {

    public static void main(String args[]){
        Teacher t = new Teacher();
        t.setPersonDetails("Vignesh",4);
        t.DisplayStudentDetails();
        t.setTeacherDetails("Haritha",3,"Botony","Tenth");
        t.DisplayTeacherDetails();
    }
}
