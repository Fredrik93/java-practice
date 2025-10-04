package org.example.visa;

import java.util.*;

public class MostBooksInSectionAttempt3
{
    public String sectionWithMostBooks(String[] list)
    {
        // visit SectionX
        // add bookA
        // create storage for items, we need section, {a,b,c}: String, List<String>
        Map<String, Set<String>> sections = new HashMap<>();
        String currentSection = "";
        for(int i = 0; i < list.length; i++)
        {
            // loop over input : list
            // if( input[0] == visit then set currentSection
            if(list[i].contains("visit"))
            {
                currentSection = list[i].split(" ")[1];
                // this could be bad, am i assigning a new List each time?
                sections.put(currentSection, new HashSet<>());
            }
            if(list[i].contains("add"))
            {
                // if input[0] == add then add book to currentSection
                sections.get(currentSection).add(list[i].split(" ")[1]);
            }
        }
        String biggestSection = "";
        int largestSection = 0;
        for (Map.Entry<String, Set<String>> mostBooks : sections.entrySet()){
            if(mostBooks.getValue().size() > largestSection){
                biggestSection = mostBooks.getKey();
                largestSection = mostBooks.getValue().size();
            }
        }
        // iterate over lists, check longest one, return the key (section) of that
        return biggestSection;
    }
}
