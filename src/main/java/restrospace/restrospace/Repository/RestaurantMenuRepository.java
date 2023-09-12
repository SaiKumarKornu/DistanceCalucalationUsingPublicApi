package restrospace.restrospace.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import restrospace.restrospace.Dto.RestaurantMenuDto;
import restrospace.restrospace.entities.RestaurantMenu;

public interface RestaurantMenuRepository extends JpaRepository<RestaurantMenu,Integer> {

    @Query(value="select * from Restaurant_menu WHERE Restaurant_id =:rId  AND Food_name =:fname ;",nativeQuery = true)
    RestaurantMenu findByIdAndItem(@Param("rId") int rId, @Param("fname") String fname);

}


