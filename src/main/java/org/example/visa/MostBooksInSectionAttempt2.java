package org.example.visa;

import java.util.*;

public class MostBooksInSectionAttempt2
{
    public String sectionWithMostBooks(String[] input)
    {
        String currentSection = "";
        Map<String, Set<String>> sections = new HashMap<>();

        for(String command: input){
            if(command.contains("visit")){
                currentSection = command.split(" ")[1];
                sections.put(currentSection, new HashSet<>());
            } else if(command.contains("add")){
                String book = command.split(" ")[1];
                sections.get(currentSection).add(book);
            }
        }

        int mostBooks = 0;
        String largestSection ="";
        for(Map.Entry<String, Set<String>> section: sections.entrySet()){
            if(section.getValue().size() > mostBooks){
                largestSection = section.getKey();
                mostBooks = section.getValue().size();
            }
        }
        return largestSection;
    }

}
