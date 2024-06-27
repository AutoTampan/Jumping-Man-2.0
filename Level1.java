import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends FlappyWorld
{
    public Level1()
    {    
        super();
        // Set specific configurations for Level 1 (very easy level)
        addObject(new Pipe(), 500, 200);  // Add a Pipe at position (500, 200)
        addObject(new Coin(), 600, 150);  // Add a Coin at position (600, 150)
    }
}
