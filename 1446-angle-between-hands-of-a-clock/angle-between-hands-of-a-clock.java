class Solution {
    public double angleClock(int h, int m) {
        double a=(30*h)-(5.5*m);
        return Math.min(Math.abs(a),360-Math.abs(a));
    }
}