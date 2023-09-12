package restrospace.restrospace.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import restrospace.restrospace.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @Query(value = "select * from Restaurant where Restaurant_name=:rname",nativeQuery = true)
    Restaurant findByrestaurant(@Param("rname") String rname);

}
