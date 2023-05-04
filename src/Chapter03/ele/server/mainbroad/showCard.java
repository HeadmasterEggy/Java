package Chapter03.ele.server.mainbroad;
import Chapter03.ele.computer.mainbroad.VGACard;
/*
 * 在server的包的mainbroad包中的showCard类是继承自VGACard,请测试showCard的show()功能
 */
public class showCard extends VGACard {
    public static void main(String[] args) {
        showCard s1 = new showCard();
        s1.show();
    }
}
