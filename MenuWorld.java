import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MenuWorld extends World
{
    public MenuWorld()
    {    
        super(600, 400, 1);
        prepare();
    }

    private void prepare()
    {
        addObject(new Header(), getWidth() / 2, 100);
        addObject(new StartButton(), getWidth() / 2, 200);
        addObject(new InstructionsButton(), getWidth() / 2, 300);
    }
}
