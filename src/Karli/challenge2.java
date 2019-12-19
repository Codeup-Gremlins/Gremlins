public class challenge2 {

    //Create a function that takes a string and returns a new string with its first and last characters swapped, except under three conditions:
    //
    //If the length of the string is less than two, return "Incompatible.".
    //If the first and last characters are the same, return "Two's a pair.".
    public static void main(String[] args) {
        Program;
    }


    public class Program {
        public String flipEndChars(String s) {
            String news = "";

            if (s.length()<2) {
                news = "Incompatible.";
            }else if (s.charAt(0) == s.charAt(s.length()-1)) {
                news = "Two's a pair.";
            }else{
                news = news + s.substring(s.length()-1, s.length())
                        + s.substring(1, s.length()-1)
                        + s.substring(0, 1);
            }

            return news;
        }
    }
}

