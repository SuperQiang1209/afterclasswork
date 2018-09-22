package com.zhenggq.afterclasswork.pattern.prototype;

import java.util.Arrays;
import java.util.Random;

/**
 * 模拟批量邮件发送
 *
 * @Author: Zhenggq
 * @Date: 2018/9/21 23:22
 * @Description:
 * @Version: 1.0
 */
public class ClientTest {

    public static void main(String[] args) {


        String[] names = {"张三", "李四", "王五", "赵六", "王二麻子", "李二狗", "李狗蛋"};
        String title = "金秋送豪礼";
        String[] content = {"中秋大放送，\", \"全场都两元，\", \"统统两元，\", \"两块钱你买不了上当，\", \"买不了吃亏！！！！！"};

        long start = System.currentTimeMillis();
        Email email = new Email();
        email.setTitle(title);
        email.setContent(Arrays.asList(content));
        try {
            for (int i = 0; i < 100000; i++) {
                Email clone = email.clone();
                clone.setAddress(getEmail());
                clone.setUserName(names[i % 6]);
                SendEmail(clone);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);

    }

    public static void SendEmail(Email email) {
        System.out.println(String.format("%s,女士/先生,%s,%s,%s", email.getUserName(), email.getTitle(), email.getContent().toString(), email.getAddress()));
    }

    public static String getEmail() {

        StringBuilder builder = new StringBuilder();
        Random random = new Random();

        char c;
        int k;
        for (int i = 0; i < 6; i++) {
            k = random.nextInt(25) + 96;
            c = (char) k;
            builder.append(c);
        }

        return builder.append("@163.com").toString();
    }
}
