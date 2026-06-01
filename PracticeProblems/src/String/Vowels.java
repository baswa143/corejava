package String;

public class Vowels {
    public static void vowel(){
        String name = "Sandesh";
        String vowel = "aeiouAEIOU";
        StringBuilder vowel1 = new StringBuilder(" ");
        int count = 0;
        for(int i=0;i<name.length();i++){
            char ch= name.charAt(i);
//            if(vowel.contains(String.valueOf(ch))){
//                count++;
//            }
            if(vowel.indexOf(ch)!=-1){
                vowel1.append(ch);
                count++;
                System.out.println(ch);
            }
        }
        long count1 = name.chars().filter(ch->vowel.indexOf(ch)!=-1).count();
        System.out.println(count1);
//        System.out.println("Total vowels: "+count);
//        System.out.println("Total vowel1: "+vowel1);

        name.chars().filter(ch->vowel.indexOf(ch)!=-1)
                .mapToObj(ch->(char)ch)
                .peek(System.out::println)
                .count();
    }

    public static void main(String[] args) {
        vowel();

    }
}
