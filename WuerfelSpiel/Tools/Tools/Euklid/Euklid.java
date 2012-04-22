// Euklid.java                                  MM 2003
// Diese Klasse gehoert zum package Tools.
package Tools.Euklid;

/**
 * Bestimmen des groessten gemeinsamen Teilers ggT
 * und des kleinsten gemeinsamen Vielfachen kgV
 * zweier positiver natuerlicher Zahlen m und n
 * mittels des Euklidschen Algorithmus.
 */

public class Euklid
{
/**
 * ggT( m, n),
 * erzeugt ein Objekt der Klasse NPlusException,
 * falls Parameter m, n <= 0.
 * @param m natuerliche Zahlen > 0
 * @param n natuerliche Zahlen > 0
 * @return ggT( m, n)
 */
  public static int ggT( int m, int n)
    throws NPlusException
  {
    if( m <= 0 || n <= 0) throw new NPlusException();
    int r;
    do
    {
      r = m % n;
      m = n;
      n = r;
    } while( n != 0);
    return m;
  }

/**
 * kgV( m, n),
 * erzeugt ein Objekt der Klasse NPlusException,
 * falls Parameter m, n <= 0.
 * @param m natuerliche Zahlen > 0
 * @param n natuerliche Zahlen > 0
 * @return ggT( m, n)
 */
  public static int kgV( int m, int n)
    throws NPlusException
  {
    if( m <= 0 || n <= 0) throw new NPlusException();
    return m * n / ggT( m, n);
  }
}
