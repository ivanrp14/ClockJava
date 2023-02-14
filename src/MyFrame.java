
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivanr
 */
public class MyFrame extends JFrame{
    Calendar calendar;
    SimpleDateFormat timeFormat,dayFormat,dateFormat;
    JLabel timeLabel,dayLabel,dateLabel;
    String time,day,date;
    MyFrame() throws InterruptedException{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);
        this.setForeground(Color.BLACK);
        this.setBackground(Color.BLACK);
        this.getContentPane().setBackground(Color.BLACK);
        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dayLabel = new JLabel();
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateLabel = new JLabel();
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.BOLD,40));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        dayLabel.setFont(new Font("Verdana",Font.BOLD,40));
        dayLabel.setForeground(new Color(0x00FF00));
        dayLabel.setBackground(Color.black);
        dayLabel.setOpaque(true);
        dateLabel.setFont(new Font("Verdana",Font.BOLD,40));
        dateLabel.setForeground(new Color(0x00FF00));
        dateLabel.setBackground(Color.black);
        dateLabel.setOpaque(true);
        time = timeFormat.format(Calendar.getInstance().getTime());
        day = dayFormat.format(Calendar.getInstance().getTime());
        date = dateFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        dayLabel.setText(day);
        dateLabel.setText(date);
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        
        setTime();
    }
    public void setTime() throws InterruptedException{
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            Thread.sleep(1000);
        }
    }
}
