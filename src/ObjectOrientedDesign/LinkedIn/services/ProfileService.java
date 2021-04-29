package ObjectOrientedDesign.LinkedIn.services;

import ObjectOrientedDesign.LinkedIn.entities.Member;
import ObjectOrientedDesign.LinkedIn.entities.Profile;

public interface ProfileService {

    Profile createProfile(Profile profile, Integer memberId);

    Profile updateProfile(Profile profile, Integer memberId);

}
