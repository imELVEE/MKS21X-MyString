public class MyString implements CharSequence{
  private char[] data;

  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0 ; i < data.length ; i++){
      data[i] = s.charAt(i);
    }
  }
  public String toString(){
    String ans = "[" + data[0];
    for (int i = 1 ; i < data.length ; i++){
      ans += ", " + data[i];
    }
    return ans + "]";
  }


  public char charAt(int index){
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public CharSequence subSequence(int start, int end){
    String subdata = "";
    for (int i = 0 ; i < data.length ; i++){
      if (i >= start && i < end){
        subdata += data[i];
      }
    }
    return subdata;
  }

}
