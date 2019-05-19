package task2;

/*
* Необходимо написать программу «Heads or Tails?» («Орёл или решка?»),
которая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
сколько раз выпал орёл, а сколько – решка.
*/

public class Ex1 {
    public static void main(String[] args) {
        int countHeads = 0;
        int countTails = 0;
        int headsOrTail = 0;
        for (int i = 0; i < 1000; i++) {
            headsOrTail = (int) (1 + Math.random() * 2); //1 - Heads; 2 - Tails
        if(headsOrTail==1){
            countHeads++;
        }else {
            countTails++;
        }
        }
        System.out.println("Heads=" + countHeads + "\nTails =" + countTails );
    }
}