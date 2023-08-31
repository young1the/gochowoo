package kr.co.chunjae.gochowoo.repository;

import kr.co.chunjae.gochowoo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User findCashByEmail(String email);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("UPDATE User u SET u.cash = :cash WHERE u.id = :id")
    void updateUserNameById(@Param(value = "cash") Long cash, @Param(value = "id") Long id);

}
