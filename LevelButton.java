import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LevelButton extends Actor
{
    private Class levelClass;
    
    public LevelButton(String text, Class levelClass)
    {
        this.levelClass = levelClass;
        GreenfootImage image = new GreenfootImage(230, 50);
        image.setColor(new Color(0, 0, 0, 0));
        image.fill();
        
        Font font = new Font("Arial", true, false, 24);
        image.setFont(font);
        
        image.setColor(Color.BLACK);
        image.drawString(text, 51, 31);
        image.drawString(text, 49, 31);
        image.drawString(text, 51, 29);
        image.drawString(text, 49, 29);
        image.drawString(text, 50, 30 + 1);
        image.drawString(text, 50, 30 - 1);
        image.drawString(text, 50 + 1, 30);
        image.drawString(text, 50 - 1, 30);
        
        image.setColor(Color.WHITE);
        image.drawString(text, 50, 30);
        
        setImage(image);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            try {
                Greenfoot.setWorld((World) levelClass.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
