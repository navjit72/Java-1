package march27prc2;
public class Person {
    private String fname;
    private String lname;
    private String address;
    
    Person(String first,String last,String addr){
        this.fname=first;
        this.lname=last;
        this.address=addr;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
