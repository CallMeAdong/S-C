package cn.s_c.bl.supplier;

import cn.s_c.blservice.supplier.SupplierBlService;
import cn.s_c.dataservice.suppiler.SupplierDataService;
import cn.s_c.entity.supplier.Supplier;
import cn.s_c.util.Convertor;
import cn.s_c.vo.ResultMessage;
import cn.s_c.vo.supplier.SupplierLoginVo;
import cn.s_c.vo.supplier.SupplierSignUpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierBlServiceImpl implements SupplierBlService {
    @Autowired
    private SupplierDataService supplierDataService;

    /**
     * for supplier to log in
     *
     * @param supplierLoginVo the username and password of the supplier
     * @return whether the operation is success or not
     */
    @Override
    public ResultMessage login(SupplierLoginVo supplierLoginVo) {
        String password = supplierDataService.getPasswordByUsername(supplierLoginVo.getUsername());
        if (password == null) {
            return ResultMessage.DataError;
        } else if (password.equals(supplierLoginVo.getPassword())) {
            return ResultMessage.Success;
        } else {
            return ResultMessage.DataError;
        }
    }

    /**
     * for supplier to sign up
     *
     * @param supplierSignUpVo the sign up information of the supplier
     * @return whether the operation is success or not
     */
    @Override
    public ResultMessage signUp(SupplierSignUpVo supplierSignUpVo) {
        if (supplierDataService.isUsernameExisted(supplierSignUpVo.getUsername())) {
            return ResultMessage.DataError;
        } else {
            return supplierDataService.saveSupplierInfo(Convertor.supplierSignUpVoToSupplier(supplierSignUpVo));
        }
    }

    /**
     * get the supplier object by username
     *
     * @param supplierUsername the username of supplier
     * @return the return supplier object
     */
    @Override
    public Supplier getSupplierByUsername(String supplierUsername) {
        return supplierDataService.getSupplierByUsername(supplierUsername);
    }
}
