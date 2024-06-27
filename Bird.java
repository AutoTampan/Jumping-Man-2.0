import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bird extends Actor
{
    private static final int WORLD_WIDTH = 600;  // Adjust to match your world width

    public Bird() {
        GreenfootImage image = new GreenfootImage("cloud.png");
        int newWidth = image.getWidth() / 16;
        int newHeight = image.getHeight() / 16;
        image.scale(newWidth, newHeight);
        setImage(image);
    }

    public void act()
    {
        if (Player.isAlive()) {
            setLocation(getX() - 2, getY());
        }
        if (getX() <= 1) {
            setLocation(WORLD_WIDTH, Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}
