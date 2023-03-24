/*
 * package com.tim.repository;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.query.Param;
 * 
 * import com.tim.entity.Application_Tbl;
 * 
 * // For every entity separate repository is to be created public interface
 * ApplicationRepository extends JpaRepository<Application_Tbl, Integer> {
 * 
 * // Optional<Application_Tbl> findByIdAndName(int id, String name);
 * 
 * @Query(value =
 * "select app from Application_Tbl app where application_name=:name ")
 * Optional<Application_Tbl> findByApplicationName(@Param("name") String name);
 * }
 */