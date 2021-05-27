package ObjectOrientedDesign.ATM;

import ObjectOrientedDesign.ATM.enums.Denomination;

public interface AdminAtmSystem {

    Double addMoney(Integer count, Denomination denomination);

    Double removeMoney(Integer count, Denomination denomination);

}
