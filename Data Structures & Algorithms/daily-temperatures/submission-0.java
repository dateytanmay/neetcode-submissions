class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack();
        int[] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int t = temperatures[i];
            while(!st.isEmpty() && t>temperatures[st.peek()]){
                int prevIndex = st.pop();
                res[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }
        return res;
    }
}
