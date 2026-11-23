
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> al = new ArrayList<>();

        long ans = 1;

        for (int i = 0; i <= rowIndex; i++) {

            al.add((int) ans);

            ans = ans * (rowIndex - i) / (i + 1);
        }

        return al;
    }
}
