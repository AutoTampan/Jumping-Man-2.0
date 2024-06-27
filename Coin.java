import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Coin extends Actor
{
    private static final int WORLD_WIDTH = 600;  // Adjust to match your world width

    public Coin() {
        GreenfootImage image = new GreenfootImage("coin.png");
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
