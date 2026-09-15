class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            // Check if a next character exists && // AND check if current value is smaller than next value
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                
                result = result - value;   // If current value is smaller, subtract it
            
            } 
            else {
                result = result + value;   //
            }
        }
        return result;
    }
}