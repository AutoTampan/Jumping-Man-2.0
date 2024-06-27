import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    private static final int WORLD_WIDTH = 600;  // Adjust to match your world width

    public Enemy() {
        GreenfootImage image = new GreenfootImage("growtopian2.png");
        int newWidth = image.getWidth() / 8;
        int newHeight = image.getHeight() / 8;
        image.scale(newWidth, newHeight);
        setImage(image);
    }

    public void act()
    {
        if (Player.isAlive()) {
            setLocation(getX() - 1, getY());
        }
        if (getX() <= 1) {
            setLocation(WORLD_WIDTH, Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}
