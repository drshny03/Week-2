package com.tit.week02.day05.singleinheritance.library;

public class Author extends Book {

    String name ,bio;

    public Author(String title, int publicationYear,String name, String bio) {
        super(title, publicationYear);
        this.name= name;
        this.bio = bio;

    }

    public void displayInfo()
    {
        System.out.println("Book Name :" + title+
                            "\n Year Of Publish : "+publicationYear+
                            "\n Author Name : "+ name+
                            "\n Bio Of Author : " + bio);
    }
}
