//package com.skcet.day1.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.skcet.day1.model.UserModel;
//
//public interface Repository extends JpaRepository<UserModel,Integer> {
//
//	boolean existsByEmail(String email);
//	Optional<UserModel>fingById(Long id);
//	void deleteById(Long id);
//	@Query("select u from UserModel u")
//	List<UserModel> findAllQuery();
//	@Query("select u from UserModel u where u.email = email ")
//	UserModel findByEmail(@Param("email") String email);
//	@Query("select u from UserModel u where u.email =?1 and u.id=?2and u.name=?3 ")
//	UserModel findByEmailPlace(String email,int id,String name);
//	UserModel getEmail(String email);
//}
package com.sunil.RestapiD.day6.repository6;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sunil.RestapiD.day6.model6.Child;

import jakarta.persistence.criteria.Order;
import jakarta.transaction.Transactional;
@org.springframework.stereotype.Repository
public interface ChildRepo extends JpaRepository<Child, Integer>{
	//native Query
	@Query(value = "select * from children_details",nativeQuery = true)
	public List<Child> getAllRows();
	
	@Query(value = "select * from children_details where address =:addr and name =:name" ,nativeQuery = true)
	public List<Child> getSpecRows(@Param("addr") String addr,@Param("name") String name);
	
	//get by char
	@Query (value = "select * from children_details where name like %?1%",nativeQuery = true)
	public List<Child> getByname(@Param("name") String name);
	
	//delete using native query
	@Modifying
	@Transactional
	@Query(value = "delete from children_details where id=:id",nativeQuery = true)
	public int deleteId(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="update children_details set address=:addr where id=:id",nativeQuery = true)
	public int updateById(String addr, @Param("id") int id);

	public void save(Order t);

}

