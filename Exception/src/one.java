/*编写程序，把24小时表示法的时间转换为12小时表示法。定义名为TimeFormatException的异常类，如果输入的时间是非法值，
比如10:65或者abc，程序应该抛出并处理TimeFormatException异常。
要求编程实现TimeFormatException类，并实现Test类中的outTime()方法，使给定的Test类能正常运行，并实现指定的输出内容。
提示：时间格式转换可以使用java.text.SimpleDateFormat类，具体用法自行查看API文档或网上资料。*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class one {

    public static void main(String[] args) {

        String[] times = {"15:20", "27:10", "16:78", "abc", "6:30"};

        String line = null;

        for (String timeStr : times) {

            System.out.println("===");

            System.out.println("<<<TimeString for format converting in 24-hour notation is " + timeStr);

            try {

                outTime(timeStr);

            } catch (TimeFormatException e) {

                System.out.println(e);

                continue;

            }

        }

        System.out.println("End of program");

    }


    public static void outTime(String line) throws TimeFormatException {
        SimpleDateFormat a24 = new SimpleDateFormat("HH:mm");
        SimpleDateFormat a12 = new SimpleDateFormat("hh:mm a");
        //a24.setLenient(false);//使用值为非宽松false.

        try {
            String[] arr = line.split(":");
            int hour = Integer.parseInt(arr[0]);
            int min = Integer.parseInt(arr[1]);
            if (hour > 24) {
                System.out.println("TimeFormatException: Invalid Value for Hour!");
            } else if (min > 60) {
                System.out.println("TimeFormatException: Invalid Value for Minute!");
            } else {
                Date b = a24.parse(line);


                System.out.println(">>>Time in 12-hour notation is: " + a12.format(b));
            }
        } catch (ParseException | NumberFormatException e) {
            throw new TimeFormatException();
        }


    }

}

class TimeFormatException extends Throwable {

    @Override
    public String toString() {
        return "TimeFormatException: Invalid Value for Time!";
    }
}
