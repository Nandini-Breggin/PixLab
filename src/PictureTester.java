/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.scale(23, 31);
    beach.zeroBlue();
    beach.explore();
  }

  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale()
  {
    Picture beach = new Picture("caterpillar.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testMyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    // swan.edgeDetection2(10);
    swan.edgeDetection2(10);
    swan.explore();
  }

  public static void testEdgeDetection3()
  {
    Picture swan = new Picture("swan.jpg");
    // swan.edgeDetection3(10);
    swan.edgeDetection3(10);
    swan.explore();
  }

  /** Methods for mirroring */

  public static void testMirrorHorizontal() {
    Picture beach = new Picture("swan.jpg");
    beach.explore();
    beach.mirrorHorizontal();
    beach.explore();
  }

  public static void testMirrorHorizontalBottomtoTop() {
    Picture beach = new Picture("swan.jpg");
    beach.explore();
    beach.mirrorHorizontal();
    beach.explore();
  }

  public static void testMirrorArms() {

    Picture beach = new Picture("snowman.jpg");
    beach.explore();
    beach.mirrorArms();
    beach.explore();

  }

  public static void testMirrorGull() {

    Picture beach = new Picture("seagull.jpg");
    beach.explore();
    beach.mirrorGull();
    beach.explore();

  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testZeroRed();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorVerticalRighttoLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBottomtoTop();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    // testMirrorDiagonal();
    // testCollage();
    // testMyCollage();
    // testCopy();
    testEdgeDetection();
    // testEdgeVertical();
    // testEdgeDiagonal();
    testEdgeDetection2();
    testEdgeDetection3();
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}