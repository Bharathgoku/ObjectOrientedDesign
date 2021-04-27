package ObjectOrientedDesign.Cricinfo.entites;

import ObjectOrientedDesign.Cricinfo.enums.DeliveryType;

public class Ball {

    private Integer score;
    private Run run;
    private Commentary commentary;
    private Wicket wicket;
    private Integer playedBy;
    private Integer balledBy;

    public class Commentary{

        private String text;

        private String commentator;

    }

}
