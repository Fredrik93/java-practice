package org.example.visa;

import java.util.List;

public class MostBooksInSection
{
    /**
     * Level 2:
     * Out of a list of strings, figure out with section (a,b,c..) has the most books. a book can only be entered once.
     * example input:
     * visit sectionA
     * add bookA
     * add bookB
     * add bookA
     * visit sectionB
     * visit sectionC
     * add bookA
     * add bookB
     * add bookC
     * end of input
     * expected output: "sectionC" since it has three unique books.
     * @param sectionsAndBooks
     * @return
     */
    public String sectionWithMostBooks(List<String> sectionsAndBooks){

        return "sectionC";
    }
}
