package com.mycompany.aggregation;

public class CourseMain {

    public static void main(String[] args) {
        Course firstCourse = new Course();
        Course secondCourse = new Course();
        Course thirdCourse = new Course();
        
        firstCourse.setCourseName("Advanced Software Engineering");
        firstCourse.setFirstName("Nima");
        firstCourse.setLastName("Davarpanah");
        firstCourse.setTitle("Clean Code");
        firstCourse.setAuthor("Robert C. Martin Series");
        
        secondCourse.setCourseName("GPU Computing");
        secondCourse.setFirstName("Hao");
        secondCourse.setLastName("Ji");
        secondCourse.setTitle("Programming Massively Parallel Processors: A Hands-on Approach, 4th Edition");
        secondCourse.setAuthor("Wen-mei W. Hwu, David B. Kirk, Izzat El Hajj");
        
        thirdCourse.setCourseName("Game Development");
        thirdCourse.setFirstName("Tony");
        thirdCourse.setLastName("Diaz");
        thirdCourse.setTitle("Introduction to Game Design, Prototyping, and Development: From Concept to Playable Game with Unity and C#");
        thirdCourse.setAuthor("Jeremy Gibson Bond");
        
        firstCourse.print();
        secondCourse.print();
        thirdCourse.print();
    }
    
}
