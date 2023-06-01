package Chapter07.Example01;

import java.awt.*;
import java.awt.event.*;
/*
 * 用AWT和布局管理器设计如右图所示调色面板，点击加减按钮能改变颜色值中各色的分量，下面面板的颜色同步改变
 */
public class ColorPanel extends Frame implements ActionListener {
    private final Panel pButton;
    private final Panel pColor;
    private final Label lbRed;
    private final Label lbGreen;
    private final Label lbBlue;
    private final TextField tfRed;
    private final TextField tfGreen;
    private final TextField tfBlue;
    private final Button btnRedUp;
    private final Button btnGreenUp;
    private final Button btnBlueUp;
    private final Button btnRedDown;
    private final Button btnGreenDown;
    private final Button btnBlueDown;

    public ColorPanel() {
        super("调色面板");

        pButton = new Panel(new GridLayout(3, 3));
        lbRed = new Label("红色(R):");
        tfRed = new TextField("0");
        btnRedUp = new Button("+");
        btnRedUp.addActionListener(this);
        btnRedDown = new Button("-");
        btnRedDown.addActionListener(this);
        pButton.add(lbRed);
        pButton.add(tfRed);
        pButton.add(btnRedUp);
        pButton.add(new Label(" "));
        pButton.add(new Label(" "));
        pButton.add(btnRedDown);
        lbGreen = new Label("绿色(G):");
        tfGreen = new TextField("0");
        btnGreenUp = new Button("+");
        btnGreenUp.addActionListener(this);
        btnGreenDown = new Button("-");
        btnGreenDown.addActionListener(this);
        pButton.add(lbGreen);
        pButton.add(tfGreen);
        pButton.add(btnGreenUp);
        pButton.add(new Label(" "));
        pButton.add(new Label(" "));
        pButton.add(btnGreenDown);
        lbBlue = new Label("蓝色(B):");
        tfBlue = new TextField("0");
        btnBlueUp = new Button("+");
        btnBlueUp.addActionListener(this);
        btnBlueDown = new Button("-");
        btnBlueDown.addActionListener(this);
        pButton.add(lbBlue);
        pButton.add(tfBlue);
        pButton.add(btnBlueUp);
        pButton.add(new Label(" "));
        pButton.add(new Label(" "));
        pButton.add(btnBlueDown);

        pColor = new Panel();
        pColor.setBackground(Color.BLACK);

        setLayout(new BorderLayout());
        add(pButton, BorderLayout.NORTH);
        add(pColor, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int r = Integer.parseInt(tfRed.getText());
        int g = Integer.parseInt(tfGreen.getText());
        int b = Integer.parseInt(tfBlue.getText());
        if (e.getSource() == btnRedUp) {
            r = Math.min(255, r + 10);
        } else if (e.getSource() == btnRedDown) {
            r = Math.max(0, r - 10);
        } else if (e.getSource() == btnGreenUp) {
            g = Math.min(255, g + 10);
        } else if (e.getSource() == btnGreenDown) {
            g = Math.max(0, g - 10);
        } else if (e.getSource() == btnBlueUp) {
            b = Math.min(255, b + 10);
        } else if (e.getSource() == btnBlueDown) {
            b = Math.max(0, b - 10);
        }
        tfRed.setText(String.valueOf(r));
        tfGreen.setText(String.valueOf(g));
        tfBlue.setText(String.valueOf(b));
        Color color = new Color(r, g, b);
        pColor.setBackground(color);
    }

    public static void main(String[] args) {
        new ColorPanel();
    }
}