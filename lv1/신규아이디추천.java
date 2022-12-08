class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        new_id = new_id.replaceAll("[^-_.a-z0-9]", "");

        // 3단계
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }

        // 4단계
        if (new_id.length() > 0) {
            if (new_id.charAt(0) == '.') {
                new_id = new_id.substring(1, new_id.length());
            }
        }

        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // 5단계
        if (new_id.length() == 0) {
            new_id = "a";
        }

        // 6단계
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 7단계
        if (new_id.length() <= 2) {
            for (int i = new_id.length(); i < 3; i++) {
                new_id = new_id += new_id.charAt(new_id.length() - 1);
            }
        }

        return new_id;
    }
}