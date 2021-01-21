/**
 * Model an ambulance.
 * @author David J. Barnes
 * @version 2020.11.05
 */
public class Ambulance
{
    // The ambulance's ID.
    private final int id;
    // The area the ambulance is currently in.
    private int area;
    // Whether the ambulance is free or not.
    private boolean free;

    /**
     * Create an Ambulance object.
     * @param id The ambulance's ID.
     * @param area The area the ambulance is currently in.
     */
    public Ambulance(int id, int area)
    {
        this.id = id;
        this.area = area;
        this.free = true;
    }
    
    /**
     * Get the ID.
     * @return The ID.
     */
    public int getID()
    {
        return id;
    }

    /**
     * Get the area.
     * @return the area.
     */
    public int getArea()
    {
        return area;
    }
    
    /**
     * Return whether the ambulance is free or not.
     * @return true if free, false otherwise.
     */
    public boolean isFree()
    {
        return free;
    }
    
    /**
     * Set the ambulance's status to being free.
     */
    public void setFree()
    {
        free = true;
    }
    
    /**
     * Set the ambulance's status to being busy.
     */
    public void setBusy()
    {
        free = false;
    }
    
    /**
     * Move to the given area.
     */
    public void moveTo(int area)
    {
        if(area > 0) {
            this.area = area;
        }
    }

    /**
     * Get the formatted details.
     * @return the formatted details.
     */
    public String getDetails()
    {
        return String.format("Ambulance %d is in area %d and is %sfree.",             
                             id, area, free ? "" : "not ");
    }    
    
    /**
     * Return the formatted details.
     * @return the formatted details.
     */
    public String toString()
    {
        return getDetails();
    }
}
