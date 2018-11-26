public class mydriver{
  public static void main(String[] args){
    MyString constructorTest = new MyString("test");
    System.out.println(constructorTest);
    System.out.println(constructorTest.charAt(0));
    System.out.println(constructorTest.charAt(-1));
    System.out.println(constructorTest.subSequence(0,2));
    System.out.println(constructorTest.subSequence(0,5));
    System.out.println(constructorTest.subSequence(-1,2));
    System.out.println(constructorTest.subSequence(0,-1));
    System.out.println(constructorTest.subSequence(2,1));
    System.out.println(constructorTest.subSequence(-2,-1));
  }
}
