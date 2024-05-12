import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    private static JTextField mainDateField;
    private static JTextField daysField;
    private static JTextField monthsField;
    private static JTextField yearsField;
    private static JTextField resultField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Date Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();

        JLabel mainDateLabel = new JLabel("Основная дата (гггг-мм-дд): ");
        mainDateField = new JTextField(10);

        JLabel daysLabel = new JLabel("Дни:");
        daysField = new JTextField(5);

        JLabel monthsLabel = new JLabel("Месяцы:");
        monthsField = new JTextField(5);

        JLabel yearsLabel = new JLabel("Годы:");
        yearsField = new JTextField(5);

        JButton calculateButton = new JButton("Выполнить операции");

        JLabel resultLabel = new JLabel("Результат:");
        resultField = new JTextField(10);

        panel.add(mainDateLabel);
        panel.add(mainDateField);
        panel.add(daysLabel);
        panel.add(daysField);
        panel.add(monthsLabel);
        panel.add(monthsField);
        panel.add(yearsLabel);
        panel.add(yearsField);
        panel.add(calculateButton);
        panel.add(resultLabel);
        panel.add(resultField);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDate mainDate = LocalDate.parse(mainDateField.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                int days = Integer.parseInt(daysField.getText());
                int months = Integer.parseInt(monthsField.getText());
                int years = Integer.parseInt(yearsField.getText());

                LocalDate resultDate = mainDate.plusDays(days).plusMonths(months).plusYears(years);
                resultField.setText(resultDate.toString());
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
