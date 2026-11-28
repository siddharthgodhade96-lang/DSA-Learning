class Solution {
    public void reverseString(char[] s) {
        reverse(s,0);
    }
    public char[] reverse(char[] arr, int index){
        if(index>=arr.length/2) {
            return arr;
        }
        //swaping
        char temp = arr[index];
        arr[index] = arr[arr.length-1-index];
        arr[arr.length -1-index] = temp;
        
        reverse(arr, index+1);
        return arr;
    }
}