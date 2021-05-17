package com.solution.db;


import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import com.solution.bean.Client;
import com.solution.bean.Item;
import com.solution.bean.Shopper;
import com.solution.connection.ConnectionProvider;

public class DBMImpTest {
private DBMImp db=new DBMImp();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {ConnectionProvider.getConnection();
	}
	@Test
	public void testInsertClient() {
		Client cl=new Client();
		cl.setCid(14);
		cl.setName("Rohit");
		cl.setPassword("osk");
		cl.setPno("9414555442");
           cl.setUsername("rohit21");		
	boolean	ex=true;
	boolean ac=db.insertClient(cl);
	assertEquals(ex, ac);
	//fail("Not yet implemented");
	}
	@Test
	public void testUpdateClient(){
		Client cl=new Client();
		cl.setCid(12);
		cl.setName("Ishan");
	cl.setPassword("pass");
	cl.setPno("7441548146");
	cl.setUsername("ishu36");	
	boolean ex=true;
	boolean ac=db.updateClient(cl);
	assertEquals(ex, ac);
	}
	@Test
	public void testInsertShopper()
	{Shopper sp=new Shopper();
	sp.setUsername("Tarun66");
	sp.setAddress("45, Tilak Nagar ,Agra Uttar Pradesh");
	sp.setCity("Agra");
	sp.setCountry("India");
	sp.setName("Tarun Singh");
	sp.setPno("8422145689");
	sp.setPassword("pass");
	sp.setState("Uttar Pradesh");
	sp.setSid(18);
		boolean ex=true;
		boolean ac=db.insertShopper(sp);
		assertEquals(ex,ac);
	}
    @Test 
    public void testUpdateShopper()
    {Shopper sp=new Shopper();
    	sp.setAddress("34, Gandhi Nagar");
         sp.setCity("Delhi");
         sp.setCountry("India");
         sp.setName("Vikas");
         sp.setPassword("pass");
        sp.setPno("9455621354");
        sp.setSid(5);
        sp.setState("Delhi");
        sp.setUsername("Vik89");
        
    }
    @Test
    public void testAddItem()
    {Item it=new Item();
    it.setItemname("Tomato");
    it.setIid(16);
    it.setOneunitsize(1);
    it.setPrice(42);	
    it.setQuantity(20);
    it.setUnit("1");
    it.setCategory("Vegetables");
    it.setDname("Tomato");
    it.setUsername("vik89");
    	
    }
	
    @Test
    public void testUpdateItem()
   
    {Item it=new Item();
    it.setItemname("Lady Fing");
    it.setCategory("Vegetables");
    it.setIid(16);
    it.setOneunitsize(1);
    it.setUnit("1");
     it.setPrice(35);
    it.setUsername("vik89");
    it.setDname("Lady Finger");
    it.setQuantity(18);
    }
	@Test
	public void testInsertLog()
	{Item it=new Item();
	it.setItemname("Tomato");
    it.setIid(16);
    it.setOneunitsize(1);
    it.setPrice(42);	
    it.setQuantity(20);
    it.setUnit("1");
    it.setCategory("Vegetables");
    it.setDname("Tomato");
    it.setUsername("vik89");
	}

	@Test
public	void testGetClient() throws ClassNotFoundException, SQLException {
		String username = "rajesh23";
		Client cl=null;
		cl = db.getClient(username);
		boolean expected = true;
		boolean actual = false;
		if (!cl.getName().equals(null))
				actual=true;
		assertEquals(expected, actual);
	}
	

	@Test
public	void testGetShopper() throws ClassNotFoundException, SQLException {
		String userName = "nishant23";
		Shopper sp = null;
		boolean expected = true;
		boolean actual = false;
		sp=db.getShopper(userName);
			if (!sp.getName().equals(null)) {
				actual = true;
			}
			assertEquals(expected, actual);
}
	
	@Test
	public void testGetItem() throws ClassNotFoundException, SQLException {
		String ItemName = "potato1kg";
		Item it=new Item();
		boolean expected = true;
		boolean actual = false;
	it=db.getItem(ItemName);
			if (!it.getDname().equals(null)) {
				actual = true;
			}
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetUserItems()
	{String ItemName = "potato1kg";
		Item it=new Item();
		ArrayList<Item> itLis = new ArrayList<Item>();
		itLis = db.getUserItems(ItemName);
		boolean expected = true;
		boolean actual = false;
		for (int i = 0; i < itLis.size(); i++) {
			if (!itLis.get(i).getItemname().equals(null)) {
				actual = true;
			}
		}
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategory() throws ClassNotFoundException, SQLException {
		String  dnam = "onion"
		Item item=new Item();
		ArrayList<Item> l = new ArrayList<Item>();
		l = db.getCategory();
		boolean expected = true;
		boolean actual = false;
		for (int i = 0; i < l.size(); i++) {
			if (!l.get(i).getItemname().equals(null)) {
				actual = true;
			}
		}
		assertEquals(expected, actual);}
	
	@Test
	public void testGetAllITemsFromCategory()throws ClassNotFoundException, SQLException{
		String category="Food";
		Item it=new Item();
		ArrayList<Item> il = new ArrayList<Item>();
		vegItems = db.getAllItemsFromCategory(category);
		boolean expected = true;
		boolean actual = false;
		for (int i = 0; i < il.size(); i++) {
			if (!il.get(i).getDname().equals(null)) {
				actual = true;
			}
		}
		assertEquals(expected, actual);
		
		
	
	
	
	
	
	}
		
		/*@Test
		void readVegItemTest() throws ClassNotFoundException, SQLException {
			String dietName = "Fitness Plan";
			ArrayList<VegItems> vegItems = new ArrayList<VegItems>();
			vegItems = vegItemsService.readVegItems(dietName);
			boolean expected = true;
			boolean actual = false;
			for (int i = 0; i < vegItems.size(); i++) {
				if (!vegItems.get(i).getItemName().equals(null)) {
					actual = true;
				}
			}
			assertEquals(expected, actual);
		}*/
		
	
	
	
	
	
}
