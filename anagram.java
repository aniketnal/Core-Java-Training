public class anagram{
    public static void main(String[] args){
        String a = "cat";
        String b = "act";
        boolean isAnagram = false;
        boolean isVisited[] = new boolean[b.length()];
        for(int i=0; i<a.length(); i++){
            isAnagram = false;
            char c = a.charAt(i);
            for(int j=0; j<b.length(); j++){
                if(b.charAt(j) == c && !isVisited[j]){
                    isAnagram = true;
                    isVisited[j] = true;
                    break;

                }else{
                    isAnagram=false;
                }
            }
        }

        if(isAnagram){
            System.err.println("Anagram!");
        }else{
            System.err.println("Not Anagram!");
        }
    }
}