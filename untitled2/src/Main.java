public class Main {
    public static void main(String[] args) {

        String number="(-(1-3)*(4-1^321.45)+(6/2!)";
        StringBuilder numbersFunction=new StringBuilder(number);
         String[] numbers=number.split("(\\)|\\(|\\*|\\+|-|\\^|!|\\/)");
        for(int i=0;i<numbers.length;i++)
        {
            int index=numbersFunction.indexOf(numbers[i]);
            numbersFunction.delete(index,index+numbers[i].length());
        }
            String[] line=new String[numbers.length+numbersFunction.length()];
        int count=0;
        try {
            for (int i = 0; i < line.length; i++) {
                if (i % 2 == 0) {
                    line[i] = numbers[i / 2];
                }
                if (i % 2 != 0) {
                    Character c = numbersFunction.charAt((i - 1) / 2);
                    line[i] = c.toString();
                }
                if(line[i].equals(""))
                {
                    count++;
                }
            }
        }
        catch (Exception e)
        {
            line[line.length-1]=")";
        }
        String[] answer=new String[line.length-count];

        int j=0;
        for(int i=0;i<line.length;i++)
        {
            if(!line[i].equals(""))
            {
                answer[j]=line[i];
                j++;
            }
        }
        for(int i=0;i< answer.length;i++)
        {
            System.out.printf(answer[i]);
        }
    }
}
