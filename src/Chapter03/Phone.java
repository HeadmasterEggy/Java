package Chapter03;

/*
 * 编程实现有一个电话类Phone,它有号码的属性number,是一个12位的字符数组,
 * 它有四个功能,设置电话号码setNumber(),显示电话号码getNumber(),接电话answer(),拨打电话dial();
 * 移动电话mobilePhone和固定电话fixPhone是电话的两个子类, 但移动电话号码为11位, 并且移动电话和固定电话接听和拨打电话的方式不同.
 * 固定电话又有一个子类:无绳电话cordlessPhone,无绳电话号码为4位,它相对固定电话还多一个移动功能move().实现这几个类,并且测试它们的功能.
 */
class phone {
    char[] number = new char[12];

    void setNumber(char[] number) {
        this.number = number;
    }

    void getNumber() {
        System.out.print("本机号码：");
        for (char c : number) System.out.print(c);
        System.out.println();
    }

}

class mobilePhone extends phone {
    void dail() {
        System.out.println("正在通过移动网络拨打电话....");
    }

    void answer() {
        System.out.println("正在通过移动网络接听电话....");
    }
}

class fixPhone extends phone {
    void dail() {
        System.out.println("正在通过电信固网拨打电话....");
    }

    void answer() {
        System.out.println("正在通过电信固网接听电话....");
    }
}

class cordlessPhone extends fixPhone {
    void move() {
        System.out.println("正在移动通话....");
    }
}

class phoneTest {
    public static void main(String[] args) {
        fixPhone fp = new fixPhone();
        mobilePhone mp = new mobilePhone();
        cordlessPhone cp = new cordlessPhone();

        fp.setNumber(new char[]{'0', '5', '7', '4', '8', '8', '2', '2', '2', '0', '9', '6'});
        fp.getNumber();
        fp.dail();
        fp.answer();

        mp.setNumber(new char[]{'1', '5', '7', '8', '8', '2', '2', '2', '0', '9', '6'});
        mp.getNumber();
        mp.dail();
        mp.answer();

        cp.setNumber(new char[]{'2', '0', '9', '6'});
        cp.getNumber();
        cp.dail();
        cp.answer();
        cp.move();
    }
}