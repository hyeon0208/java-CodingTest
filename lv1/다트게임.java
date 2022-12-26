//
//    public int solution(String dartResult) {
//        String[] darts = dartResult.split("");
//        int[] score = new int[3];
//        int count = -1;
//
//        for(int i = 0; i < darts.length; i++) {
//            if(darts[i].matches("[0-9]")) {
//                count++;
//                score[count] = Integer.parseInt(darts[i]);
//                // 다트 점수가 10이라면
//                if(darts[i+1].matches("[0-9]")) {
//                    score[count] = 10;
//                    i++;
//                }
//            } else if(darts[i].equals("D")) {
//                score[count] = (int) Math.pow(score[count], 2);
//            } else if(darts[i].equals("T")) {
//                score[count] = (int) Math.pow(score[count], 3);
//            } else if(darts[i].equals("*")) {
//                if(count > 0) {
//                    score[count-1] *= 2;
//                }
//                score[count] *= 2;
//            } else if(darts[i].equals("#")) {
//                score[count] *= -1;
//            }
//        }
//        return score[0] + score[1] + score[2];
//    }