package com.mycompany.itemmain;
public class Item 
{
    private int location;
    private String description;
    
    public void Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    //Getters
    public void setLocation(int location)
    {
        this.location=location;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    //setters
    public int getLocation()
    {
        return location;
    }
    public String getDescription()
    {
        return description;
    } 
    
}
