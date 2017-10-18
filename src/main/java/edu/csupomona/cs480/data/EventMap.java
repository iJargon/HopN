package edu.csupomona.cs480.data;

import java.util.HashMap;

/**
 * This class is a HashMap, but we extend the HashMap
 * class so that we can rename it to something meaningful.
 * <p>
 * Basically, the key of the map is the event ID, and the
 * value is the actual User object.
 * <p>
 * Using a HashMap allows us to quickly query the event
 * object.
 *
 * @author yusun
 *
 */
@SuppressWarnings("serial")
public class EventMap extends HashMap<Integer, Event>{

}
