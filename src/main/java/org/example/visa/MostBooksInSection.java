package org.example.visa;

import java.util.ArrayList;
import java.util.List;

public class MostBooksInSection
{
    /**
     * Level 2: Out of a list of strings, figure out with section (a,b,c..) has the most books. a book can only be
     * entered once.
     */

    public String sectionWithMostBooks(List<String> sectionsAndBooks)
    {
        List<String> booksInSectionA = new ArrayList<>();
        List<String> booksInSectionB = new ArrayList<>();
        List<String> booksInSectionC = new ArrayList<>();
        String currentSection = "";
        String currentBook = "";
        for(String s : sectionsAndBooks)
        {

            System.out.println(s);
            String operation = s.split(" ")[0];
            // depending on operation, add either a book or a section
            if(operation.equals("visit")){
                currentSection = s.split(" ")[1];
            } else if (operation.equals("add")){
                currentBook = s.split(" ")[1];
                switch(currentSection)
                {
                    case "sectionA":
                        if(!booksInSectionA.contains(currentBook)){
                        booksInSectionA.add(currentBook);}
                        break;
                    case "sectionB":
                        if(!booksInSectionB.contains(currentBook)){

                            booksInSectionB.add(currentBook);}
                        break;
                    case "sectionC":
                        if(!booksInSectionC.contains(currentBook)){
                            booksInSectionC.add(currentBook);}
                        break;
                }
            }
        }
        int a = booksInSectionA.size();
        int b = booksInSectionB.size();
        int c = booksInSectionC.size();
        if(a > b && a > c){return "sectionA";}
        if(b > a && b > c){return "sectionB";}
        if(c > a && c > b){return "sectionC";}

        return null;
    }
}
