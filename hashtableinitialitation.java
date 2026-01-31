import java.util.Hashtable;
class StudentInfo {
    Integer id;
    Character grade;
    StudentInfo(Integer id, Character grade) {
        this.id = id;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Grade: " + grade;
    }
}
public class hashtableinitialitation {
    public static void main(String[] args) {
        Hashtable<String, StudentInfo> studentTable = new Hashtable<>();
        studentTable.put("NEW YORK", new StudentInfo(5559655, 'A'));
        studentTable.put("NEW DELHI", new StudentInfo(545965, 'B'));
        studentTable.put("KANPUR", new StudentInfo(4965965, 'C'));
        studentTable.remove("KANPUR");
        for (String city : studentTable.keySet()) {
            System.out.println(city + ": " + studentTable.get(city));
        }
    }
}