public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        String str ="ZY";
        System.out.println(columnNumber(str));

    }
    public static Integer columnNumber(String str){
        char[] c= str.toCharArray();
        Integer result=0;
        for (int i = 0; i < c.length; i++) {
            int num = c[i] - 65 + 1;
            result = result * 26 + num;

        }
       return result;
    }
}
