package Chapter03;
/*
 * 编程实现有一个电话类Phone,它有号码的属性number,是一个12位的字符数组,
 * 它有四个功能,设置电话号码setNumber(),显示电话号码getNumber(),接电话answer(),拨打电话dial();
 * 移动电话mobilePhone和固定电话fixPhone是电话的两个子类, 但移动电话号码为11位, 并且移动电话和固定电话接听和拨打电话的方式不同.
 * 固定电话又有一个子类:无绳电话cordlessPhone,无绳电话号码为4位,它相对固定电话还多一个移动功能move().实现这几个类,并且测试它们的功能.
 */
public class Phone {
    private String number;

    public Phone(String number){
        this.number = number;
    }

    public void setNumber(String num){
        number = num;
        System.out.println("The number has been set to " + number);
    }

    public String getNumber(){
        return this.number;
    }

    public void answer(){
        System.out.println("正通过电信固网接听电话...");
    }

    public void dial(String num){
        System.out.println("正通过电信固网拨打电话...");
    }

    public static void main(String[] args) {
        Phone p1 = new Phone("15639317841");
        System.out.println("本机号码是: " + p1.getNumber());

        p1.answer();;
        p1.dial("15639317841");

    }
}

class mobilephone extends Phone{

    public mobilephone(String number) {
        super(number);
    }
}