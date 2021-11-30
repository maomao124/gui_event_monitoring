
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project name(项目名称)：GUI之事件监听
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 12:30
 * Version(版本): 1.0
 * Description(描述)： 无
 */

class Monitor implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("a button has been pressed");
    }
}

public class test
{
    public static void main(String[] args)
    {
        Frame frame = new Frame("测试");
        frame.setBounds(100, 100, 500, 500);
        Button button = new Button("button");
        button.setSize(200, 200);
        Monitor monitor = new Monitor();
        button.addActionListener(monitor);
        frame.add(button, BorderLayout.CENTER);
        //frame.pack();
        frame.setVisible(true);
    }
}
