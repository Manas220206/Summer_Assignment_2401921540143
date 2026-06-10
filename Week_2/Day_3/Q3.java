class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                String pattern = s.substring(0, i);
                StringBuilder sb = new StringBuilder();

                int times = n / i;
                for(int j = 0; j < times; j++){
                    sb.append(pattern);
                }

                if(sb.toString().equals(s)) return true;
            }
        }

        return false;
    }
}