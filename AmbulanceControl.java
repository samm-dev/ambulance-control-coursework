import java.util.ArrayList;
import java.util.Iterator;

/**
 * Keep track of multiple ambulances.
 * @author samm-dev
 * @version 171120
 */
public class AmbulanceControl
{
    private ArrayList<Ambulance> ambulances;
    
    /**
     * Create a AmbulanceControl object.
     */
    public AmbulanceControl()
    {
        ambulances = new ArrayList<>();
    }
    
    /**
     * Add a new ambulance.
     * @param ambulance The ambulance.
     */
    public void addAmbulance(Ambulance ambulance)
    {
        this.ambulances.add(ambulance);
    }
    
    /**
     * Get the number of ambulances.
     * @return the number of ambulances.
     */
    public int getNumberOfAmbulances()
    {
        return ambulances.size();
    }
    
    /**
     * Get the number of ambulances in the given area.
     * @param area The area of the ambulances.
     * @return the number of ambulances in the given area.
     */
    public int getNumberOfAmbulances(int area)
    {
        return -1;
    }
    
    /**
     * List all of the ambulances, one per line.
     */
    public void list()
    {
        System.out.println("Ambulances: ");
        
        for(Ambulance Ambulance : ambulances) {
            System.out.println(Ambulance.getDetails());
        }
        System.out.println();
    }
    
    /**
     * Remove the ambulance with the given id.
     * @param day The id of the ambulance to be removed.
     * @return true if an ambulance was removed, false otherwise.
     */
    public boolean removeAmbulance(int id)
    {
        return false;
    }
    
    /**
     * Set the status of the ambulance whose ID is given.
     * @param id The ambulance's ID.
     * @param area The ambulance's new area.
     * @param free Whether it is now free or not.
     */
    public void setStatus(int id, int area, boolean free)
    {
    }
    
    /**
     * Find the nearest free ambulance to the given area.
     * Distance is measured by the absolute value of the
     * difference between two areas.
     * For instance, the distance between areas 1 and 5 is 4,
     * and the distance between areas 6 and 4 is 2.
     * If more than one ambulance is free and nearest to the given
     * area then the one with the lowest ID must be returned.
     * @param area Look for the ambulance nearest to this area.
     * @return the nearest ambulance, or null if there are no free ambulances.
     */
    public Ambulance findNearestFree(int area)
    {
        return null;
    }
}
