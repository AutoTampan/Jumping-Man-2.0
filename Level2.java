import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends FlappyWorld
{
    public Level2()
    {    
        super();
        // Set specific configurations for Level 2 (medium level)
        addObject(new Pipe(), 400, 150);  // Add a Pipe at position (400, 150)
        addObject(new Pipe(), 600, 250);  // Add another Pipe at position (600, 250)
        addObject(new Coin(), 550, 200);  // Add a Coin at position (550, 200)
        addObject(new Bird(), 800, 100);  // Add a Bird at position (800, 100)
        addObject(new Enemy(), 500, 300);  // Add an Enemy at position (500, 300)
        }
}
