package Chapter2;

public class Scannerr {
public static void main(String[] args) {

School school = new School("semicolon", "312 sabo", 24);

System.out.println("School Name: " + school.getSchoolName());
System.out.println("Location: " + school.getLocation());
System.out.println("Number of Students: " + school.getNumberOfStudent());
}
}

class School {
private int numberOfStudent;
private String location;
 private String schoolName;

public School(String schoolName, String location, int numberOfStudent) {
this.schoolName = schoolName;
this.location = location;
this.numberOfStudent = numberOfStudent;
}

public void setSchoolName(String schoolName) {
this.schoolName = schoolName;
}

public String getSchoolName() {
return schoolName;
}

public void setLocation(String location) {
this.location = location;
}

public String getLocation() {
return location;
}

public void setNumberOfStudent(int numberOfStudent) {
 this.numberOfStudent = numberOfStudent;
}

public int getNumberOfStudent() {
 return numberOfStudent;
}
}
