import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Calculator extends Frame implements ActionListener{
    TextField textField = new TextField();
    TextField textFieldB = new TextField();
    TextField textFieldS = new TextField();
    public Calculator(){
        setTitle("Калькулятор суммы");
        setLayout(null);
        setSize(300,400);
        setVisible(true);

        Label labelA = new Label("a");
        labelA.setSize(30,30);
        labelA.setLocation(50,50);
        textField.setSize(100,30);
        textField.setLocation(100,50);
        add(labelA);
        add(textField);

        Label labelB = new Label("b");
        labelB.setSize(30,30);
        labelB.setLocation(50,100);
        textFieldB.setSize(100,30);
        textFieldB.setLocation(100,100);
        add(labelB);
        add(textFieldB);

        Label labelS = new Label("summa");
        labelS.setSize(50,30);
        labelS.setLocation(50,150);
        textFieldS.setSize(100,30);
        textFieldS.setLocation(100,150);
        add(labelS);
        add(textFieldS);

        Button calcS = new Button("Calculate");
        calcS.setSize(100,30);
        calcS.setLocation(100,200);
        calcS.addActionListener(this);
        add(calcS);

        Button clearS = new Button("Clear");
        clearS.setSize(100,30);
        clearS.setLocation(100,240);
        clearS.addActionListener(this);
        add(clearS);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")){
            Double a = Double.parseDouble(textField.getText().replaceAll(",", "."));
            Double b = Double.parseDouble(textFieldB.getText().replaceAll(",", "."));
            textFieldS.setText(String.valueOf(a+b));
        } else{
            textField.setText(" ");
            textFieldB.setText(" ");
            textFieldS.setText(" ");
        }
    }
    public static void main(String[] args){
        new Calculator();
    }
}
