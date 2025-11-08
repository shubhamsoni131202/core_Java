class letterCountInString {
    public static void main(String[] args) {
        // String s = "Shubham";
        String s = "munish"; // = 6
        String g ="soni"; // = 4
        String k = "sbcdefh"; // = 7
        // count(s);
        System.out.println("number in strig = " + count(s));
                System.out.println("number in strig = " + count(g));
                        System.out.println("number in strig = " + count(k));


        // System.out.println("numbr of words = " +c); 
    }
    public static int count(String s) {
        String str = s.trim();
        int c = 0;
        for(int i = str.length() -1;i>=0;i--) {
            if(str.charAt(i) != ' ') {
                c++;
            }
            else {
                break;
            }
        }
        return(c);
    }
}