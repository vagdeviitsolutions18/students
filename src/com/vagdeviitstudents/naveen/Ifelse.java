package com.vagdeviitstudents.naveen;



public class Ifelse 
{ 
    public static void main(String[] args) 
    {
        String s = "foo"; 
        Object o = (Object)s; 
        if (s.equals(o)) 
        { 
            System.out.print("AAA"); 
        } 
        else 
        {
            System.out.print("BBB"); 
        } 
        if (o.equals(s)) 
        {
            System.out.print("CCC"); 
        } 
        else 
        {
            System.out.print("DDD"); 
        } 
    } 

}