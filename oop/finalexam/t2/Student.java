package oop.finalexam.t2;

import java.util.List;

public class Student {
    private String name;
    private List<LearningCourse> learningCourses;

    public Student(String name, List<LearningCourse> learningCourses) {
        this.name = name;
        this.learningCourses = learningCourses;
    }

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
