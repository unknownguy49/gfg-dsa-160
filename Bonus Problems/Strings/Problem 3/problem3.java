class Solution {
    private static final String[] ONES={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                                          "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    
    private static final String[] TENS={"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    private static final String[] THOUSANDS={"", "Thousand", "Million", "Billion"};
    
    String convertToWords(int n) {
        // code here
        if(n==0) 
        return "Zero";
        StringBuilder result=new StringBuilder();
        int thousandCounter=0;
        while(n>0)
        {
            if(n%1000!=0) 
            {
                String group=helper(n%1000);
                result.insert(0,group+" "+THOUSANDS[thousandCounter]+" ");
            }
            n/=1000;
            thousandCounter++;
        }
        return result.toString().trim();
    }

    private String helper(int n) {
        if(n==0) 
        return "";
        else if(n<20) 
        return ONES[n];
        else if(n<100)
        return TENS[n/10]+(n%10!=0?" "+ONES[n%10]:"");
        else
        return ONES[n/100]+" Hundred"+(n%100!=0?" "+helper(n%100):"");
    }
}