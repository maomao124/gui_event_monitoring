import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project name(项目名称)：GUI之事件监听
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 12:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

class TFFrame2 extends Frame
{
    public TFFrame2()
    {
        TextField tf = new TextField();
        add(tf);
        tf.addActionListener(new TFActionListener2());
        tf.setEchoChar('*');
        pack();
        setVisible(true);
    }
}

class TFActionListener2 implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        TextField tf = (TextField) e.getSource();
        System.out.println(tf.getText());
        tf.setText("");
    }
}


public class test2
{
    public static void main(String[] args)
    {
        new TFFrame2();
    }
}
