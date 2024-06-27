import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PowerUp extends Actor
{
    private static final int WORLD_WIDTH = 600;  // Adjust to match your world width

    public PowerUp() {
        GreenfootImage image = new GreenfootImage(20, 20);
        image.setColor(Color.RED);
        image.fillRect(0, 0, 20, 20);
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
