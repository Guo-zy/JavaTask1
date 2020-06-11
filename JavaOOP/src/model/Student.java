package model;

public class Student {
    private String studentName;
    private Integer studentAge;
    private String studentGender;
    private String studentId;


    public Student(String studentName, Integer studentAge, String studentGender, String studentId) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentGender='" + studentGender + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}

