class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> st=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0)
            {
                st.add("FizzBuzz");
                continue;
            }
            if(i%3==0)
            {
                st.add("Fizz");
                continue;
            }
            if(i%5==0)
            {
                st.add("Buzz");
                continue;
            }
            else
            {
                st.add(Integer.toString(i));
                continue;
            }
        }
        return st;
    }
}