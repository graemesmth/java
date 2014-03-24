package gui.utils;

import java.awt.Component;
import gui.MasterFrame;

public abstract class GUIUtils {
    // BUG: If the starting Component is of a higher type than
    // JFrame, this will recurse forever or possibly throw and error.
    public static MasterFrame getMasterFrame(Component c) {
	if(c instanceof MasterFrame) {
	    return (MasterFrame)c;
	} else {
	    return getMasterFrame(c.getParent());
	}
    }

    public static void nothing() {
	System.out.println("Do nothing.");
    }
    
    public static String generatePassword()
    {
        Integer rand = ((int) Math.random() * 90000) + 10000;
        return rand.toString();
    }
}
