package com.mycompany.aggregation;

class Instructor{
    String firstName, lastName;
    int officeNumber;
    
    Instructor(){
        firstName = null;
        lastName = null;
        officeNumber = 0;
    }
    
    Instructor(String firstName, String lastName, int officeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }
    
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    void setOfficeNumber(int officeNumber){
        this.officeNumber = officeNumber;
    }
    
    String getFirstName(){
        return this.firstName;
    }
    
    String getLastName(){
        return this.lastName;
    }
    
    int getOfficeNumber(){
        return this.officeNumber;
    }
}

class Textbook{
    String title, author, publisher;
    
    Textbook(){
        title = null;
        author = null;
        publisher = null;
    }
    
    Textbook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    void setTitle(String title){
        this.title = title;
    }
    
    void setAuthor(String author){
        this.author = author;
    }
    
    void setPublisher(String publisher){
        this.publisher = publisher;
    }
    
    String getTitle(){
        return this.title;
    }
    
    String getAuthor(){
        return this.author;
    }
    
    String getPublisher(){
        return this.publisher;
    }
}

public class Course {
    private String courseName;
    Instructor copyInstructor;
    Textbook copyTextbook;
    
    public Course(){
        copyInstructor = new Instructor();
        copyTextbook = new Textbook();
        courseName = null;
    }
    
    public void setFirstName(String firstName){
        this.copyInstructor.setFirstName(firstName);
    }
    
    public void setLastName(String lastName){
        this.copyInstructor.setLastName(lastName);
    }
    
    public void setOfficeNumber(int officeNumber){
        this.copyInstructor.setOfficeNumber(officeNumber);
    }
    
    public void setTitle(String title){
        this.copyTextbook.setTitle(title);
    }
    
    public void setAuthor(String author){
        this.copyTextbook.setAuthor(author);
    }
    
    public void setPublisher(String publisher){
        this.copyTextbook.setPublisher(publisher);
    }
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public String getFirstName(){
        return this.copyInstructor.getFirstName();
    }
    
    public String getLastName(){
        return this.copyInstructor.getLastName();
    }
    
    public int getOfficeNumber(){
        return this.copyInstructor.getOfficeNumber();
    }
    
    public String getTitle(){
        return this.copyTextbook.getTitle();
    }
    
    public String getAuthor(){
        return this.copyTextbook.getAuthor();
    }
    
    public String getPublisher(){
        return this.copyTextbook.getPublisher();
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void print(){
        System.out.println("Course Name: "+this.courseName + " | Instructor: "+  this.copyInstructor.getFirstName()+ " " + this.copyInstructor.getLastName() + 
                "| Text book title: "+this.copyTextbook.getTitle() + "| Text book author: " + this.copyTextbook.getAuthor());
    }
}
