package cn.s_c.data.dao.supplier;

import cn.s_c.entity.supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier, Integer> {

    Supplier findSupplierByUsername(String username);
}
