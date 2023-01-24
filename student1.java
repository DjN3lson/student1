package student1;
public class student1 {
    private String studentId;
    private String studentName;
    private String address;

    public student1(String studentId, String studentName, address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public String getAddress(){
        return this. address;
    }

    public void getAddress(String address){
        this.address = address;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    
}
