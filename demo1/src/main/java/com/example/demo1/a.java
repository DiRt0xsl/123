package com.example.demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class a extends JFrame {
    private List<String> students = Arrays.asList("张三", "李四", "王五", "赵六");

    private JTextField TextField;
    private JLabel nameLabel;

    public  a() {
        setTitle("随机抽取学生姓名");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nameLabel = new JLabel("新的幸运儿已经产生");
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        TextField = new JTextField();
        TextField.setPreferredSize(new Dimension(50, 30));
        TextField.setHorizontalAlignment(SwingConstants.CENTER);

        JButton selectButton = new JButton("随机点名");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameLabel.setVisible(true);
                String selectedStudent = selectRandomStudent();
                TextField.setText(selectedStudent);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(nameLabel, BorderLayout.NORTH);
        panel.add(TextField, BorderLayout.CENTER);
        panel.add(selectButton, BorderLayout.SOUTH);

        add(panel);
    }

    private String selectRandomStudent() {
        Random random = new Random();
        int selectedIndex = random.nextInt(students.size());
        return students.get(selectedIndex);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                    a frame = new a();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}