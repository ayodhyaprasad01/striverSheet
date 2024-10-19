class tempCodeRunnerFile {

        String roundToNearest(String str) {

                String twoChar = str.substring(str.length() - 2, str.length() - 1);
                int twoCharInt = Integer.parseInt(twoChar);

                int rem = 0;
                int ques = 1;
                rem = twoCharInt % 10;
                ques = twoCharInt / 10;

                if (rem > 5) {
                        twoCharInt = ques * 10 + 10;
                } else {
                        twoCharInt = ques * 10;
                }
                char cl2 = (char) (twoCharInt / 10);

                str.replace(str.charAt(str.length() - 2), cl2);
                str.replace(str.charAt(str.length() - 1), '0');

                return String.valueOf(twoCharInt);
        }

        public static void main(String[] args) {
                tempCodeRunnerFile solution = new tempCodeRunnerFile();
                System.out.println(solution.roundToNearest("6"));

        }
}