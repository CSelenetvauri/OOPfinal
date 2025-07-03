# University Management System (UMS)

## Overview

This program simulates a University Management System (UMS) that stores and manages student information, along with the courses they are enrolled in. It allows the printing of student details, along with the list of courses they are enrolled in, including each course's properties such as title, prerequisites, and major topics.

## Program Structure

The program is structured into three primary classes:

- **LearningCourse**: Defines the properties of a course.
- **Student**: Defines student properties and their enrolled courses.
- **UMS**: Manages a list of students and provides functionality to print student data and their enrolled courses.

### 1. **LearningCourse Class**

The `LearningCourse` class represents a university course and includes the following fields:

- `title`: The title of the course (String).
- `acceptancePrerequisites`: The prerequisites required for enrolling in the course (String).
- `majorTopics`: The main topics covered in the course (String).

The class also provides the following:

- **Constructors**: To initialize a course with a title, prerequisites, and major topics.
- **Getters and Setters**: For accessing and modifying the course properties.

#### Example:
```java
public class LearningCourse {
    private String title;
    private String acceptancePrerequisites;
    private String majorTopics;

    public LearningCourse(String title, String acceptancePrerequisites, String majorTopics) {
        this.title = title;
        this.acceptancePrerequisites = acceptancePrerequisites;
        this.majorTopics = majorTopics;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAcceptancePrerequisites() {
        return acceptancePrerequisites;
    }

    public void setAcceptancePrerequisites(String acceptancePrerequisites) {
        this.acceptancePrerequisites = acceptancePrerequisites;
    }

    public String getMajorTopics() {
        return majorTopics;
    }

    public void setMajorTopics(String majorTopics) {
        this.majorTopics = majorTopics;
    }
}
```

## 2. Student Class

The `Student` class represents a student and contains:

- `name`: The name of the student (String).
- `learningCourses`: A list of courses that the student is enrolled in (`List<LearningCourse>`).

It also provides:

- **Constructors**: To initialize a student with a name and a list of courses.
- **Getters and Setters**: For accessing and modifying student properties.

### Example:
```java
public class Student {
    private String name;
    private List<LearningCourse> learningCourses;

    public Student(String name, List<LearningCourse> learningCourses) {
        this.name = name;
        this.learningCourses = learningCourses;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LearningCourse> getLearningCourses() {
        return learningCourses;
    }

    public void setLearningCourses(List<LearningCourse> learningCourses) {
        this.learningCourses = learningCourses;
    }
}
```
## 3. UMS Class

The `UMS` class is the main class that manages a list of students and their enrolled courses. It provides the following functionality:

- **Constructor**: Initializes a list of students.
- **printStudentData(Student student)**: A method that prints out a student's name and all the courses they are enrolled in, including the details of each course (title, prerequisites, and major topics).

The `main` method initializes sample data, including some courses and a student, and then prints out the student’s data.

### Example:
```java
public class UMS {
    private List<Student> students;

    public UMS(List<Student> students) {
        this.students = students;
    }

    public void printStudentData(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Courses enrolled: ");
        
        for (LearningCourse course : student.getLearningCourses()) {
            System.out.println("Course Title: " + course.getTitle());
            System.out.println("Acceptance Prerequisites: " + course.getAcceptancePrerequisites());
            System.out.println("Major Topics: " + course.getMajorTopics());
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LearningCourse course1 = new LearningCourse("Object Oriented Programming", "CS50 Introduction to Programming", "Java syntax and data structures, Procedural programming, Classes, Polymorphism, Packages, ETC");
        LearningCourse course2 = new LearningCourse("Computer Organization", "CS50 Introduction to Programming", "Representing and manipulating information, Machine-level representations of programs, Optimizing program performance, The memory hierarchy");
        LearningCourse course3 = new LearningCourse("English Language Course C1-2", "English Language Course C1-1", "English for Academic Purposes, Reading skills, Speaking skills");
        LearningCourse course4 = new LearningCourse("Mathematical Foundation of Computing", "MATH 150 Calculus I, CS50 Introduction to Programming", "Mathematical Logic, Discrete Mathematics, Sets and Graph Theory, Combinatorics, Digital Systems");
        LearningCourse course5 = new LearningCourse("Calculus II", "MATH150 Calculus I", "Antiderivatives, Definite integrals, Techniques and applications of integration, Improper integrals, Infinite series");

        Student student1 = new Student("Elene Tvauri", Arrays.asList(course1, course2, course3, course4, course5));

        UMS ums = new UMS(Arrays.asList(student1));
        ums.printStudentData(student1);
    }
}
```

