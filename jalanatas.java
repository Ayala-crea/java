import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jalanatas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jalanatas extends Actor
{
    private GreenfootImage image;
    public jalanatas()
    {
        image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    /**
     * Act - do whatever the jalanatas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
