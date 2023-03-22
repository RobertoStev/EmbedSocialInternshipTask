import javax.swing.*;

public class ReviewSort {
    private JPanel main;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JComboBox comboBox2;
    private JLabel label3;
    private JComboBox comboBox3;
    private JLabel label4;
    private JComboBox comboBox4;
    private JLabel label5;
    private JButton filterButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SortReviews");
        ReviewSort reviewSort = new ReviewSort();
        frame.setContentPane(reviewSort.main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(800,300,400,400);
        frame.setVisible(true);
    }
}
