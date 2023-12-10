package main.com.t1;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t1 {

    static Logger logger = LogManager.getLogger(t1.class.getName());

    public static void main(String[] args) {
        for(int i=0; i< 10; i++) {
            logger.info(">{}",i);
            System.out.println(i);
        }
    }

}