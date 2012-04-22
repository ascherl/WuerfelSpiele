// SuperController.java                         MM 2005
// MVC-Controller-Superklasse
package Tools.MVC;

/**
 * Controller-Superklasse zur View-Superklasse,
 * installiert und deinstalliert Controller
 * als Ereignisverarbeiter.
 */

public class SuperController
{
/* ------------------------------------------------- */
                                                 // MVC
/**
 * Mathematisches Model,
 * enthaelt Funktionalitaet des Problems.
 */
  protected SuperModel model;

/**
 * Zum Controller gehoeriger View.
 */
  protected SuperView view;

/* --------------------------------------------------*/
                                    // MVC-Installation
/**
 * Initialisiert Model und View.
 * @param m Mathematisches Modell
 * @param v zum Controller gehoeriger View
 */
  public void initialize( SuperModel m, SuperView v)
  {
    model = m;
    view = v;
  }

/* --------------------------------------------------*/
                                  // MVC-Deinstallation
/**
 * Deinstalliert MVC,
 * setzt Model und View zurück.
 */
  public void release()
  {
    model = null;
    view = null;
  }
}
