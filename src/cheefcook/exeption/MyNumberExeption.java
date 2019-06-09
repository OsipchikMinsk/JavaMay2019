package cheefcook.exeption;

public class MyNumberExeption extends NumberFormatException {
   public MyNumberExeption (){
       super();
   }
   public  MyNumberExeption (String error){
       super(error + " WRONG NUMBER!!!");

   }

}
