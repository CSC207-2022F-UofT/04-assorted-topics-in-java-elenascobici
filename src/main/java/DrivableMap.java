/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    /**
     * If the given id does not appear as a key in drivable_map, add (id, item)
     * as a key-value pair to the map and return true. Otherwise, return false.
     * @param id The id of this item.
     * @param item The Drivable item.
     * @return Whether the key-value pair (id, item) was successfully added to
     * the drivable_map.
     */
    public boolean addDrivable(String id, Drivable item) {
        if (drivable_map.containsKey(id)) {
            return false;
        }
        drivable_map.put(id, item);
        return true;
    }

    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    /**
     * @param speed The speed to compare to the max speeds of the Drivables in
     *              the drivable_map's values.
     * @return Whether there is a Drivable item in the values of this drivable_map that has
     * a max speed higher than or equal to the speed specified.
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable item : drivable_map.values()) {
            if (item.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }

    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    /**
     * @return an ArrayList containing all Tradable items in teh drivable_map.
     */
    public ArrayList<Tradable> getTradable() {
        ArrayList<Tradable> allTradables = new ArrayList<>();
        for (Drivable item : drivable_map.values()) {
            if (item instanceof Tradable) {
                allTradables.add((Tradable) item);
            }
        }
        return allTradables;
    }


    
}