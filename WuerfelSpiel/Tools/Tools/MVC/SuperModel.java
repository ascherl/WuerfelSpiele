// SuperModel.java                              MM 2005
// MVC-Model-Superklasse
package Tools.MVC;

import java.util.*;                       // Observable

/**
 * Model-Superklasse, abstract,
 * Steuerung fuer ein oder mehrere Views.
 */

public abstract class SuperModel
  extends Observable
{
/**
 * Entferne Observer.
 */
  public void deleteObserver( Observer o)
  {
    super.deleteObserver( o);
    if( countObservers() == 0) release();
  }

/**
 * Beende Programm.
 */
  protected void release()
  {
    System.exit( 0);
  }
}