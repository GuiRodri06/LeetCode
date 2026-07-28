class Solution {
    public boolean isHappy(int n) {

        List<Integer> dig = new ArrayList<>();
        Set<Integer> rep = new HashSet<>();

        while (n != 1) {
            if (rep.contains(n)) {
                return false;
            }
            rep.add(n);

            int t = n;
            while (t > 0) {
                int digito = t % 10;
                dig.add(0, digito);
                t = t / 10;
            }

            int sum = 0;
            for (int d : dig) {
                sum += Math.pow(d, 2);
            }
            System.out.println(sum);
            dig.clear();
            n = sum;
        }

        return true;

    }
}