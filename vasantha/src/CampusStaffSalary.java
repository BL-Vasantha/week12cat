class Staff{
    String name;
    double baseSalary;
    Staff(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    String getType(){
        return  "Staff";
    }
    double getBonus(){
        return  0;
    }
}
class Teacher extends  Staff{

    Teacher(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    double getBonus(){
        return  5000;
    }
    @Override
    String getType(){
        return  "Teacher";
    }
}


public class CampusStaffSalary {
 public static void main(String[] args){

    }
}
