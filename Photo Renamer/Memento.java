package photo_renamer;

import java.io.Serializable;
import java.io.File;

/**
 * A Memento which hold states (FOLLOWS MEMENTO DESIGN PATTERN)
 * Using the Memento design pattern allowed us to store all the previous file names for a particular 
 * image in a class so that we can retrieve them whenever they were required.
 */
public class Memento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** The state of this Memento. */
	private File state;
	
	/**
	 * An object which stores and holds a given file.
	 * @param state
	 * 			The given file.
	 */
	public Memento(File state) {
		this.state = state;
	}

	/**
	 * Getter method which returns the state File held in this Memento object.
	 * @return The state File of this object.
	 */
	public File getState() {
		return this.state;
	}
}