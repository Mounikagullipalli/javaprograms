public class ReverseString {
    public static void main(String[] args) {
        String m = "mounika";

        String rev ="";

        char [] charArray=m.toCharArray();

        for (int i=charArray.length-1;i>=0;i--){
            rev=rev+charArray[i];
        }
        if(m.equals(rev)){
            System.out.println("palandram");
        }else {
            System.out.println("not palandram");
        }
    }
}
