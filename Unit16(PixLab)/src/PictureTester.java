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
    Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /**Keep only blue testing method**/
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.fixUnderwater();
	  beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorVerticalRightToLeft();
	  beach.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontal();
	  beach.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBottomToTop();
	  beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\snowman.jpg");
	  beach.explore();
	  beach.mirrorArms();
	  beach.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture beach = new Picture("C:\\Users\\erica\\OneDrive\\Documents\\GitHub\\Lu_Eric_APCSA-P3\\Unit16(PixLab)\\src\\images\\seagull.jpg");
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
	//testKeepOnlyBlue();
    //testZeroBlue();
	//testNegate();
	//testGrayscale();
	//testFixUnderwater();
	//testMirrorVerticalRightToLeft();
	 //testMirrorHorizontal();
	  //testMirrorHorizontalBottomToTop();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}