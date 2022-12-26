//
//    public int[] solution(int[] lottos, int[] win_nums) {
//        int[] answer = new int[2];
//        int minRank = getMinRank(lottos, win_nums);
//        int maxRank = getMaxRank(lottos, win_nums);
//        answer[0] = getLottoRank(maxRank);
//        answer[1] = getLottoRank(minRank);
//        return answer;
//    }
//
//    private static int getMaxRank(int[] lottos, int[] win_nums) {
//        int maxRank = getMinRank(lottos, win_nums);
//        for (int i = 0; i < lottos.length; i++) {
//            if (lottos[i] == 0) {
//                maxRank++;
//            }
//        }
//        return maxRank;
//    }
//
//    private static int getMinRank(int[] lottos, int[] win_nums) {
//        int minRank = 0;
//        for (int i = 0; i < win_nums.length; i++) {
//            for (int j = 0; j < win_nums.length; j++) {
//                if (lottos[i] == win_nums[j]) {
//                    minRank++;
//                }
//            }
//        }
//        return minRank;
//    }
//
//    private static int getLottoRank(int collectCount) {
//        int rank;
//        if (collectCount == 6) {
//            rank = 1;
//            return rank;
//        } else if (collectCount == 5) {
//            rank = 2;
//            return rank;
//        } else if (collectCount == 4) {
//            rank = 3;
//            return rank;
//        } else if (collectCount == 3) {
//            rank = 4;
//            return rank;
//        } else if (collectCount == 2) {
//            rank = 5;
//            return rank;
//        }
//        rank = 6;
//        return rank;
//    }
//}
