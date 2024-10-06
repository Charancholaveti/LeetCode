class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] binaries = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            binaries[i] = Integer.toBinaryString(nums[i]);
        }
        Arrays.sort(binaries, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        String result = "";
        for (String binary : binaries) {
            result += binary;
        }
        return Integer.parseInt(result, 2);
    }
}