public class MyString implements CharSequence{
  private char[] data;

  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0 ; i < data.length ; i++){
      data[i] = s.charAt(i);
    }
  }
  public String toString(){
    String ans = "";
    for (int i = 0; i < data.length ; i++){
      ans += data[i];
    }
    return ans;
  }


  public char charAt(int index){
    try{
      //Stops charAt if there's no error because return exits charAt
      return data[index];
    }
    catch(IndexOutOfBoundsException e){
      //Tells user what user did wrong
      System.out.print("Index provided is invalid: Index was " + index + ".");
    }
    //return garbage answer
    return ' ';
  }

  public int length(){
    return data.length;
  }

  public CharSequence subSequence(int start, int end){
    try{
      //Check to see if the end is invalid, if only end is negative or
      //smaller than start
      char endTest = data[end-start];

      //Create the answer
      String subdata = "";
      //Loops through the data inbetween start and end
      //Checks for: if the start is negative or start end > length
      for (int i = start ; i < end ; i++){
          subdata += data[i];
      }
      //return the subdata and exit the program
      return subdata;
    }
    catch(IndexOutOfBoundsException e){
      //Tells user what user did wrong
      System.out.print("Start and end are invalid:");
      if (start < 0)
        System.out.print(" Start was " + start + ".");
      if (end < 0)
        System.out.print(" End was " + end + ".");
      if (end < start)
        System.out.print(" End was less than start.");
      if (end > data.length)
        System.out.print(" End was greater than length of MyString.");
    }
    //return garbage value if it error occurs
    return "";
  }

}