## UML Diagram for University Management System (UMS)

### LearningCourse Class
| Attribute                | Type    | Description                                    |
|--------------------------|---------|------------------------------------------------|
| `title`                  | String  | Title of the learning course                  |
| `acceptancePrerequisites`| String  | Prerequisites required to enroll in the course|
| `majorTopics`            | String  | Major topics covered in the course            |

| Method                             | Parameters                              | Return Type | Description                                    |
|------------------------------------|-----------------------------------------|-------------|------------------------------------------------|
| `getTitle()`                       | None                                    | String      | Gets the title of the course                  |
| `setTitle(title: String)`          | title: String                           | void        | Sets the title of the course                  |
| `getAcceptancePrerequisites()`     | None                                    | String      | Gets the acceptance prerequisites             |
| `setAcceptancePrerequisites()`     | acceptancePrerequisites: String         | void        | Sets the acceptance prerequisites             |
| `getMajorTopics()`                 | None                                    | String      | Gets the major topics of the course           |
| `setMajorTopics()`                 | majorTopics: String                     | void        | Sets the major topics of the course           |

---

### Student Class
| Attribute           | Type                    | Description                                        |
|---------------------|-------------------------|----------------------------------------------------|
| `name`              | String                  | Name of the student                                |
| `learningCourses`   | List<LearningCourse>     | List of learning courses the student is enrolled in|

| Method                              | Parameters                                | Return Type  | Description                                          |
|-------------------------------------|-------------------------------------------|--------------|------------------------------------------------------|
| `getName()`                         | None                                      | String       | Gets the name of the student                         |
| `setName(name: String)`             | name: String                              | void         | Sets the name of the student                         |
| `getLearningCourses()`              | None                                      | List         | Gets the list of learning courses for the student    |
| `setLearningCourses()`              | learningCourses: List<LearningCourse>      | void         | Sets the list of learning courses for the student    |

---

### UMS Class
| Attribute           | Type                    | Description                                          |
|---------------------|-------------------------|------------------------------------------------------|
| `students`          | List<Student>            | List of students in the university                    |

| Method                              | Parameters                                | Return Type  | Description                                          |
|-------------------------------------|-------------------------------------------|--------------|------------------------------------------------------|
| `printStudentData(student: Student)`| student: Student                         | void         | Prints the student's information and their courses   |



## Example Output

If you run the program, you will see the following output for a student named "Elene Tvauri":
```java
Student Name: Elene Tvauri
Courses enrolled:
Course Title: Object Oriented Programming
Acceptance Prerequisites: CS50 Introduction to Programming
Major Topics: Java syntax and data structures, Procedural programming, Classes, Polymorphism, Packages, ETC

Course Title: Computer Organization
Acceptance Prerequisites: CS50 Introduction to Programming
Major Topics: Representing and manipulating information, Machine-level representations of programs, Optimizing program performance, The memory hierarchy

Course Title: English Language Course C1-2
Acceptance Prerequisites: English Language Course C1-1
Major Topics: English for Academic Purposes, Reading skills, Speaking skills

Course Title: Mathematical Foundation of Computing
Acceptance Prerequisites: MATH 150 Calculus I, CS50 Introduction to Programming
Major Topics: Mathematical Logic, Discrete Mathematics, Sets and Graph Theory, Combinatorics, Digital Systems

Course Title: Calculus II
Acceptance Prerequisites: MATH150 Calculus I
Major Topics: Antiderivatives, Definite integrals, Techniques and applications of integration, Improper integrals, Infinite series
```

## Features

- **Manage Courses**: Each course has details like its title, prerequisites, and major topics.
- **Student-Course Association**: Each student is associated with a list of courses.
- **Detailed Output**: When printing student data, all details of the student and their courses are shown.

## Requirements

- Java 8 or higher
- Basic understanding of object-oriented programming (OOP)

## Future Improvements

- Add functionality for managing multiple students with dynamic additions and removals.
- Implement search and filtering features for courses and students.
- Integrate with a database to store and retrieve student and course data.

## Conclusion

This system provides a basic structure for managing students and their courses within a university context. It offers the ability to display detailed course information for each student, making it a valuable tool for managing and displaying student academic progress.

---

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## Authors

* **Elene Tvauri** - Initial work and implementation.
