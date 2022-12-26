//public static String solution(String X, String Y) {
//    StringBuilder answer = new StringBuilder();
//    // 1 부터 9까지의 수
//    int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//    int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//
//    for (int i = 0; i < X.length(); i++) {
//        // 48은 0의 유니코드
//        x[X.charAt(i) - 48] += 1;
//    }
//
//    for (int i = 0; i < Y.length(); i++) {
//        y[Y.charAt(i) - 48] += 1;
//    }
//
//    for (int i = 9; i >= 0; i--) {
//        for (int j = 0; j < Math.min(x[i], y[i]); j++) {
//            answer.append(i);
//        }
//    }
//
//    if (answer.toString().equals("")) {
//        return "-1";
//    } else if (answer.toString().charAt(0) == '0') {
//        return "0";
//    } else {
//        return answer.toString();
//    }
//}
//
