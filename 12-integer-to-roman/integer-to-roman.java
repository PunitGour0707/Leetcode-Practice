class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> mp = new HashMap<>();
        while (num > 999) {
            num -= 1000;
            ans.append("M");
        }
        while (num > 899) {
            num -= 900;
            ans.append("CM");
        }
        while (num > 499) {
            num -= 500;
            ans.append("D");
        }
        while (num > 399) {
            num -= 400;
            ans.append("CD");
        }
        while (num > 99) {
            num -= 100;
            ans.append("C");
        }
        while (num > 89) {
            num -= 90;
            ans.append("XC");
        }
        while (num > 49) {
            num -= 50;
            ans.append("L");
        }
        while (num > 39) {
            num -= 40;
            ans.append("XL");
        }
        while (num > 9) {
            num -= 10;
            ans.append("X");
        }
        while (num > 8) {
            num -= 9;
            ans.append("IX");
        }
        while (num > 4) {
            num -= 5;
            ans.append("V");
        }
        while (num > 3) {
            num -= 4;
            ans.append("IV");
        }
        while (num > 0) {
            num -= 1;
            ans.append("I");
        }
        return ans.toString();
    }
}