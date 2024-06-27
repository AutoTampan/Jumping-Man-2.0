import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level3 extends FlappyWorld
{
    public Level3()
    {    
        super();
        // Set specific configurations for Level 3 (hard level)
        addObject(new Pipe(), 350, 150);  // Add a Pipe at position (350, 150)
        addObject(new Pipe(), 550, 250);  // Add another Pipe at position (550, 250)
        addObject(new Coin(), 400, 200);  // Add a Coin at position (400, 200)
        addObject(new Coin(), 650, 150);  // Add another Coin at position (650, 150)
        addObject(new Bird(), 800, 200);  // Add a Bird at position (800, 200)
        addObject(new Bird(), 1000, 250);  // Add another Bird at position (1000, 250)
        addObject(new Enemy(), 500, 300);  // Add an Enemy at position (500, 300)
        addObject(new Enemy(), 700, 200);  // Add another Enemy at position (700, 200)
    }
}
