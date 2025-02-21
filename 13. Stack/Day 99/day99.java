class Solution {
    static boolean isBalanced(String s) {
        // code here
        while(s.contains("()")||s.contains("{}")||s.contains("[]"))
        s=s.replace("()","").replace("{}","").replace("[]","");
        return s.isEmpty();
    }
}