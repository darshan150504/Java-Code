public class Backtracking {

    public static void printparmutation(String str, String combination, int index)
    {
        if(str.length() == 0)
        {
            // System.out.println("hi");
            System.out.println(combination);
        }

        for(int i=0; i<str.length(); i++)
        {
            char currentchar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);

            printparmutation(newString, combination+currentchar, index+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printparmutation(str, "", 0);
    }
}
