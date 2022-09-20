/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader, giving them the specified inventory,
     * wishlist and money.
     * @param inventory Objects in this DrivableTrader's inventory
     * @param wishlist Objects on this DrivableTrader's wishlist
     * @param money The DrivableTrader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a DrivableTrader with the given amount of money and
     * an empty inventory and wishlist.
     * @param money This DrivableTrader's money.
     */

    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Override the getSellingPrice method; the selling price for a Tradable item
     * is its price added to its max speed.
     * @param item The item to get the selling price for.
     * @return The selling price of this item.
     */
    @Override
    public int getSellingPrice(Drivable item) {
        if (item instanceof Tradable) {
            return ((Tradable) item).getPrice() + item.getMaxSpeed();
        }
        return Tradable.MISSING_PRICE;
    }
}
