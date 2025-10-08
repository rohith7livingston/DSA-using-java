import java.util.Scanner;

class Student {
    String name;
    String rollno;

    Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    void print() {
        System.out.println("Name: " + name + ", Roll No: " + rollno);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] students = new Student[100]; // array of 100 Student objects

        for (int i = 0; i < 100; i++) {
            System.out.print("Enter name: ");
            String name = s.nextLine();
            System.out.print("Enter roll number: ");
            String rollno = s.nextLine();
            students[i] = new Student(name, rollno);
        }

        // Optional: print all students
        System.out.println("\nStudent Details:");
        for (int i = 0; i < 100; i++) {
            students[i].print();
        }

        s.close(); // Close scanner
    }
}






// class Student:
//     def __init__(self, name, rollno):
//         self.name = name
//         self.rollno = rollno

//     def print_details(self):
//         print(f"Name: {self.name}, Roll No: {self.rollno}")

// def main():
//     students = []

//     for i in range(100):
//         name = input(f"Enter name for student {i + 1}: ")
//         rollno = input(f"Enter roll number for student {i + 1}: ")
//         students.append(Student(name, rollno))

//     print("\nStudent Details:")
//     for student in students:
//         student.print_details()

// if __name__ == "__main__":
//     main()


the memory of the instance of an array is extended as we are storing the values into the array