package org.example.leetcode;

public class DateToBinary
{
    public String convertDateToBinary(String date)
    {
        return Integer.toBinaryString(Integer.parseInt(date.split("-")[0]))
                + "-" +
                Integer.toBinaryString(Integer.parseInt(date.split("-")[1]))
                + "-" +
                Integer.toBinaryString(Integer.parseInt(date.split("-")[2]));
    }
}
