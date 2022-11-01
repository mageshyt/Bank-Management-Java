package TestScreen;

import HistoryScreen2.paymentDetail;

import javax.swing.*;

public class TestScreen extends  JFrame {
    public TestScreen (){
        paymentDetail paymentDetail1 = new paymentDetail ("send","4000","24 thu","nothing",0,0);
        paymentDetail paymentDetail2 = new paymentDetail("test","test","test","test",0,100);
        JLabel test= new JLabel ("Testing");
        test.setBounds (100,100,200,50);
        //add(test);
        add (paymentDetail1);
        //! add the payment component

        setSize(1000,550);

        setLayout(null);
        setVisible(true);

    }

    // custom component to display hello


}
