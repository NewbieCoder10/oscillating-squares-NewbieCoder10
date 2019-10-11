package edu.cnm.deepdive;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class contains a stub of the {@link #oscillatingSquares(int)} method. Implementation of this
 * method is included as a practical exam problem of the Deep Dive Coding Java + Android Bootcamp.
 *
 * @author Nicholas Bennett, Deep Dive Coding
 */
public class Generator {

  private Generator() {
    // NOTE: There is NO need to do anything with this constructor! The methods
    //       you will implement in this class are static; thus, there is no need
    //       to create instances of this class.
  }

  /* BASIC PROBLEM */

  /**
   * Creates and returns an <code>int[]</code> containing a sequence of alternating positive and
   * negative squared values, of the form (-1)<sup>n</sup>n<sup>2</sup>, where n =
   * 0&hellip;(<code>length</code> - 1).
   * <p>For example, <code>Generator.oscillatingSquares(5)</code> returns an array containing the
   * values <code>{0, -1, 4, -9, 16}</code>.</p>
   *
   * @param length number of elements in array.
   * @return generated array of oscillating squares.
   */
  public static int[] oscillatingSquares(int length) {


       /*  This applet draws a red-and-black checkerboard.
           It is assumed that the size of the applet is 160
           by 160 pixels.
       */

    public void paint(Graphics Graphics g) {

      int row;   // Row number, from 0 to 7
      int col;   // Column number, from 0 to 7
      int x,y;   // Top-left corner of square

      for ( row = 0;  row < 8;  row++ ) {

        for ( col = 0;  col < 8;  col++) {
          x = col * 20;
          y = row * 20;
          if ( (row % 2) == (col % 2) )
            g.setColor(Color.red);
          else
            g.setColor(Color.black);
          g.fillRect(x, y, 20, 20);
        }

      }

    }

  }
    // TODO Replace this line with implementation.
  }

