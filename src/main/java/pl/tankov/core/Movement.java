package pl.tankov.core;

/**
 * Movement definition.
 * All external body parts need to implements this to make actions.
 *
 * @author Paweł Głowacz
 */
public interface Movement {
    public void moveForward() throws RuntimeException;
    public void moveBackward() throws RuntimeException;
    public void moveLeft() throws RuntimeException;
    public void moveRight() throws RuntimeException;
}
