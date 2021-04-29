package ObjectOrientedDesign.LinkedIn.entities;

import ObjectOrientedDesign.LinkedIn.entities.Company;
import ObjectOrientedDesign.LinkedIn.entities.Member;
import java.util.List;

public class Page {

    private Integer pageId;
    private static Integer counter = 0;
    private Company company;
    private Member createdBy;

    private List<Integer> jobPostings;

}
