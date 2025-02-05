class Solution {
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        String padMap[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      
        StringBuilder prefix=new StringBuilder();

        possibleWordsRec(arr,0,prefix,padMap,res);
        return res;
    }
    
    static void possibleWordsRec(int arr[],int index,StringBuilder prefix,String padMap[],ArrayList<String> res) 
    {
        if(index==arr.length) 
        {
            res.add(prefix.toString());
            return;
        }

        int digit=arr[index];

        if(digit<2||digit>9) 
        {
            possibleWordsRec(arr,index+1,prefix,padMap,res);
            return;
        }

        for(char ch:padMap[digit].toCharArray()) 
        {
            prefix.append(ch);
            possibleWordsRec(arr,index+1,prefix,padMap,res);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
}