class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        StringBuilder num1=new StringBuilder(),num2=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            num1.append(arr[i]);
            else 
            num2.append(arr[i]);
        }
        return removeLeadingZeros(addStrings(num1.toString(),num2.toString()));
    }
    
    String addStrings(String num1,String num2)
    {
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0||j>=0||carry!=0)
        {
            int sum=carry;
            if(i>=0)sum+=num1.charAt(i--)-'0';
            if(j>=0)sum+=num2.charAt(j--)-'0';
            result.append(sum%10);
            carry=sum/10;
        }
        return result.reverse().toString();
    }
    
    String removeLeadingZeros(String str)
    {
        int i=0;
        while(i<str.length()&&str.charAt(i)=='0')
        i++;
        if(i==str.length())
        return"0";
        return str.substring(i);
    }
}