package quoters.model;

import javax.annotation.PostConstruct;

public class T1000 extends TerminatorQuoter {
    @Override
    @PostConstruct
    public void sayQuote() {
        System.out.println("I'm T1000");
    }
}
