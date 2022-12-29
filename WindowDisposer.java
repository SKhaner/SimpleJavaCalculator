import javax.swing.*;
import java.awt.event.*;


class WindowDisposer implements WindowListener {
    public void windowActivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}

    //only care about one event, the rest do nothing
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }

    public void windowDeactivated(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowOpened(WindowEvent e) {}
  }
