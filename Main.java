import StudentManagement.*;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("******* Add Student *******");
        st.addStudent(students, new Student("BH00535", "Nguyen Bao Son", 10));
        st.addStudent(students, new Student("BH00534", "Buoi Huy Hoang", 1));
        st.addStudent(students, new Student("BH00533", "Hoang Duc Giang", 10));
        st.addStudent(students, new Student("BH00532", "Dao Huy Viet", 10));
        st.addStudent(students, new Student("BH00531", "Nguyen Than Trieu", 10));
        System.out.println("List data of students");
        for (Student s : students){
            System.out.println("ID " + s.id +" , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }

        System.out.println("************** Edit Student ***************");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editSudent(students, 1, new Student("BH00234", "Nguyen Bao Son", 10));
        System.out.println("List data of students");
        for (Student s : students){
            System.out.println("ID " + s.id +" , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }
        System.out.println("************** Edit Student By ID ***************");
        edit.editStudentById(students, "BH00234", new Student("BH00535", "Nguyen Bao Son", 9.0));
        System.out.println("List data of students after updated by ID");
        for (Student s : students) {
            System.out.println("ID " + s.id + " , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }
        System.out.println("***************** Remove Student By ID **************");
        ArrayListRemoveStudent removeStudent = new ArrayListRemoveStudent();
        removeStudent.removeStudentById(students, "BH00531");
        System.out.println("List data of students after updated by ID");
        for (Student s : students) {
            System.out.println("ID " + s.id + " , fullName = " + s.fullname + " , mark = " + s.marks + " Rank = " + s.rank);
        }
        System.out.println("************** Search Student By ID *****************");
        ArrayListSearchStudent searchSt = new ArrayListSearchStudent();
        String numberId = "BH00535";
        int findSt = searchSt.binarySearch(students, numberId);
        if(findSt == -1){
            System.out.println("Cannot found id = " + numberId);
        } else {
            System.out.println("found id = " + numberId);
        }
    }
}