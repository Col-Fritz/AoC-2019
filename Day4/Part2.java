public class Part2 {
    public static void main(String args[]) {
        int min = 240920;
        int max = 789857;
        int count = 0;
        for(int i = min; i < max; i++) {
            char[] digits = ("" + i).toCharArray();
            boolean hasIncrease = false;
            boolean hasDouble = false;
            for(int d = 0; d < digits.length - 1; d++) {
                int current = digits[d] - '0';
                int next = digits[d + 1] - '0';
                if(current > next) {
                    hasIncrease = true;
                }
                int doubleCount = 0;
                for(int h = 0; h < digits.length; h++) {
                    if(current == digits[h] - '0') {
                        doubleCount++;
                    }
                }
                if(doubleCount == 2) {
                    hasDouble = true;
                }
            }
            if(hasDouble && !hasIncrease) {
                count++;
            }
        }
        System.out.println(count);
    }
}
