public class Roman_to_Integer {

    public static void main(String[] args) {
        Roman_to_Integer con = new Roman_to_Integer();
        int summision = con.romanToInt("MCMXCIV");
        System.out.println(summision);

    }

    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I') {
                if (i < s.length() && s.charAt(i + 1) == 'V') {
                    sum += 4;
                    i++;
                } else {
                    sum += 1;
                }

            }

            else if (s.charAt(i) == 'V') {
                sum += 5;
            }

            else if (s.charAt(i) == 'X') {
                if (i < s.length() && s.charAt(i + 1) == 'X') {
                    sum += 9;
                    i++;
                } else {
                    sum += 10;
                }
            }

            else if (s.charAt(i) == 'L') {
                if (i < s.length() && s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i++;
                } else {
                    sum += 50;
                }

            }

            else if (s.charAt(i) == 'C') {
                if (i < s.length() && s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i++;
                } else {
                    sum += 100;
                }
            }

            else if (s.charAt(i) == 'D') {
                if (i < s.length() && s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i++;
                } else {
                    sum += 500;
                }
            }

            else if (s.charAt(i) == 'M') {
                if (s.charAt(i) == 'C' && i < s.length() && s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += 1000;
                }
            }
        }
        return sum;
    }
}
