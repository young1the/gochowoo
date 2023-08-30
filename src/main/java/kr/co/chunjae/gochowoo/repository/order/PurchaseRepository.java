package kr.co.chunjae.gochowoo.repository.order;

import kr.co.chunjae.gochowoo.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}
