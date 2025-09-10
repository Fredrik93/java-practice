package org.example.amazon;

// test case [35,35,35,35] should yield int 38 because 38 is highest of nums [35,36,37,38]
// ++ all i's except for the current num itself. iterate over List<Integer> health
// test case [2,1,3,4] -> [2,2,4,5] -> [3,2,4,6] -> [4,3,5,6] -> return 6
// test case [2,1,2,3] -> [2,2,3,4] -> [3,3,3,5] -> [4,4,4,5] -> return 5

import java.util.Collections;
import java.util.List;

public class ServerHealth
{
    public static int getMaximumHealth(List<Integer> health){
        for(int i = 0; i<health.size(); i++)
        {
            for(int j = 0; j < health.size(); j++)
            {
                if(j != i)
                {
                    int temp = health.get(j) + 1;
                    health.set(j, temp);
                }
            }
        }
        return Collections.max(health);
    }
}
