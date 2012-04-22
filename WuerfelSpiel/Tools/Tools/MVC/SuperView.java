// SuperView.java                               MM 2005
// MVC-View-Superklasse
package Tools.MVC;

import java.util.*;                         // Observer

/**
 * View-Superklasse, abstract, 
 * stellt Model dar, installiert Controller.
 */

public abstract class SuperView 
  implements Observer
{
/**
 * Mathematisches Modell,
 * enthaelt Funktionalitaet des Problems.
 */
  protected SuperModel model;

/**
 * Zum View gehoeriger Controller.
 */
  protected SuperController controller;

/* --------------------------------------------------*/
                                    // MVC-Installation
/**
 * MVC-Installation,
 * meldet den View als Observer des Models an,
 * erzeugt Controller fuer Model und View,
 * erzeugt View und uebergibt ihm die Aktivitaeten.
 * @param m Mathematisches Modell
 */
  protected void initialize( SuperModel m)
  {
// Model
    model = m;
    model.addObserver( this);           // Ueberwachung
// Controller
    controller = makeController();
    controller.initialize( model, this);
// View
    makeView();
  }

/**
 * Erzeugt Controller, abtract.
 * @return Controller fuer View
 */
  protected abstract SuperController makeController();

/**
 * Erzeugt und startet View, abtract.
 */
  protected abstract void makeView();

/* ------------------------------------------------- */
                                  // MVC-Deinstallation
/**
 * Deinstalliert MVC,
 * setzt Model und Controller zurück.
 */
  public void release()
  {
// Controller
    controller.release();
    controller = null;
// Model
    model.deleteObserver( this);
    model = null;
  }

/* --------------------------------------------------*/
                                       // draw-Methoden
/**
 * Darstellung des Model, abstract.
 */
  protected abstract void draw();

/**
 * Darstellung eines Objektes,
 * wird die Methode nicht ueberschrieben,
 * so wird das ganze Model neu dargestellt.
 * @param o Object geaendertes Objekt
 */
  protected void draw( Object o)
  {
    draw();
  }

/* --------------------------------------------------*/
                                    // Observer-Methode
/**
 * Ueberschreibt Interfacemethode,
 * legt Reaktion auf Aenderungen fest.
 * @param m Model, welches Aenderungen meldet
 * @param o geaenderte Objekte
 */
  public void update( Observable m, Object o)
  {
    if( model != m) return;
    if( o == null)
      draw();             // Model wird neu dargestellt
    else
      draw( o);          // Objekt wird neu dargestellt
  }
}
