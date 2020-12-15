//package arrays2;

public class StudentManagement {

    static int counter = 0;
    static Student[] students = new Student[30];

    static void addStudent() {

        System.out.println("Student id: ");
        int id = Arrays2.sc.nextInt();
        Arrays2.sc.nextLine();

        System.out.println("Student name: ");
        String name = Arrays2.sc.nextLine();
        //Student s = new Student(id, name);
        //s.toString();

        students[counter] = new Student(name);
        counter++;

        if (counter >= students.length) {
            Student[] students2 = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                students2[i] = students[i];
            }

            students = students2;

        }

    }

    public static void removeStudentById(int id) {
        for (int i = 0; i < counter; i++) {
            if (((students[i]).getId() == id)) {
                if (i == (counter - 1)) {
                    students[counter - 1] = null;
                    counter--;
                } else {
                    students[i] = students[counter - 1];
                }
                students[counter - 1] = null;
                counter--;
            }
        }
    }

    static void updateStudent(int id) {
        for (int i = 0; i < counter; i++) {
            if ((students[i]).getId() == id) {
                System.out.println(students[i]);
                System.out.println("What is the new name;");
                String name = Arrays2.sc.nextLine();

                students[i].setName(name);
                System.out.println("Student is updated");
                System.out.println(students[i]);

            }
        }
    }

    static void showAllStudents() {
        for (int i = 0; i < counter; i++) {

            System.out.println(students[i]);

        }
    }

    static void showStudentByID(int id) {

        for (int i = 0; i < counter; i++) {

            if (students[i].getId() == id) {

                System.out.println(students[i]);
                return;
            }
        }

        System.out.println("No such student");
    }
}