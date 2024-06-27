import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PilihLevelWorld extends World
{
    public PilihLevelWorld()
    {    
        super(600, 400, 1);
        prepare();
    }

    private void prepare()
    {
        addObject(new LevelButton("Level 1", Level1.class), getWidth() / 2, 150);
        addObject(new LevelButton("Level 2", Level2.class), getWidth() / 2, 250);
        addObject(new LevelButton("Level 3", Level3.class), getWidth() / 2, 350);
        addObject(new BackButton(), getWidth() - 100, getHeight() - 50);  // Tambahkan tombol Back
    }
}
