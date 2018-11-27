public class MyString implements CharSequence,Comparable<CharSequence>{

  //CharSequence Methods

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
    if (index < 0 || index > data.length){
      //Tells user what user did wrong
      throw new IndexOutOfBoundsException("Index provided is invalid: Index was " + index);
    }

    return data[index];
  }

  public int length(){
    return data.length;
  }

  public CharSequence subSequence(int start, int end) throws IndexOutOfBoundsException{
    //Checks for exceptions
    if (start < 0 || end < 0 || end < start || end > data.length){
    String error = "";
    //Tells user what user did wrong
    if (start < 0)
      error += " Start was " + start + ".";
    if (end < 0)
      error += " End was " + end + ".";
    if (end < start)
      error += " End was less than start.";
    if (end > data.length)
      error += " End was greater than length of MyString.";

    throw new IndexOutOfBoundsException("Start and end are invalid:" + error);
    }

    //Create the answer
    String subdata = "";
    //Loops through the data inbetween start and end
    for (int i = start ; i < end ; i++){
        subdata += data[i];
    }
    //return the subdata and exit the program
    return subdata;

  }

//-----------------------------------------------------------------------------------

  //Comparable Methods

  public int compareTo(CharSequence o){
    if (data == null || o == null){
      throw new NullPointerException("Cannot compare to null.");
    }

    //loop through data and o to find correct value and then
    //change ans to correct value
    for (int i = 0 ; i < Math.min(length(), o.length()) ; i++){
      if ( (int) charAt(i) < (int) o.charAt(i) ){
        return -1;
      }
      if ( (int) charAt(i) > (int) o.charAt(i) ){
        return 1;
      }
    }
    //the CharSequences have the same characters but different lengths
    if (length() < o.length()){
      return -1;
    }
    else if (length() > o.length()){
      return 1;
    }
    //the CharSequences have the same characters and length
    return 0;
  }


}
