package edu.eci.pdsw.sampleprj.dao.mybatis.mappers;


import edu.eci.pdsw.samples.entities.Item;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2106913
 */
public interface ItemMapper {
    
    
    public List<Item> consultarItems();
    
    public Item consultarItem(int id);
    
    public void insertarItem(Item it);

    public List<Item> consultarDisponibles();
    
   public void insertarItem(int id,String nombre,String descri,Date fechala,long tarifa,String formato,String genero, int idinit);
}
