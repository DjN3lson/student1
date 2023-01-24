package student1;

public class StudentList{
    
    public static void main(String[] args) {
        //student1 s1 = new student1 ("s1", "Pablo");
        student1[] studentList = new student1[3];
        studentList[0] = new student1("s1", "Ronak");
        studentList[1] = new student1("s2", "Pablo");
        studentList[2] = new student1("s3", "John");
        
        for(int i = 0; i<studentList.length; i++){
            System.out.print(i);
            System.out.println(studentList[i].getStudentName());
        }
    }
}