//should be able to hold one "thing"
// The <T> is a generic type

public class Box <T>
{

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box()
  {
  	 super();
  	 isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T cont)
  {
	 super();
	 isFull = true;
	 contents = cont;
  }

  /**
   * Check the contents of the box
   * @return whatever is in the box
   */
  public T getContents()
  {
  	 return contents;
  }

  /**
   * Tell whether the box is full or not
   * @return true if box is full, false if empty
   */
  public boolean isFull()
  {
  	 return isFull;
  }

  /**
   * Empty out the box, and give back whatever was in it
   * return
   */
  public T empty()
  {
  	 T temp = contents;
  	 contents = null;
  	 isFull = false;
  	 return temp;
  }

  public String toString()
  {
  	
  	 
  	 return ("The box contains " + contents + " and is full: " + isFull);
  }

  public static void main(String[] args)
  {

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
