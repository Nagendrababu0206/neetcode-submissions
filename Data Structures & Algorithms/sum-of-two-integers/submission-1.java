class Solution {
    public int getSum(int a, int b) {
        int carry;
        while(b!=0)
        {
        carry=a&b;//finds where carry is needed
        a=a^b;//xor adds the bits

        b=carry<<1;//places carry in right position
        }
     return a;
    }
}
