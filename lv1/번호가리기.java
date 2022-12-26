class 번호가리기 {
    public String solution(String phone_number) {
        char[] chArr = phone_number.toCharArray();
        for (int i = 0; i < chArr.length-4; i++ ) {
            chArr[i] = '*';
        }
        
        return String.valueOf(chArr);
    }
}