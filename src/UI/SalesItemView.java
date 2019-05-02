package UI;

/**
 * This is an interface used by the viewing-classes for the salesItem objects.
 *
 * @author Arvin Khodabandeh, Erlend Holseker & Isak Gamnes Sneltvedt
 * @version v1.0 (2019.05.03)
 */
public interface SalesItemView
{
    /*
    Method used for creating a String containing all information about a literature object.
     */
    String show();

    /*
    Method used for creating a String containing only title, publisher and price of the literature object.
     */
    String showLimited();
}
