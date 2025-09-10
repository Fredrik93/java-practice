package org.example.amazon;

/**
 * A drone takes exactly 1 hour to complete a delivery if charge1 = 2 then it can deliver 2 things. if delivery is 3
 * then it needs to charge before delivering the last item. only one drone can fly at a time. example input: 4;
 * [2,1,2,1] -> returns 2, it would take two hours to deliver all items and since charge1 and charge2 is 2 they dont
 * need to charge other example: [1,2,1,1] -> drone1 needs to deliver 3 items but have to charge between each delibery.
 * drone2 has enough battery to deliver all its items
 */
public class DroneDelivery
{
    public static int getDeliveryTime(int charge1, int delivery1, int charge2, int delivery2)
    {

        // happy case, no need to charge
        if(charge1 >= delivery1 && charge2 >= delivery2)
        {
            return delivery1 + delivery2;
        }
        return -1;
    }
}
