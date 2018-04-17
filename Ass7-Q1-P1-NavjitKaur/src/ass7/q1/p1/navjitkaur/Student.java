package ass7.q1.p1.navjitkaur;
public class Student extends Person{
    private final int freshman=1;
    private final int sophomore=2;
    private final int junior=3;
    private final int senior=4;
    private int classStatus;

    public Student() {
    }
    public Student(String name, String address, 
            long phoneNumber, String email,int classStatus) {
        super(name,address,phoneNumber,email);
        this.classStatus = classStatus;
    }
    public String getClassStatus() {
        switch(classStatus){
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default:
                return "Unknown";
        }
    }
    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }
    public String toString() {
        return "Student";
    }
    
}
