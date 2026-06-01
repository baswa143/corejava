package ComparatorAndComparable;

public class Student implements Comparable<Student> {
    int rollno;
    String name;
    int marks;

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        int x=this.rollno;
        int y=anotherStudent.rollno;
       // return (x<y?-1:((x==y)?0:1));//ascending order
//        return Integer.compare(x,y); //in compare java by default compare the value using the ternary operator
       // return this.name.compareTo(anotherStudent.name);//ascending order we use
       // return anotherStudent.name.compareTo(this.name);//descending order we use
        return Integer.compare(y,x);//descending order
    }

}
